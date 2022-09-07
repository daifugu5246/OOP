package Program03;

import Program03.Student.Status;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Patipat", ": 1 Chalongkrung Road, Ladkrabang, BKK, 10520"
        , "0695847712", "somsak@email.com", Status.FRESHMAN);
        System.out.println("-Student-");
        System.out.println(s1.toString());
        System.out.println("-Staff-");
        Staff staff = new Staff("ppp", "ooo", "0000", "ppor556", "55478", 2544, "8pamds");
        System.out.println(staff.toString());
    }


}
