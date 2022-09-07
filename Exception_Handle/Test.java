
import java.util.Scanner;

class Test {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		double num = input.nextDouble()*0.000000001;
		System.out.printf("%.9f",num);
		input.close();
	}
}
