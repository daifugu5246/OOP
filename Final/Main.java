import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try{
            Bread bread1 = new Bread("BRE1", 20, new Date(2022,05,20), Size.S);
            Calculator cal1 = new Calculator("CAL1", 100, 1);
            System.out.println("Bread amount: " + Bread.amountBread);
            System.out.println("Calculator amount: " + Calculator.amountCal);
            System.out.println("Total income: " + Product.totalIncome);
            Product.sale(bread1);
            System.out.println("Bread amount: " + Bread.amountBread);
            System.out.println("Calculator amount: " + Calculator.amountCal);
            System.out.println("Total income: " + Product.totalIncome);
            Product.sale(cal1);
            System.out.println("Bread amount: " + Bread.amountBread);
            System.out.println("Calculator amount: " + Calculator.amountCal);
            System.out.println("Total income: " + Product.totalIncome);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
