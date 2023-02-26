import java.util.*;
public class Program02 {
    public static void main(String[] args) {
        String [] won = {"won","draw","lose"};
        String [] srp = {"scissor","rock","paper"};
        Scanner input =new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2) : ");
        int user = input.nextInt();
        int com = (int)(Math.random()*3);
        if(user >=0 && user <= 3){
            if((user == 0 && com == 2)||(user == 2 && com == 1)||(user == 1 && com == 0)){
                System.out.printf("The computer is %s. You are %s. You %s.",srp[com],srp[user],won[0]);
            }
            else if(user == com )
            {
                System.out.printf("The computer is %s. You are %s too. It is a %s.",srp[com],srp[user],won[1]);
            }
            else{
                System.out.printf("The computer is %s. You are %s. You %s.",srp[com],srp[user],won[2]);
            }
        }
        else {
            System.err.print("Error, input must be 0-3");
        }
        input.close();
    }
}
