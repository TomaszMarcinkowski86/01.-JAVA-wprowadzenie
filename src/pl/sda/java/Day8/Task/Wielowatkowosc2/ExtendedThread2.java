package pl.sda.java.Day8.Task.Wielowatkowosc2;

public class ExtendedThread2 extends Thread {

    public void run() {
        for (int j = 1; j <= 50; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
                try {
                    sleep(250);//spowolnienie milisekundy
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

