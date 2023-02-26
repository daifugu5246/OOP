package Program01;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stock Oracle = new Stock("ORCL", "Oracle Coporation");
        System.out.println("Symbol : " + Oracle.symbol);
        System.out.println("Name : " + Oracle.name);
        System.out.print("Previous Closing Price : ");
        Oracle.previousClosingPrice = input.nextDouble();
        System.out.print("Current Price : ");
        Oracle.currentPrice = input.nextDouble();
        System.out.print("Price Change : " + Oracle.getChangePercent() + " %");
        input.close();
    }
}
