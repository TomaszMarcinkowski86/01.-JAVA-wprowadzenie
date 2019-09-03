package pl.sda.java.Day6.homework_Michal.currency;

/**
 * @author Michal Jaszczyk
 **/
// Nasz włąsny wyjątek dla cełów informacyjnych. Wszystkie wyjątki "Checked" dziedziczą po klasie Exception
public class CurrencyNotFound extends Exception {
    // Przeciążamy konstruktor, aby można było doadć wiadomość o błędzie oraz przekazać oryginalny wyjątek
    public CurrencyNotFound(String message, Throwable cause) {
        // Wywołanie konstruktora klasy bazowej
        super(message, cause);
    }
}
