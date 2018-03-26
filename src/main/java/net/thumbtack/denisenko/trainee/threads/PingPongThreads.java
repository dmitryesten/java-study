package net.thumbtack.denisenko.trainee.threads;

public class PingPongThreads implements Runnable {

    private String  word;

    public PingPongThreads (String whatToSay) {
        word  = whatToSay;
    }


    public void run ()
    {
        while(true) {
            synchronized (word) {
                System.out.println(word);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}
