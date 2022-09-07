package Program03;

import java.util.Date;

public class Employee extends Person{
    private String office;
    private double salary;
    private Date date_hired;
    Employee(){
        date_hired = new Date();
    }
    public Employee(String office, double salary) {
        this.office = office;
        this.salary = salary;
        date_hired = new Date();
    }
    public Employee(String name, String address, String phonenumber, String email, String office, double salary) {
        super(name, address, phonenumber, email);
        this.office = office;
        this.salary = salary;
        date_hired = new Date();
    }

    
    public String getOffice() {
        return office;
    }
    public void setOffice(String office) {
        this.office = office;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getDate_hired() {
        return date_hired.toString();
    }
    @Override
    public String toString() {
        return super.toString()+"Employee [date_hired=" + date_hired + ", office=" + office + ", salary=" + salary + "]";
    }
    
}
