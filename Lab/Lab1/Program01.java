public class Program01 {
    public static void main(String[] args) {
        int pop = 310032486;//population
        int year_sec = 365*86400;// 1 วัน = 86400 วินาที
        int born = year_sec / 7, died = year_sec/13, imm =  year_sec/45;

        //year 1
        pop += born;
        pop -= died;
        pop += imm;
        System.out.println("Year 1 : " + pop);

        //year 2
        pop += born;
        pop -= died;
        pop += imm;
        System.out.println("Year 2 : " + pop);

        //year 3
        pop += born;
        pop -= died;
        pop += imm;
        System.out.println("Year 3 : " + pop);

        //year 4
        pop += born;
        pop -= died;
        pop += imm;
        System.out.println("Year 4 : " + pop);

        //year 5
        pop += born;
        pop -= died;
        pop += imm;
        System.out.println("Year 5 : " + pop);
    }
}
