
public class Calculator extends Product{
    private double warrantyYear;
    static public int amountCal;
    Calculator(){
        super();
        Calculator.amountCal++;
    }
    Calculator(String productCode , double price,double warrantyYear){
        super(productCode , price);
        this.warrantyYear = warrantyYear; 
        Calculator.amountCal++;
    }
    
    public double getWarrantyYear() {
        return warrantyYear;
    }
    @Override
    public String toString() {
        return super.toString() + "Calculator [warrantyYear=" + warrantyYear + "]";
    }
    
}
