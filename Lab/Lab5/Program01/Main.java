package Program01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account ac1 = new Account(1122,20000);
        ac1.setAnnualInterestRate(4.5);
        System.out.print("Choose your service [1]deposit [2]withdraw : ");
        int service = input.nextInt();
        if(service >= 1 && service <= 2){
            if(service == 1){
                System.out.print("Enter amount to deposit : ");
                double amount = input.nextDouble();
                if(amount > 0){
                    ac1.deposit(amount);
                    ac1.display();
                }
                else {
                    System.err.println("Error,The amount can't be zero or nagative.");
                }
            }
            if(service == 2){
                System.out.print("Enter amount to withdraw : ");
                double amount = input.nextDouble();
                if(amount > 0 && amount <= ac1.getBalance()){
                    ac1.withdraw(amount);
                    ac1.display();
                }
                else if (amount <= 0){
                    System.err.println("Error,The amount can't be zero or nagative.");
                }
                else if (amount > ac1.getBalance()){
                    System.err.println("Error,The amount is over than your balance.");
                }
            }
        }
        else {
            System.out.println("Error ,Enter only [1] or [2].");
        }
        
        input.close();
    }
}
