package Program03;

public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phonenumber, String email, String office, double salary, String title) {
        super(name, address, phonenumber, email, office, salary);
        this.title = title;
    }

    public Staff(String title) {
        this.title = title;
    }

    public Staff(String office, double salary, String title) {
        super(office, salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString()+"Staff [title=" + title + "]";
    }
    
}
