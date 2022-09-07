package Program02.Class;

import java.util.ArrayList;
import java.util.Date;

public class Account{
    private String name;
    private String id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction>transactions;

    public Account(){
        this("Unknow","0000",0);
        transactions=new ArrayList<Transaction>();
        dateCreated = new Date();
    }
    public Account(String name,String id ,double balance){
        dateCreated = new Date();
        transactions=new ArrayList<Transaction>();
        this.name = name;
        this.id = id;
        this.balance = balance;
    }
    public String getId(){
        return this.id;
    }
    public double getBalance(){
        return this.balance;
    }
    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }
    public Date getDateCreated(){
        return this.dateCreated;
    }
    public double setAnnualInterestRate(double annualTnterestRate){
        this.annualInterestRate = annualTnterestRate;
        return this.annualInterestRate;
    }
    public double getMonthlyInterestRate(){
        double monthlyInterestRate = this.annualInterestRate / 12;
        return monthlyInterestRate/100;
    }
    public double getMonthlyInterest(){
        double monthlyInterest = (getMonthlyInterestRate()*this.balance);
        return monthlyInterest;
    }
    public void withdraw(double amount,String description){
        if(amount <= balance){
            this.balance -=amount;
            transactions.add(new Transaction('W',amount,balance,description));
        }
        else {
            System.err.println("Error,The amount > balance.");
        }
    }
    public void deposit(double amount,String description){
        this.balance += amount;
        this.transactions.add(new Transaction('D',amount,balance,description));
    }
    public String getName() {
        return name;
    }
    public void displayTransaction(){
        System.out.println("Name : " + name);
        System.out.println("Acount ID : " + id);
        System.out.println("Annual Interestrate :" + annualInterestRate);
        System.out.println("Balance : " + balance);
        System.out.printf("Date\t\t\t\tType\tAmount\tBalance\t\n");
        for(int i = 0 ; i < transactions.size() ; i++){
            System.out.printf(transactions.get(i).getDate()+"\t"+transactions.get(i).getType()+"\t"+transactions.get(i).getAmount()+"\t"+transactions.get(i).getBalance()+"\t\n");
        }
    }
}
