import java.util.Scanner;
public class Program02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x ;
        double y ;
        System.out.print("Enter a : ");
        Double a = input.nextDouble();
        System.out.print("Enter b : ");
        Double b = input.nextDouble();
        System.out.print("Enter c : ");
        Double c = input.nextDouble();
        System.out.print("Enter d : ");
        Double d = input.nextDouble();
        System.out.print("Enter e : ");
        Double e = input.nextDouble();
        System.out.print("Enter f : ");
        Double f = input.nextDouble();
        System.out.println("The Equation is ");
        System.out.println(a + "x" + " + " + b + "y" + " = " + e);
        System.out.println(c + "x" + " + " + d + "y" + " = " + f);
        x = ((e*d)-(b*f))/((a*d)-(b*c));
        System.out.println("x = "+ x);
        y = ((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("y = "+ y);
        input.close();
    }
}
