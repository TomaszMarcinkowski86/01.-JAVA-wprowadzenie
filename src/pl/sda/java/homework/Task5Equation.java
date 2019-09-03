package pl.sda.java.homework;

public class Task5Equation {
    public static void main(String[] args) {
         /*Utwórz metodę, która przyjmuje 4 parametry i zwraca wynik wynik równania: `a^(x) + b^(x+1) + c^(x+2)`.
         Gdzie `a`, `b`, `c` to pierwsze trzy parametry, a `x` jest czwartym parametrem.
         >Dla `1, 2, 3, 8` powinno policzyć `1^8 + 2^9 + 3^10`
         >Dla `10, 11, 12, 1` powinno policzyć `10^1 + 11^2 + 12^3`
         >Dla `8, 8, 8, 3` powinno policzyć `8^3 + 8^4 + 8^5`*/


        System.out.println(equation(1, 2, 3, 8));
    }
    public static int equation(int a, int b, int c,int x) {
        int result =(int)Math.pow(a, x)+(int)Math.pow(b, (x+1))+(int)Math.pow(c, (x+2));
        //// co znaczy taki (int) przed w nawiasie, domyślam się że wymuszenie inta zamiast doubla
        return result;

    }
}
