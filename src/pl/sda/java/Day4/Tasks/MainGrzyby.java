package pl.sda.java.Day4.Tasks;

public class MainGrzyby {
    public static void main(String[] args) {

        Prawdziwek prawdziwek = new Prawdziwek();
        Pieczarka pieczarka = new Pieczarka();
        Muchomor muchomor = new Muchomor();

        Grzyb grzybPieczarka = new Pieczarka();
        Jadalny jadalnaPieczarka = new Pieczarka(); // możemy tak też obiekt stworzyc
        Jadalny jadalnyPrawdziwek = new Prawdziwek();

        Grzyb[] grzyby ={pieczarka,prawdziwek, muchomor};
        for (Grzyb tempGrzyb: grzyby){
            tempGrzyb.zbierz();
        }
        Jadalny[] grzybyJadalne ={jadalnaPieczarka,pieczarka,prawdziwek} ; // tu już muchomora nie dodamy
        for (Jadalny tempJadalny: grzybyJadalne){
            tempJadalny.zjedz();
        }
    }
}
