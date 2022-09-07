public class Product {
    private String name;
    private int quantity;
    private double price;
    private static double income;
    private static int numberofAllProduct;
    private static double priceofAllProduct;
    public static final String DEFAULT_NAME = "Product";
    public static final int DEFAULT_QUANTITY = 0;
    public static final double DEFAULT_PRICE = 0;
    Product(){
        this(DEFAULT_NAME,DEFAULT_QUANTITY,DEFAULT_PRICE);
    }
    Product(String name ,int quantity,double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.priceofAllProduct+=price*quantity;
        this.numberofAllProduct+=quantity;
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPricePerUnit() {
        return price;
    }
    public double getTotalPrice() {
        return price*quantity;
    }
    public double exportProduct(int quantity){
        if(quantity<=this.quantity){
            income +=this.price*quantity;
            this.quantity-=quantity;
            this.priceofAllProduct-=income;
            this.numberofAllProduct-=quantity;
            System.out.println("Export "+ name +" : "+quantity+" value "+price*quantity+" $");
        }
        else{
            System.err.println("To much of unit to export!");
        }
        return income;
    }
    public static int getNumberofAllProduct() {
        return numberofAllProduct;
    }
    public static double getPriceofAllProduct() {
        return priceofAllProduct;
    }
    
    public static double getIncome() {
        return income;
    }
    @Override
    public String toString() {
        return "Product [name=" + name + ", price/unit=" + price +", price of all =" + price*quantity + ", quantity=" + quantity + "]";
    }
    
}
