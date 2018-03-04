package net.thumbtack.denisenko.trainee.threads;

import net.thumbtack.denisenko.trainee.threads.subthread.MyThreadOne;
import net.thumbtack.denisenko.trainee.threads.subthread.MyThreadThree;
import net.thumbtack.denisenko.trainee.threads.subthread.MyThreadTwo;

public class MyThreadMain extends Thread {

    private String name;
    public MyThreadMain(String nameThread){
        this.name = nameThread;

    }

    @Override
    public void run(){
        Thread.currentThread().setName(name);
        System.out.println(Thread.currentThread().getName()+ " запустился");

        try{
            for (int i = 0; i < 5; i++){
                System.out.println(Thread.currentThread().getName()+" Проснулся Работа№" + i + "\n " + Thread.currentThread().getName()+" заснул");
                Thread.sleep(3000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Поток прерван");
        }

    }


    public String propertiesThread(){
        return "ID="+Thread.currentThread().getId() +
                ",\nName = " + Thread.currentThread().getName() +
                ",\nStackTrace = " + Thread.currentThread().getStackTrace() +
                ",\nContextClassLoader = "+ Thread.currentThread().getContextClassLoader() +
                ",\nPriority = "+ Thread.currentThread().getPriority() +
                ",\nState = "+ Thread.currentThread().getState() +
                ",\nThreadGroup = "+ Thread.currentThread().getThreadGroup() +
                ",\nUncaughtExceptionHandler = "+ Thread.currentThread().getUncaughtExceptionHandler() +
                ",\nisAlive = "+ Thread.currentThread().isAlive() +
                ",\nisDaemon = "+ Thread.currentThread().isDaemon() +
                ",\nisInterrupted = "+ Thread.currentThread().isInterrupted();
    }

}
