import java.util.*;
public class Program3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int [][] matrix = new int[size][size];
        Random rand = new Random();
        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j < size ; j++){
                int num = rand.nextInt(2);
                matrix[i][j] = num; 
            }
        }
        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j < size ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        checkRow(matrix);
        checkCol(matrix);
        checkDiag(matrix);
        checkSub(matrix);
        checkSuper(matrix);
        
        input.close();
    }
    public static void checkRow(int[][] matrix){
        boolean all_equal_0=false,all_equal_1=false,havesame=false;
        int size = matrix.length;
        //check 0
        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j < size-1 ; j++){
                if(matrix[i][j] == 0 && matrix[i][j] == matrix[i][j+1]){
                    all_equal_0 = true;
                }
                else{
                    all_equal_0 = false;
                    break;
                }
            }
            if(all_equal_0){
                System.out.println("All 0s on row " + (i+1));
                havesame=true;
            }
        }
        //check 1
        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j < size-1 ; j++){
                if(matrix[i][j] == 1 && matrix[i][j] == matrix[i][j+1]){
                    all_equal_1 = true;
                }
                else{
                    all_equal_1 = false;
                    break;
                }
            }
            if(all_equal_1){
                System.out.println("All 1s on row " + (i+1));
                havesame=true;
            }
        }
        if(!havesame){
            System.out.println("No same numbers on a row.");
        } 
    }
    public static void checkCol(int[][] matrix){
        boolean all_equal_0=false,all_equal_1=false,havesame=false;
        int size = matrix.length;
        //check 0
        for(int j = 0 ; j < size ; j++){
            for(int i = 0 ; i < size-1 ; i++){
                if(matrix[i][j] == 0 && matrix[i][j] == matrix[i+1][j]){
                    all_equal_0 = true;
                }
                else{
                    all_equal_0 = false;
                    break;
                }
            }
            if(all_equal_0){
                System.out.println("All 0s on colume " + (j+1));
                havesame=true;
            }
        }
        //check 1
        for(int j = 0 ; j < size ; j++){
            for(int i = 0 ; i < size-1 ; i++){
                if(matrix[i][j] == 1 && matrix[i][j] == matrix[i+1][j]){
                    all_equal_1 = true;
                }
                else{
                    all_equal_1 = false;
                    break;
                }
            }
            if(all_equal_1){
                System.out.println("All 1s on colume " + (j+1));
                havesame=true;

            }
        } 
        if(!havesame){
            System.out.println("No same numbers on a colume.");
        }
    }
    public static void checkDiag(int[][] matrix){
        boolean all_equal_0=false,all_equal_1=false;
        int size = matrix.length;
        //check 0
        for(int i = 0 ; i < size-1 ;i++){
            if(matrix[i][i] == 0 && matrix[i][i] == matrix[i+1][i+1]){
                all_equal_0 = true;
            }
            else{
                all_equal_0 = false;
                break;
            }
        }
        if(all_equal_0){
            System.out.println("All 0s on diagonal ");
        }
        //check 1
        for(int i = 0 ; i < size-1 ;i++){
            if(matrix[i][i] == 1 && matrix[i][i] == matrix[i+1][i+1]){
                all_equal_1 = true;
            }
            else{
                all_equal_1 = false;
                break;
            }
        }
        if(all_equal_1){
            System.out.println("All 1s on diagonal ");
        }
        if(!(all_equal_0 || all_equal_1)){
            System.out.println("No same numbers on the diagonal.");
        }
    }
    public static void checkSub(int[][]matrix){
        boolean all_equal_0=false,all_equal_1=false;
        int size = matrix.length;
        //check 0
        for(int i = 1 , j = 0; i < size-1 ; i++,j++){
            if(matrix[i][j] == 0 && matrix[i][j] == matrix[i+1][j+1]){
                all_equal_0 = true;
            }
            else{
                all_equal_0 = false;
                break;
            }
        }
        if(all_equal_0){
            System.out.println("All 0s on subdiagonal ");
        }
        //check 1
        for(int i = 1 , j = 0; i < size-1 ; i++,j++){
            if(matrix[i][j] == 1 && matrix[i][j] == matrix[i+1][j+1]){
                all_equal_1 = true;
            }
            else{
                all_equal_1 = false;
                break;
            }
        }
        if(all_equal_1){
            System.out.println("All 1s on subdiagonal ");
        }
        if(!(all_equal_0 || all_equal_1)){
            System.out.println("No same numbers on the subdiagonal.");
        }
    }
    public static void checkSuper(int[][]matrix){
        boolean all_equal_0=false,all_equal_1=false;
        int size = matrix.length;
        //check 0
        for(int i = 0 , j = 1; j < size-1 ; i++,j++){
            if(matrix[i][j] == 0 && matrix[i][j] == matrix[i+1][j+1]){
                all_equal_0 = true;
            }
            else{
                all_equal_0 = false;
                break;
            }
        }
        if(all_equal_0){
            System.out.println("All 0s on superdiagonal ");
        }
        //check 1
        for(int i = 0 , j = 1; j < size-1 ; i++,j++){
            if(matrix[i][j] == 1 && matrix[i][j] == matrix[i+1][j+1]){
                all_equal_1 = true;
            }
            else{
                all_equal_1 = false;
                break;
            }
        }
        if(all_equal_1){
            System.out.println("All 1s on superdiagonal ");
        }
        if(!(all_equal_0 || all_equal_1)){
            System.out.println("No same numbers on the superdiagonal.");
        }
    }
}
