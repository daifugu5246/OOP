import java.util.*;
public class Program04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of line : ");
        int num = input.nextInt();
        if(num<=15){
            for(int i = 0 ; i < num ;i++){
                for(int l = num ; l > i+1 ; l--){
                    System.out.print("  ");
                }
                for(int k = i+1 ; k > 1 ; k--){
                    System.out.print(k + " ");
                }
                for(int j = 0 ; j < i+1 ; j++){
                    System.out.print(j+1 + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Error, number must be 0-15");
        }
        input.close();
    }
}
