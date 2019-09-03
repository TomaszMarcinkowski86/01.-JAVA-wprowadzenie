package pl.sda.java.Day2K;

public class IfsExample {
    public static void main(String[] args) {

        System.out.println(isEven(43));
        System.out.println(dividableByTreeAndFive(15));
        System.out.println(introduce("Tomek", 30, true));
        System.out.println(SwitchCalculator(5,0,'/'));

        // Zadanie. sprawdzamy czy liczba jest parzysta
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean dividableByTreeAndFive(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return true;
        }
        return false;
    }

    public static String introduce(String name, int age, boolean male) {
        String gender;
        if (male == true) {
            gender = "mezczyzna";
        } else {
            gender = "kobieta";
        }
        String result = "Czesc, jestem " + name + " i mam " + age + " lat i jestem " + gender;
        return result;
    }

    // metoda porównuje czy suma poszczególnych 2 liczb daje trzecią
    public static boolean threeParamsSum(int a, int b, int c) {
        if (a + b == c) {
            return true;
        }
        if (a + c == b) {
            return true;
        }
        if (b + c == a) {
            return true;
        }else{
            return false;
        }
    }
    //dzwoni telefon, mamy zwrócić true jeśli chcemy go odebrać.
    //Nie odbieramy kiedy śpimy.
    //Nie odbieramy kiedy jest rano i nie jest to telefon od mamy
    public static boolean answerCell(boolean isMama,boolean isMorning, boolean isAsleep){
        if (isAsleep ) { // nie musimy przypisywać do tru bo sam parametr da nam tru lub false
            return false;
        }
            if(isMorning && !isMama){
                return false;
            }
        return true;
    }

    public static Double SwitchCalculator(int a, int b, char sign){
        switch (sign){
            case '+':
                return Double.valueOf(a+b); // mamy 2 inty to żeby uzyska Double to trzeba tak bo z int na double sobie by sam zmienił.
                                           // nie zapewnia dokładności typu double
            case '-':
                return Double.valueOf(a-b);
            case '*':
                return (double)a*b; // drugi sposób
            case '/':
                if (b==0){
                    System.out.println("Nie dziel przez 0");
                    return null;
                }
                return (double) a/b;
            default:
                System.out.println("Nie wybrałeś znaku");
                return null;
        }
    }

    //Operator warunkowy (ternary operator)
    //    _________?____ : ______;
    //    warunek ? <kiedy true>:<kiedy false>;
    public static boolean isEvenTernary(int liczba){
        boolean result = liczba%2==0?true:false;
        return result;
        // return liczba%2==0; - dopuszczalna krótsza wersja.

    }
    public static String introduceWithTernary(String name, int age, boolean male) {
        String gender = male? " mezczyzna ": " kobieta ";
            return  "Czesc, jestem " + name + " i mam " + age + " lat i jestem " + gender;

    }

}


