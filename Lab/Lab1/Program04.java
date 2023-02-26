import java.util.Scanner;
public class Program04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double bmi;
        System.out.print("Enter your weight in pounds : ");
        Double w = input.nextDouble();
        System.out.print("Enter your Height in inches : ");
        Double h = input.nextDouble();
        w *= 0.45359237; 
        h *= 0.0254;
        bmi = w/(h*h);
        System.out.print("BMI is : " + bmi);
        input.close();
    }
}
