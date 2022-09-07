package Program03;

public class Student extends Person{ 
    public static enum  Status{
        FRESHMAN,SOPHOMORE,JUNIOR,SENIOR
    }
    private Status status;
    Student(){

    }
    public Student(String name, String address, String phonenumber, String email, Status status) {
        super(name, address, phonenumber, email);
        this.status = status;
    }
    
    public Status getStatus() {
        return status;
    }
    
    public void setStatus(Status status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return super.toString() + "Student [status=" + status + "]";
    }
    
}
