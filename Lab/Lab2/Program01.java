import java.util.*;

public class Program01 {
    public static void main(String[] args) {
        String[] day = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day : ");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today : ");
        int elapsed = input.nextInt();
        int future = 0;
        if (today < 7) {
            for (int i = 0; i < today + elapsed; i++) {
                future++;
                if (future > 6)
                    future = 0;
            }
            System.out.printf("Today is %s and the future day is %s", day[today], day[future]);
        } 
        else {
            System.err.println("Error, today must be 0-6.");
        }
        input.close();
    }
}
