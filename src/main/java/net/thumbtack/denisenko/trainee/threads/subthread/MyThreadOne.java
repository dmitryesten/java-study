package net.thumbtack.denisenko.trainee.threads.subthread;

public class MyThreadOne extends Thread {

    private String name;
    public MyThreadOne(String nameThread){
        this.name = nameThread;
    }

    public void run(){
        System.out.println("Поток "+Thread.currentThread().getName()+ " запустился");
        try{
            for (int i = 0; i < 5; i++){
                System.out.println(Thread.currentThread().getName()+"Проснулся Работа№" + i + "\n " + Thread.currentThread().getName()+" заснул");
                Thread.sleep(4500);
            }
        }
        catch(InterruptedException e){
            System.out.println("Поток прерван");
        }
    }

}
