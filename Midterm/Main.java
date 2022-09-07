import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Product[] products = new Product[3];
        products[0]=new Product("Oil",500,100);
        products[1]=new Product("Semicondutor",1000,75);
        products[2]=new Product("Car",10,100000);
        System.out.println("[Export system]");
        System.out.println("List of Product");
        for(int i = 0 ; i < products.length ; i++){
            System.out.println(products[i].toString());
        }
        System.out.println("Unit of all product : "+Product.getNumberofAllProduct());
        System.out.println("Price of all product : "+Product.getPriceofAllProduct());
        System.out.println("Income : "+Product.getIncome()+" $");
        System.out.print("Enter name/quantity of product : ");
        String name = input.next();
        int quantity = input.nextInt();
        for(int i = 0 ; i < products.length ; i++){
            if(name.equals(products[i].getName())){
                products[i].exportProduct(quantity);
                System.out.println(products[i].toString());
                System.out.println("Unit of all product : "+Product.getNumberofAllProduct());
                System.out.println("Price of all product : "+Product.getPriceofAllProduct());
                System.out.println("Income : "+Product.getIncome()+" $");
            }
        }
    }
}
