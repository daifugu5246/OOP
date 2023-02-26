import java.util.*;
public class Program02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of list1 : ");
        int arr_size1 = input.nextInt();
        System.out.print("Enter list1 : ");
        int [] list1 = new int[arr_size1];
        for(int i = 0 ; i < list1.length ; i++ ){
            list1[i] = input.nextInt();
        }
        String temp = input.nextLine();
        System.out.print("Enter size of list2 : ");
        int arr_size2 = input.nextInt();
        System.out.print("Enter list2 : ");
        int [] list2 = new int[arr_size2];
        for(int i = 0 ; i < list2.length ; i++ ){
            list2[i] = input.nextInt();
        }
        temp = input.nextLine();
        System.out.print("The merged list is ");
        for(int item : merge(list1,list2) ){
            System.out.print(item + " ");
        }
        input.close();
    }
    public static int [] merge (int[] list1,int[] list2 ) {
        int[] merged = new int[list1.length+list2.length];
        System.arraycopy(list1, 0, merged, 0, list1.length);
        System.arraycopy(list2, 0, merged, list1.length, list2.length);
        Arrays.sort(merged);
        return merged;
    }
}
