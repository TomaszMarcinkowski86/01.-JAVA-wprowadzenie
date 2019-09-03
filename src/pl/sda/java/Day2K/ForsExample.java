package pl.sda.java.Day2K;

public class ForsExample {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) { // pętla wykona się 4x wyświetli  4xAdam
            System.out.println("Adam");
        }
        printFewNumber(5);
        printFewNumbersWithoutDividableByParam(10, 3);
        printFewNumbersWithoutDividableByParamContinue(10, 3);
        System.out.println(SomeNaturalNumbersToLimit(100));
        printNumbersInTower(10);
        System.out.println(sumaWhile(1000));
        System.out.println(sumaDoWhile(0));
        fibonacci(20);


    }

    public static void printFewNumber(int max) {
        for (int i = 0; i < max; i++) { // pętla wyświetli liczby naturalne w zależności od parametru max (powyżej 5)
            System.out.println(i);
        }
    }

    public static void printFewNumbersWithoutDividableByParam(int max, int param) {
        for (int i = 0; i < max; i++) { // pętla wyświetli liczby podzielne przez param= 3
            if (i % param != 0) {
                System.out.println(i);
            }
        }
    }

    public static void printFewNumbersWithoutDividableByParamContinue(int max, int param) {
        for (int i = 0; i < max; i++) { // ta pętla pomija przy pomocy continue te liczby które są w if
            if (i % param != 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static int SomeNaturalNumbersToLimit( int limit){ //
        int sum = 0;
        for (int i = 0; ; i++) {
            if (sum+i>=limit){
                break;
            }
            sum =sum+i;
        }
        return sum;
    }

    //Utwórz metodę przyjmującą parametr z liczbą wierszy i wypisującą liczby w ten sposób:
    //1
    //22
    //333
    public static void printNumbersInTower(int param){
        for (int i = 1; i <= param; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);          // print nie println
            }
            System.out.println();

        }
    }
    //Metoda z pętlą while
    public static int sumaWhile(int limit){
        int sum = 0;
        int counter=0;
        while(sum+counter<=limit){
            sum = sum+(++counter);
        }
        return sum;
    }
    // metoda z pętlą Do while
    public static int sumaDoWhile (int limit){
        int sum=0;
        int counter=0;
        do {
            sum=sum+ (++counter);
        }while (sum+counter<=limit);
        return sum;
    }
    // metoda z pętlą do while - ciąg fibonnatciego do któregoś elementu param
    public static void fibonacci (int param){
        int firstNumber = 0;
        int secondNumber = 1;
        int counter = 1;
        System.out.print(0+","+1+",");
        while(counter <=param-2){ // - 2 bo 2 pierwszs dodaliśmy
            int sum = firstNumber+secondNumber;
            System.out.print(sum+",");
            firstNumber=secondNumber;
            secondNumber=sum;
            counter++;
        }

    }


}