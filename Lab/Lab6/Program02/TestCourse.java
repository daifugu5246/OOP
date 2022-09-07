package Program02;

public class TestCourse {
    public static void main(String[] args) {
        Course c1 = new Course("OOP",1);
        Student s1 = new Student("Patipat", 1, 'm');
        Student s2 = new Student("Boonyawee",2,'f');
        Student s3 = new Student("Kumpanat",3,'m');
        Student s4 = new Student("ppp", 4, 'm');
        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);
        c1.addStudent(s4);
        c1.dropStudent("Kumpanat");
        System.out.println(c1.displayStudent());
    }
}

