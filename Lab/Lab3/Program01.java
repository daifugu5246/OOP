import java.util.*;

public class Program01 {
    public static void main(String[] args) {
        Integer x = 0;
        ArrayList <Integer> num = new ArrayList<Integer>();
        while(true){
            if(isPrime(x) && isPalindrome(x)){
                num.add(x);
            }
            if(num.size() == 100)break;
            x++;
        }
        for(Integer i = 0 ; i < num.size() ; i++){
            System.out.print(num.get(i) + " ");
            if(i.toString().toCharArray()[i.toString().length()-1] == '9'){
                System.out.println();
            }
        }
    }
    static boolean isPrime(Integer x){
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
    static boolean isPalindrome(Integer x){
        boolean pld = false;
        if(x.toString().toCharArray()[0] == x.toString().toCharArray()[x.toString().length() - 1]){
            pld = true;
        }
        return pld;
    }
}
