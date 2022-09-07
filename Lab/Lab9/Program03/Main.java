package Program03;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Salary.txt");
        read(file);
        
    }
    public static void read(File file) throws FileNotFoundException{
        NumberFormat localeFormat = NumberFormat.getInstance(new Locale("en","US"));
        Scanner reader = new Scanner(file);
        double assistantSalary = 0;
        double associateSalary = 0;
        double fullSalary = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        while(reader.hasNextLine()){
            for(int i = 1 ; i <= 4 ; i++){
                if(reader.hasNext()){
                    String rank = reader.next();
                    if(rank.equals("assistant")){
                        assistantSalary += reader.nextDouble();
                        count1++;
                    }else if(rank.equals("associate")){
                        associateSalary += reader.nextDouble();
                        count2++;
                    }else if(rank.equals("full")){
                        fullSalary += reader.nextDouble();
                        count3++;
                    }
                }
            }
        }
        double allSalary = assistantSalary + associateSalary + fullSalary;
        double assistantAv = assistantSalary/count1;
        double associateAv = associateSalary/count2;
        double fullAv = fullSalary/count3;
        double allAv = allSalary/(count1+count2+count3);
        System.out.printf("Total salary for assistant professor is %s \n",localeFormat.format(assistantSalary));
        System.out.printf("Total salary for associate professor is %s \n",localeFormat.format(associateSalary));
        System.out.printf("Total salary for full professor is %s \n",localeFormat.format(fullSalary));
        System.out.printf("Total salary for all professor is %s \n",localeFormat.format(allSalary));
        System.out.println("--------------------------------------------------");
        System.out.printf("Average salary for assistant professor is %s \n",localeFormat.format(assistantAv));
        System.out.printf("Average salary for associate professor is %s \n",localeFormat.format(associateAv));
        System.out.printf("Average salary for full professor is %s \n",localeFormat.format(fullAv));
        System.out.printf("Average salary for all professor is %s \n",localeFormat.format(allAv));
        reader.close();
    }
}
