public class StringVar {
    /*
    String คือ ชนิดข้อมูลที่เก็บชุดข้อคาวม
    symbol = "" 
    char คือ ชนิดข้อมูลที่เก็บตัวอักษร 
    symblo = ''
    char เรียงต่อกัน = String
    */
    public static void main(String[] args) {
        char a = 'A';
        System.out.println(a);
        String massage = "ABC";
        System.out.println(massage);

        String num = "100",num1="100";
        int num2 = 100;
        int c;
        num=num+50;
        System.out.println(num);//result = 10050 เป็นการเอามาต่อกันเเทน
        //การเเปลง String โดยการใช้ class 
        
        //String -> int 
        c = Integer.parseInt(num1);//parse + ชนิดตัวเเปร
        c = c + 50;
        System.out.println(c);
        //int -> String
        String fromint;
        fromint = String.valueOf(num2);
        System.out.print(fromint);
        //เช็คชนิดข้อมูล
        Boolean isString;
        Boolean isBool ;
        System.out.println();
        isString = fromint instanceof String;
        isBool = isString instanceof Boolean;
        //ชื่อตัวเเปรที่จะเช็ค instanceof classของชนิดข้อมูล
        //เช็คได้เเต่ object
        System.out.println(isString);
        System.out.println(isBool);
    }
}
