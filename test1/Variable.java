public class Variable {
    public static void main(String[] args) {
        //Type of Variable
        String name = "Patipat";
        char alphabet = 'o';
        int num1 = 5;
        short num2 = 3;
        long num3 = 10;
        float num4 = 5.36f;
        double num5 = 5.3645;
        boolean status = true;
        final int constant = 50;//Constant can't change value
        num1=6;// Can change value
        System.out.println("name : " + name);
        System.out.println("char : " + alphabet);
        System.out.println("int : " + num1);
        System.out.println("short : " + num2);
        System.out.println("long : " + num3);
        System.out.println("float : " + num4);
        System.out.println("double : " + num5);
        System.out.println("boolean : " + status);
        System.out.println("final : " +  constant);
        //Global & Local Variable
        int a = 100;
        {
            int b = 200;
            System.out.println("Var b : " + b);
        }
        System.out.println("Var a : " + a);
        //System.out.println(b); Can't run

        //----------------------------------//

        //Type casting
        //ขนาดของข้อมูล byte<short<char<int<long<float<double
        //1.เเปลงจากขนาดเล็กไปขนาดใหณ่
        {
            int numint = 10;
            double numdouble = numint;
            System.out.println("เล็ก -> ใหญ่");
            System.out.println(numint);
            System.out.println(numdouble);
        }
        // 2. แปลงจากขนาดใหญ่ไปขนาดเล็ก
         {
             double numdouble=10.0;
             int numint=(int)numdouble;
             System.out.println("ใหญ่ -> เล็ก");
             System.out.println(numdouble);
             System.out.println(numint);
         }
    }
}
