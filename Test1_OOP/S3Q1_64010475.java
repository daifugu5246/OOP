import java.util.*;

public class S3Q1_64010475 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = input.nextInt();
        if (size >= 5) {
            int[][] matrix = new int[size][size];
            int[]position = new int[2];
            System.out.println("Random matrix is :");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    int num = rand.nextInt(6);
                    matrix[i][j] = num;
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.print("Please input your value row and colume : ");
            for(int i = 0 ; i < position.length ; i++){
                position[i] = input.nextInt();
            }
            String temp = input.nextLine();
            int row = position[0];
            int colume = position[1];
            if(row < size && colume < size){
                System.out.print("The selected member is ");
                System.out.println(matrix[row][colume]);
                //Top
                if(row > 0){
                    int top = 1;
                    for(int i = row-1 ; i >= 0 ; i--){
                        top *= matrix[i][colume];
                    }
                    System.out.print("(i)Product of member on Top : ");
                    System.out.println(top);
                }
                else{
                    System.err.println("(i)Product of member on Top : NO");
                }
                //Right
                if(colume < size-1){
                    int right = 1;
                    for(int i = colume+1 ; i < size ; i++){
                        right *= matrix[row][i];
                    }
                    System.out.print("(ii)Product of member on Right : ");
                    System.out.println(right);
                }
                else{
                    System.err.println("(ii)Product of member on Right : NO");
                }
                //Bottom
                if(row < size-1){
                    int bottom = 1;
                    for(int i = row+1 ; i < size ; i++){
                        bottom *= matrix[i][colume];
                    }
                    System.out.print("(iii)Product of member on Bottom : ");
                    System.out.println(bottom);
                }
                else{
                    System.err.println("(iii)Product of member on Bottom : NO");
                }
                //Left 
                if(colume > 0){
                    int left = 1;
                    for(int i = colume-1 ; i >= 0 ; i--){
                        left *= matrix[row][i];
                    }
                    System.out.print("(iv)Product of member on Left : ");
                    System.out.println(left);
                }
                else{
                    System.err.println("(iv)Product of member on Left : NO");
                }
            }
            else{
                System.err.println("Error,row and colume must be < size");
            }
        }
        else{
            System.err.println("Error,size must be >= 5");
        }
        input.close();
    }
}