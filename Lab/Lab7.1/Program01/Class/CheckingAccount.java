package Program01.Class;

public class CheckingAccount extends Account {

    private double overdraft;
    
    public CheckingAccount(double overdraft) {
        this.overdraft = overdraft;
    }

    public CheckingAccount(double balance, double overdraft) {
        super(balance);
        this.overdraft = overdraft;
    }
    public double getOverdraft(){
        return overdraft;
    }
    @Override
    public double withdraw(double withdraw) {
        if(withdraw <= balance+overdraft){
            this.balance -= withdraw;
        }
        else{
            System.out.println("Error, The amount is more than overdraft.");
        } 
        return withdraw;
    }
    @Override
    public String toString() {
        return "CheckingAccount [balance=" + balance + ", dateCreated=" + dateCreated + ", overdraft=" + overdraft + "]";
    }
    
}
