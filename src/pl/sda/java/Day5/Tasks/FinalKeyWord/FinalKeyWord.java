package pl.sda.java.Day5.Tasks.FinalKeyWord;

public class FinalKeyWord {

    private final int number = 5;
    private final int anotherNumber;

    public FinalKeyWord(int someNuber){
        this.anotherNumber=someNuber;
    }

    public void fun(){
        // number = 4; nie można zmienić bo final
    }

    public final void methodThatCannotBeOverriden(){ // final w metodzie

    }
}
