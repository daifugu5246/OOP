package Program01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Creating circle 1, input radius:");
        Circle c1 = new Circle(input.nextDouble());
        System.out.print("Creating circle 2, input radius:");
        Circle c2 = new Circle(input.nextDouble());
        System.out.println("------------------------");
        System.out.println("The max circle's radius is "+((Circle)GeometricObject.max(c1, c2)).getRadius());
        System.out.println("========================");
        System.out.print("Creating rectangle 1, input width and height:");
        Rectangle r1 = new Rectangle(input.nextDouble(),input.nextDouble());
        System.out.print("Creating rectangle 2, input width and height:");
        Rectangle r2 = new Rectangle(input.nextDouble(),input.nextDouble());
        System.out.println("------------------------");
        System.out.println("The max rectangle's width and height are "+((Rectangle)GeometricObject.max(r1, r2)).getWidth()+" "+((Rectangle)GeometricObject.max(r1, r2)).getHeight());
        System.out.println("========================");
        input.close();
    }
}
