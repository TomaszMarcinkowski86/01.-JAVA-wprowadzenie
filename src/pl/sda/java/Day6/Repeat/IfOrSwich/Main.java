package pl.sda.java.Day6.Repeat.IfOrSwich;

public class Main {
    public static void main(String[] args) {

        /*Zadanie 2 ---
   1. Stwórz klasę GradeConverter
   2. Dodaj metodę convert zwracającą łańcuch znakowy oraz przyjmujący
       jako argument liczbę całkowitą
   3. Powyższa metoda powinna zamieniać oceny z zakresu 1 do 6 na
       odpowiedniki słowne (dla 4 dobry, 2 mierny, itd.)
       w innym wypadku ma zwracać wartość "nieznana"
   4. Zamień warunki if na switch
   */
        GradeConventer conventer = new GradeConventer();
        System.out.println(conventer.convert(3));
        System.out.println(conventer.convertSwich(5));
        System.out.println(conventer.convertSwich(7));

        for (int i = 0; i < 100; i++) {
            if (i % 12 == 0) {
                break;                 // to zatrzyma działanie pętli
            }
        }
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                continue;             // pomija dalsze instrukcje w dalszym przebiegu pętli
            }
            //// skomplikowane różne instrukcje
            System.out.println(i);

        }

    }
}
