package pl.sda.java.Day5.Repeat.AbstractClass;

import java.util.ArrayList;
import java.util.List;

public class MainAbstractClass {
    /*--- Zadanie 2 ---
   1. Stwórz klasę abstrakcyjną User, która posiada pole id, username, email
   2. Stwórz konstruktor przyjmujący username i email
   3. W konstruktorze przydziel unikalne id
       (podczas działania aplikacji, każde wywołanie konstruktora powinno przydzielać unikalne id)
   4. Dodaj gettery
   5. Stwórz klasy Employee oraz Contractor rozszerzające klasę user
   6. Wymyśl dodatkowe pole i metodę dla każdej z tych klas
   7. Stwórz klasę Main z metodą main, utwórz obiekty Employee oraz Contractor i dodaj je do jednej listy (ArrayList)
   8. Wyświetl zawartość listy (dla każdego elementu id, username i email)*/

    public static void main(String[] args) {

        Employee employee = new Employee("T.Marcinkowski","tomek@company.pl",1);
        Contractor contractor =new Contractor("K.Pitr", "kat@company.pl", "SDA");
        User employeeUser = new Employee("T.Kowalski", "tadeusz@company.pl", 0.5F);
        User contractorUser = new Contractor("T.Kowalski", "tadeusz@company.pl", "TED");

        List<User> users = new ArrayList();// <tu wpisujemy typ który przechowujemy>
        users.add(employee);
        users.add(contractor);
        users.add(employeeUser);
        users.add(contractorUser);

        System.out.println(users);
        for (User userTemp: users ){ // żeby w róznych liniach wyświetlał
            System.out.println(userTemp);
        }

    }
}
