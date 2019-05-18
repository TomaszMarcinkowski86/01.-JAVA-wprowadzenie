package pl.sda.java.Day7.Repeat;

public interface InterfacePredator {

    void hunt(); // domyślnie jest abstrakcyjna więc nic nie musimy pisac. to musi być w każdej klasie która implementuje interfejs

    default void kill(){ // ta nie musi być implementowana w innych klasach - default

    }
}
