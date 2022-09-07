package Program03;

public class Person {
    private String name;
    private String address;
    private String phonenumber;
    private String email;

    Person(){

    }

    Person(String name, String address, String phonenumber, String email) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.email = email;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person [address=" + address + ", email=" + email + ", name=" + name + ", phonenumber=" + phonenumber
                + "]";
    }
    
    
}
