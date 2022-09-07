package Program03;

import java.util.Date;

public class Faculty extends Employee {
    private double officehours;
    private String rank;
    
    public Faculty(double officehours, String rank) {
        this.officehours = officehours;
        this.rank = rank;
    }
    public Faculty(String office, double salary, double officehours, String rank) {
        super(office, salary);
        this.officehours = officehours;
        this.rank = rank;
    }
    public Faculty(String name, String address, String phonenumber, String email, String office, double salary,
            Date date_hired, double officehours, String rank) {
        super(name, address, phonenumber, email, office, salary);
        this.officehours = officehours;
        this.rank = rank;
    }
    public double getOfficehours() {
        return officehours;
    }
    public void setOfficehours(double officehours) {
        this.officehours = officehours;
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    @Override
    public String toString() {
        return super.toString()+"Faculty [officehours=" + officehours + ", rank=" + rank + "]";
    }
    
}
