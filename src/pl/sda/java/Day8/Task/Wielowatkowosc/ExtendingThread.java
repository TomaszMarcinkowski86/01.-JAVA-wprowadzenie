package pl.sda.java.Day8.Task.Wielowatkowosc;


import java.util.concurrent.CyclicBarrier;

/////////pierwszy sposób wielowątkowości ////////////////
public class ExtendingThread extends Thread {


    @Override
    public void run() {
        while(true){
            System.out.println("Ping");
            try {
                sleep (500);//spowolnienie milisekundy
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
