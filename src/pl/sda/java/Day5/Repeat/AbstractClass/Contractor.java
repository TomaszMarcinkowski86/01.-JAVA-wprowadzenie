package pl.sda.java.Day5.Repeat.AbstractClass;

public class Contractor extends User {


    private String company;


    public Contractor(String userName, String email, String company) {
        super(userName, email);
        this.company = company;

    }
    public String getCompany() {
        return company;
    }
}
