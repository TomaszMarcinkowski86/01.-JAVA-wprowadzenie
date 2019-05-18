package pl.sda.java.Day8.Task.Wielowatkowosc2;

public class ImplementsRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int j = 50; j >= 1; j--) {
            if (j % 2 != 0) {
                System.out.println(j);
                try {
                    Thread.sleep(250);//spowolnienie milisekundy
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
