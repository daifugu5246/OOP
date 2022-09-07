package Program01.Class;

import java.util.Date;

public abstract class Account {
    protected double balance;
    protected Date dateCreated;

    Account(){
        this(0);
    }
    Account(double balance){
        this.balance=balance;
        dateCreated = new Date();
    }
    public  double deposit(double deposit){
        this.balance += deposit;
        return deposit;
    }
    public abstract double withdraw(double withdraw);
    public double getBalance() {
        return balance;
    }
    public String getDateCreated() {
        return "This accont was created at "+dateCreated.toString();
    }
    @Override
    public String toString() {
        return "Account [balance=" + balance + ", dateCreated=" + dateCreated + "]";
    }
    
}
