package net.thumbtack.denisenko.trainee.threads;

public class MultiThreads extends Thread {

    private AThread aThread = new AThread();
    private BThread bThread = new BThread();


    @Override
    public void run() {
        aThread.start();
        bThread.start();
        for (int i = 0; i < 2; i++) {
            System.out.println("MThread is running №"+ i);
            try {
                System.out.println("MThread is sleeping");
                aThread.join();
                bThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class AThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 3; i++) {
            System.out.println("AThread is running №"+ i);
            try {
                System.out.println("AThread is sleeping");
                Thread.currentThread().sleep(5500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 2; i++) {
            System.out.println("BThread is running №"+ i);
            try {
                System.out.println("BThread is sleeping");
                Thread.currentThread().sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}