package Program01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BMI bmi ;
        int w_type,h_type;
        System.out.print("Enter name and age : ");
        String name = input.next();
        int age = input.nextInt();
        System.out.print("Weight (input format: 1=kg 2=pound value) : ");
        w_type = input.nextInt();
        double weight = input.nextDouble();
        switch(w_type){
            case 1:
                break;
            case 2:
                weight=weight*0.45359237;
                break;
            default:
                System.out.println("Error ,input format should be (1) or (2).");
                break;
        }
        System.out.print("Height (input format: 1=meter 2=feet-inch) : ");
        h_type = input.nextInt();
        double feet = 0;
        double inches = 0;
        double height = 0;
        switch(h_type){
            case 1 :
                height = input.nextDouble();
                inches = height/0.0254;
                break;
            case 2 :
                feet = input.nextDouble();
                inches = input.nextDouble();
        }
        bmi = new BMI(name,age,weight,feet,inches);
        System.out.printf("Your BMI : %.2f \n",bmi.getBMI());
        System.out.println("Interpretation : " + bmi.getInterpretation());
        input.close();
    }
}
