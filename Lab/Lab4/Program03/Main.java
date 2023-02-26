package Program03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        double [][] num1 = new double[100][10];
        int [][] num2 = new int[100][10];
        //Random Element
        createList(num1);
        watch.start();
        System.out.println("Sorting stopwatch starts...");
        sort(num1);
        watch.stop();
        System.out.print("Sorting stopwatch stoped.");
        System.out.println("The sort time is " + watch.getElapsedTime() + " milliseconds.");
        System.out.println("------------------------------------------------------------");
        //PalindromePrime
        watch.start();
        System.out.print("The palindromPrime stopwatch starts...");
        creatPrimePalindrome(num2);
        watch.stop();
        System.out.print("The palindromPrime stopwatch stoped.");
        System.out.println("The palindromPrime time is " + watch.getElapsedTime() + " milliseconds.");
    }

    public static void createList(double [][] arr){
        System.out.println("Creating a list containing 1000 elements,");
        Random random = new Random();
        for(int i = 0 ; i < 100 ; i++){
            for(int j = 0 ; j < 10 ; j++){
                arr[i][j] = random.nextDouble(1000);
            }
        }
        for(int i = 0 ; i < 100 ; i++){
            for(int j = 0 ; j < 10 ; j++){
                System.out.printf("%.2f\t",arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("List created.");
    }

    public static void sort (double [][] arr){
        for(int i = 0 ; i < 100 ; i++){
            for(int j = 0 ; j < 10 ; j++){
                for(int k = 0 ; k < 100 ; k++){
                    for(int l = 0 ; l < 10 ; l++){
                        if(arr[i][j] < arr[k][l]){
                            double temp = arr[i][j];
                            arr[i][j] = arr[k][l];
                            arr[k][l] = temp;
                        }
                    }
                }
            }
        }
        for(int i = 0 ; i < 100 ; i++){
            for(int j = 0 ; j < 10 ; j++){
                System.out.printf("%.2f\t",arr[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean isPrime(Integer x){
        boolean prime = false;
        for(int i = 2 ; i <= x ; i++ ){
            if(x % i == 0){
                if(i == x){
                    prime = true;
                }
                if(i != x){
                    prime = false;
                }
                break;
            }
        }
        return prime;
    }
    
    public static boolean isPalindrome(Integer x){
        boolean pld = false;
        if(x.toString().toCharArray()[0] == x.toString().toCharArray()[x.toString().length() - 1]){
            pld = true;
        }
        return pld;
    }

    public static void creatPrimePalindrome(int [][] arr){
        System.out.println("Creating 1000 PalindromPrime...");
        int x = 0;
        for(int i = 0 ; i < 100 ; i++){
            for(int j = 0 ; j < 10 ; j++){
                while(i < 100 && j < 10){
                    if(isPrime(x) && isPalindrome(x)){
                        arr[i][j] = x;
                        x++;
                        break;
                    }
                    x++;
                }
            }
        }
        for(int i = 0 ; i < 100 ; i++){
            for(int j = 0 ; j < 10 ; j++){
                System.out.print(arr[i][j] +  " ");
            }
            System.out.println();
        }
        System.out.println("PalindromePrime created.");
    }
}
