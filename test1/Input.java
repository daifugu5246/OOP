import java.util.Scanner;
import java.util.Calendar;
public class Input {
    public static void main(String[] args) {
        //รับค่าข้อมูล
        //ชนิดข้อมูลเเบบไหน ตัวเลข : int long float double ข้อความ : string
        //ข้อความทำอะไร
        //ข้อความเเบบตัวเลข คำนวณได้ / คำนวณไม่ได้
        // class Scanner ใช้นับค่าข้อมูล ต้อง Import class ก่อน

        //ประกาศใช้ Class | new
        int thisyear = Calendar.getInstance().get(Calendar.YEAR);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = input.nextLine();//nextline รับค่าString จากเเป้นพิมพ์
        System.out.print("Enter your birth year : ");
        int year = input.nextInt();//รับค่าInteger
        System.out.println("Your name is " + name + ".");
        System.out.println(name + " is " + (thisyear-year) + " years old.");
        input.close();
    }
}
