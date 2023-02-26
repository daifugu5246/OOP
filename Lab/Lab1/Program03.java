import java.util.Scanner;
class Program03{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 0 < num < 1000 : ");
        int num = input.nextInt();
        if(num > 0 && num < 1000){
            num = (num/100) + ((num % 100 )/10) + ((num % 100 )%10);
            System.out.println("The sum of digit : " + num);
        }
        else{
            System.err.println("Out of range.");
        }
        input.close();
    }
}