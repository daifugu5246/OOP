public class Product implements Comparable<Product>{
    private String productCode;
    private double price;
    static protected int amount;
    static protected double totalIncome;

    Product(){
        Product.amount++;
    }
    Product(String productCode , double price){
        this.price = price;
        this.productCode = productCode;
        Product.amount++;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getAmount() {
        return amount;
    }
    
    public String getProductCode() {
        return productCode;
    }
    static public void sale(Product product){
        if(product instanceof Bread){
           Bread bread = (Bread)product;
           switch(bread.getSize()){
               case S : 
               Product.amount--;
               Bread.amountBread--;
               Product.totalIncome += bread.getPrice();
               System.out.println("sale the " + bread.toString());
               break;
               case M :
               Product.amount--;
               Bread.amountBread--;
               Product.totalIncome += bread.getPrice()+5;
               System.out.println("sale the " + bread.toString());
               break;
               case L :
               Product.amount--;
               Bread.amountBread--;
               Product.totalIncome += bread.getPrice()+8;
               System.out.println("sale the " + bread.toString());
               break;
           }
        }
        else if(product instanceof Calculator){
            Calculator cal = (Calculator)product;
            Product.amount--;
            Calculator.amountCal--;
            Product.totalIncome += cal.getPrice();
            System.out.println("sale the" + cal.toString());
        }
    }

    @Override
    public int compareTo(Product o) {
        if(o.productCode == this.productCode){
            return 1;
        }
        else{
            return 0;
        }
    }
    @Override
    public String toString() {
        return "Product [amount=" + amount + ", code=" + productCode + ", price=" + price + "]";
    }
    
}
