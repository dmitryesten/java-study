package net.thumbtack.denisenko.trainee.threads;


public class ThreadProperties extends Thread {

    private String name;
    public ThreadProperties(String nameThread){
        this.name = nameThread;

    }

    @Override
    public void run() {
        Thread.currentThread().setName(name);
        System.out.println(Thread.currentThread().getName()+ " started");

        try{
            for (int i = 0; i < 5; i++){
                System.out.println(Thread.currentThread().getName()+Thread.currentThread().isAlive()+" Проснулся use Работа№" + i + "\n " + Thread.currentThread().getName()+" заснул");
                Thread.sleep(3000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Main thread Interrupted");
        }

    }


    public String propertiesThread() {
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
