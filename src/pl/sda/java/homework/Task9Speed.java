package pl.sda.java.homework;

public class Task9Speed {
    public static void main(String[] args) {

        /*caughtSpeeding - jechaliśmy samochodem trochę za szybko i załapała nas policja przy ograniczeniu do 50km/h,
         należy napisać program który zwróci wartość mandatu: 100zł, 200zł lub 300zł - w zależności od tego jak zareaguje policjant.
         W przypadku przekroczenia prędkości w zakresie do 10km/h będzie to 100zł (51-60),
         w przypadku przekroczenia prędkości o 10-20km/h będzie to 200zł (60-69) i analogicznie o 20 w górę to będzie 300zł.
          Jedynym wyjątkiem jest kiedy akurat policjant ma dobry humor, wtedy jest łagodniejszy i reaguje tak jakbyśmy jechali 5km/h mniej.
          (należy użyć zagnieżdżonych if else; humor policjanta i prędkość należy przekazać w argumentach)
          */

        caughtSpeeding("good", 70);
    }

    public static void caughtSpeeding(String mood, int speed) {
        String fine;
        if (mood == "good") {
            speed = speed - 5;
        }else {
            speed = speed;
        }
            if (speed > 50 && speed <= 60) {
                fine = " 100zł ";
                System.out.println("Jechałeś " + speed + "km/h będzie mandacik " + fine);
            }
            if (speed > 60 && speed <= 69) {
                fine = " 200zł ";
                System.out.println("Jechałeś " + speed + "km/h będzie mandacik " + fine);
            }
            if (speed >= 70) {
                fine = " 300zł ";
                System.out.println("Jechałeś " + speed + "km/h będzie mandacik " + fine);
            }
        }
    }
