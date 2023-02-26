import java.util.*;
public class Program03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] city = new String[3];
        System.out.print("Enter the first city :");
        city[0] = input.nextLine();
        System.out.print("Enter the second city :");
        city[1] = input.nextLine();
        System.out.print("Enter the third city :");
        city[2] = input.nextLine();
       // Arrays.sort(city);
        for(int i = 0 ; i < 2 ; i++){
            for(int j = i+1 ; j < 3 ; j++){
                if(city[i].charAt(0) > city[j].charAt(0)){
                    String temp = city[j];
                    city[j]=city[i];
                    city[i]=temp;
                }
            }
        }
        for(String a : city){
            System.out.println(a);
        }
        input.close();
    }
}
