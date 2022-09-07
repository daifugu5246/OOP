import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fout = new FileOutputStream("user.txt");
        FileInputStream fin = new FileInputStream("user.txt");
        ObjectOutputStream oout = new ObjectOutputStream(fout);
        ObjectInputStream oin = new ObjectInputStream(fin);
        Student student1 = new Student("pao", 15, "6");
        //Student student2 = new Student("pos", 15, "6");
        //Student student3 = new Student("oou", 15, "6");
        oout.writeObject(student1);
        //oout.writeObject(student2);
        //oout.writeObject(student3);
        for(int i = 0 ; i < 1 ; i++){
            Student st = (Student) oin.readObject();
            System.out.println(st.getName());
        }
    }
}
