package pl.sda.java.Day8.Task.Wielowatkowosc;


import java.util.concurrent.TimeUnit;

/////////drugi sposób wielowątkowości ////////////////
public class ImplementRunable implements Runnable {

    @Override
    public void run() {
        while(true){
            System.out.println("Pong");
            try {
                Thread.sleep(500);//spowolnienie milisekundy
//                TimeUnit.MILLISECONDS.sleep(500); // to samo co wyżej - sowolność bo możemy określić jednostki
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
