package pl.sda.java.Day5.Tasks.FinalKeyWord;

public final class ExtendingFinalKeyWord extends FinalKeyWord {

    public ExtendingFinalKeyWord(int someNuber) {
        super(someNuber);
    }

    @Override
    public void fun() {
        super.fun();
    }

   // public final void methodThatCannotBeOverriden(){ // tego nie można nadpisać bo słówko final
}
