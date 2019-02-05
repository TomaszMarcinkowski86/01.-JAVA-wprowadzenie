package pl.sda.java.Day3;

public class Cake  {             // wywołamy w Main2
    private float flourInKg;
    private float waterInL;
    private int eggs;

    public Cake(float flourInKg, float waterInL, int eggs) { // konstruktor też możemy ALT +Insert
        this.flourInKg = flourInKg;
        this.waterInL = waterInL;
        this.eggs = eggs;
    }

    // tu nie mamy getterów bo nie potrzebuje komuś dawać możliwości odczytu z jakich parametrów się ciasto składa

    public boolean isTasty(){  //funkcjonalność
        if(moreFlourThanWater()) {
            return false;
        }else if (eggs<1||eggs>12){
            return false;
        }else{
            return true;
        }
    }
    public boolean isTasty2(){  //funkcjonalność
        if((moreFlourThanWater())&&(eggs<1||eggs>12)){
            return false;
        }else{
            return true;
        }

    }
    public boolean isTasty3(){  //funkcjonalność
        if(moreFlourThanWater() &&(eggs<1||eggs>12)){
            return false;
        }else{
            return true;
        }
    }

    private boolean moreFlourThanWater() {  //Ctrl +Alt+m po zaznaczeniu fragmentu możemy go przenieść do metody
        return flourInKg>waterInL;           // wtedy w if zamiast porównania będzie if metoda (if(moreFlourthanWater()))
    }
}
