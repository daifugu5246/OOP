package Program01;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){
        dateCreated = new Date();
    }
    public Account(int id ,double balance){
        dateCreated = new Date();
        this.id = id;
        this.balance = balance;
    }
    public int getId(){
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
    public int setId(int id){
        this.id = id;
        return this.id;
    }
    public double setBalance(double balance){
        this.balance = balance;
        return this.balance;
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
    public void withdraw(double amount){
        this.balance -=amount;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public void display(){
        System.out.println("Balance : " + getBalance() + "$");
        System.out.println("Monthly interest : " + getMonthlyInterest() + "$");
        System.out.println("Account created date : " + getDateCreated());
    }
    
}
