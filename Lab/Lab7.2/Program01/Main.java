package Program01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Circle circle = new Circle(8);
      Rectangle rectangle = new Rectangle(3,3);
      Scanner input = new Scanner(System.in);
        System.out.print("Input 3 sides of the triangle : ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        String temp = input.nextLine();
        System.out.print("The color is : ");
        String color = input.next();
        System.out.print("The color is filled (y/n) : ");
        char isFilled = input.next().charAt(0);
        System.out.println("--------------------");
        boolean filled = false;
        switch(isFilled){
            case 'y':
                filled = true;
                break;
            case 'n' :
                filled = false;
                break;
        }
        Triangle triangle = new Triangle(color,filled,side1,side2,side3);
        if(side1 <= 0 || side2 <=0 || side3 <= 0 ){
            System.err.println("Error, side should be > 0.");
        }
        else{
            if(filled){
                GeometricObject.displayObject(triangle);
                System.out.println("--------------------");
            }
            else {
                System.out.println("Error, filled should be (y/n)");
            }
        }
        input.close();
      GeometricObject.displayObject(circle);
      System.out.println("--------------------");
      GeometricObject.displayObject(rectangle);
    }
    
}
