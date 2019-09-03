package pl.sda.java.homework;

public class Task14MethodsTree {
    public static void main(String[] args) {

        /*14. Utwórz metodę przyjmującą parametr z liczbą wierszy i wypisującą liczby w ten sposób:
                1
               12
              123 (edited) */
        tree1(4);
        //tree2(4);
        int heigh = 5;

        for (int i = 0; i < heigh; i++) {
            for (int a = 0; a < heigh - i; a++) {
                System.out.print(" ");
            }
            for (int a = 0; a <= i * 2; a++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("    **");

    }

    public static void tree1(int rows) {
        for (int i = 0;  i <= rows; i++) {
            for (int j =0; j<rows ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i*2; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }



    //Utwórz metodę przyjmującą parametr z liczbą wierszy i wypisującą liczby w ten sposób:
    //1
    //22
    //333
    public static void tree2(int param) {
        for (int i = 1; i <= param; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);          // print nie println
            }
            System.out.println();
        }
    }
    /*0000
      111
      22
      3
     */
    public static void tree3(int rows) {
        for (int i = 0; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /*3
      22
      111
     */
    public static void tree4(int rows) {
        for (int i = rows; i > 0; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" " + i);
                //System.out.print(" "+ j);
            }
            System.out.println();
        }
    }
    /*1
      12
      123
      1234
     */
    public static void tree5(int rows) {
        for (int i = 1;  i <= rows; i++) {
            for (int j =1; j<i ; j++) {
                //System.out.println(j);
                String space=(" ");

                System.out.print(j);
            }
            System.out.println(i);
        }
    }
}
