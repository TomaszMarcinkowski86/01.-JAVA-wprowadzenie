package pl.sda.java.Day5.Repeat.AbstractClass;

public abstract class User {

    private static long maxId; // static mówi o tym że pole, zmienna czy metoda znajduje się we wspólnym miejscu w pamięci.
                               // maxId będzie nam sprawdzać największy Id w danym momencie
    private long id;
    private String userName;
    private String email;

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
        this.id = maxId++;      //przydzielenie największego maxId +1, żeby się zmieniał.
                                //Zmienna maxId statyczna to to będzie wpływać na każdy nowo tworzony obiekt
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "( id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email +" )" ;

    }
}
