package Program02;

import java.util.ArrayList;

public class Course {
    private ArrayList<Student> student; // 5..60
    private ArrayList<Faculty> faculty; // 0..2
    private String name;
    private int credit;
    private int indexOfStudent; //0
    private int indexOfFaculty; //0

    public Course() {
    }

    public Course(String name, int credit) {
        this.name = name;
        this.credit = credit;
        this.student = new ArrayList<Student>(); // composition
        this.faculty = new ArrayList<Faculty>();
    }
    public void addStudent(Student student) {
        this.student.add(student);
        this.indexOfStudent++;
    }
    public void addFaculty(Faculty faculty) {     
        this.faculty.add(faculty);
        this.indexOfFaculty++;
    }
    
    public int getIndexOfStudent() {
        return indexOfStudent;
    }
    public int getIndexOfFaculty() {
        return indexOfFaculty;
    }

    String displayStudent() {
        String s = "";
        for (int i = 0; i < student.size(); i++) {
            s += student.get(i).toString();
            s += "\n";
        }
        return s;
    }
    String displayFaculty() {
        String s = "";
        for (int i = 0; i < faculty.size(); i++) {
            s += faculty.get(i).toString();
            s += " ";
        }
        return s;
    }
    public void dropStudent(String name){
        for(int i = 0 ; i < student.size() ; i++){
            if(name.equals(student.get(i).name)){
                student.remove(i);
            }
        }
    }
    public void clear(){
        student.clear();
    }
    @Override
    public String toString() {
        return "Course{" + "student=" + displayStudent() + ", faculty=" + displayFaculty() + ", name=" + name + ", credit=" + credit + '}';
    }

}
class Student {
    String name;
    int id;
    char gender;

    public Student(String name, int id, char gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", gender=" + gender + '}';
    }
    
}
class Faculty {
    String name;
    String position;

    public Faculty(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Faculty{" + "name=" + name + ", position=" + position + '}';
    }
    
}
