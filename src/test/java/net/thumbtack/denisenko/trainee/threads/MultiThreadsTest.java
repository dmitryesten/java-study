package net.thumbtack.denisenko.trainee.threads;

import net.thumbtack.denisenko.trainee.threads.MultiThreads;
import org.junit.Test;

public class MultiThreadsTest {

    private ThreadProperties myThread = new ThreadProperties("MainThread-99");

    @Test
    public void testPropertiesThread(){
        System.out.println(myThread.propertiesThread());
    }

    @Test
    public void testJoinSubThreads(){
        MultiThreads mThread = new MultiThreads();

        mThread.start();
        System.out.println("Main thread is starting...");
        try {
            System.out.println("Waiting child thread");
            mThread.join();
        } catch ( InterruptedException e ) {
            System.out.println("Interrupted");
        }
        System.out.println("Main thread is finished...");
    }

    @Test
    public void testWait(){

        ThreadProperties thread2 = new ThreadProperties("Thread*");
        thread2.start();
        System.out.println("Main thread is starting...");
        try {
            System.out.println("Waiting child thread");
            thread2.join();
        } catch ( InterruptedException e ) {
            System.out.println("Interrupted");
        }
        System.out.println("Main thread is finished...");

    }




}