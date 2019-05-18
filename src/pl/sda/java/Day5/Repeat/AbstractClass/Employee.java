package pl.sda.java.Day5.Repeat.AbstractClass;

public class Employee extends User {


    private float workload;   // workload wymiar etatu po PL



    public Employee(String userName, String email, float workload) {
        super(userName, email);            // to jest pobierane z konstruktora User
        this.workload = workload;

    }
    public float getWorkload() {
        return workload;
    }
}
