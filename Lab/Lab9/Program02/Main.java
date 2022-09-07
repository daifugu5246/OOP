package Program02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Salary.txt");
        write(file);
    }
    public static void write(File file) throws FileNotFoundException{
        String [] rank = {"assistant","associate","full"};
        Random random = new Random();
        try(PrintWriter writer = new PrintWriter(file)){
            for(int i = 1 ; i <= 1000 ; i++){
                writer.print("Firstname"+i+" ");
                writer.print("Lastname"+i+" ");
                int index = random.nextInt(3);
                writer.print(rank[index]+" ");
                if(i<1000){
                    switch(index){
                        case 0 :
                            writer.println(random.nextFloat()*(80000-50000)+50000);
                            break;
                        case 1 :
                            writer.println(random.nextFloat()*(110000-60000)+60000);
                            break;
                        case 2 :
                            writer.println(random.nextFloat()*(130000-75000)+75000);
                            break;
                    }
                }
                else{
                    switch(index){
                        case 0 :
                            writer.print(random.nextFloat()*(80000-50000)+50000);
                            break;
                        case 1 :
                            writer.print(random.nextFloat()*(110000-60000)+60000);
                            break;
                        case 2 :
                            writer.print(random.nextFloat()*(130000-75000)+75000);
                            break;
                    } 
                }
            }
        }
    }
}