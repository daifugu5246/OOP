package Program01.Main;

import Program01.Class.*;


public class Main {
    public static void main(String[] args) {
        SavingAccount sac1 = new SavingAccount(5000, 1.5);
        CheckingAccount cac1 = new CheckingAccount(5000, 5000);
        //Saving
        System.out.println("-Saving Account-");
        System.out.println("Balance : "+sac1.getBalance());
        System.out.println("Deposit : "+sac1.deposit(1000));
        System.out.println("Balance : "+sac1.getBalance());
        System.out.println("Withdraw : "+sac1.withdraw(5000));
        System.out.println("Balance : "+sac1.getBalance());
        System.out.println("------------------------------------");
        //Checking
        System.out.println("-Checking Account-");
        System.out.println("Balance : "+cac1.getBalance());
        System.out.println("Overdraft : "+cac1.getOverdraft());
        System.out.println("Withdraw : "+cac1.withdraw(10000));
        System.out.println("Balance : "+cac1.getBalance());
    }
}
