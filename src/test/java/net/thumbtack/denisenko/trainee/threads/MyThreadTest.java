package net.thumbtack.denisenko.trainee.threads;

import net.thumbtack.denisenko.trainee.threads.subthread.MyThreadOne;
import net.thumbtack.denisenko.trainee.threads.subthread.MyThreadThree;
import net.thumbtack.denisenko.trainee.threads.subthread.MyThreadTwo;
import org.junit.Test;

public class MyThreadTest {

    private MyThreadMain myThread = new MyThreadMain("MainThread-99");

    @Test
    public void testPropertiesThread(){
        System.out.println(myThread.propertiesThread());
    }

    @Test
    public void testWait(){
        MyThreadMain thread2 = new MyThreadMain("Под_Thread_2");
        thread2.start();
        System.out.println("Главный поток начал работу...");
        System.out.println("Поток "+ thread2.getName() +" is "+thread2.isAlive());
        try {
            System.out.println("Ожидание завершения потоков.");
            thread2.join();
        } catch ( InterruptedException e ) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершил работу...");

    }

    @Test
    public void testStarSomeThreads(){
        MyThreadOne myThreadOne = new MyThreadOne("Th№1");
        MyThreadTwo myThreadTwo = new MyThreadTwo("Th№2");
        MyThreadThree myThreadThree = new MyThreadThree("Th№3");
        MyThreadMain threadMain = new MyThreadMain("MainThread");

        myThreadOne.start();
        myThreadTwo.start();
        myThreadThree.start();
        System.out.println("Главный поток начал работу...");
        try {
            System.out.println("Ожидание завершения потоков.");
            threadMain.join();
        } catch ( InterruptedException e ) {
            System.out.println("Главный поток прерван");
        }

    }


}