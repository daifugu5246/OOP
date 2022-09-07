package Program01.Class;

public class SavingAccount extends Account {

    private double percentInterest;
    
    public SavingAccount(double percentInterest) {
        this.percentInterest = percentInterest;
    }

    public SavingAccount(double balance, double percentInterest) {
        super(balance);
        this.percentInterest = percentInterest;
    }

    public double getPercentInterest() {
        return percentInterest;
    }

    public double getMonthlyInterest(){
        return balance*((percentInterest/12)/100);
    }

    @Override
    public double withdraw(double withdraw) {
        if(withdraw <= balance){
            this.balance -= withdraw;
        }
        else{
            System.out.println("Error, The amount is more than balance.");
        }
        return withdraw;
    }

    @Override
    public String toString() {
        return "CheckingAccount [balance=" + balance + ", dateCreated=" + dateCreated + ", percentInterest=" + percentInterest + "]";
    }
}
