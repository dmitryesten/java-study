package net.thumbtack.denisenko.trainee.threads.synchronize;

import java.util.ArrayList;
import java.util.List;

public class ThreadArrayList {

    static List<Integer> list = new ArrayList<>(10000);

//    public static void main(String args[]) {
//        ThreadArrayList threadList = new ThreadArrayList();
//        ThreadAdd callerOne = new ThreadAdd( threadList);
//        ThreadRemove callerThree = new ThreadRemove(threadList);
//
//
//        callerOne.start();
//        callerThree.start();
//
//
//        try {
//            callerOne.join();
//            callerThree.join();
//        } catch (InterruptedException e) {
//            System.out.println("Interrupted");
//        }
//
//        System.out.println(ThreadArrayList.list.isEmpty());
//        for (Integer i:ThreadArrayList.list) {
//            System.out.println(i);
//        }
//
//    }

    synchronized void addValueList(){
        for (int i = 0; i < 10000 ; i++) {
            int rand = (int)(0 + (Math.random() * (list.size() - 0)));
            list.add(rand);
            System.out.println(ThreadAdd.currentThread().getName()+" ADD value: "+rand);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

    }

    synchronized void removeValueList(){
        for (int i = 0; i < 10000 ; i++) {
            int rand = (int)(0 + (Math.random() * (list.size() - 0)));
            int value = list.remove(rand);
            System.out.println(ThreadAdd.currentThread().getName()+" indx: "+rand+" REMOVE value:"+value);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

    }


}
class ThreadAdd extends Thread {

    private ThreadArrayList target;

    public ThreadAdd(ThreadArrayList target) {
        this.target = target;
    }

    public void run() {
        target.addValueList();
    }

}

class ThreadRemove extends Thread {

    private ThreadArrayList target;

    public ThreadRemove(ThreadArrayList target) {
        this.target = target;
    }

    public void run() {
       target.removeValueList();
    }

}

class ThreadAddRemove extends Thread {

    private ThreadArrayList target;

    public ThreadAddRemove(ThreadArrayList target) {
        this.target = target;
    }

    public void run() {
        target.addValueList();
        target.removeValueList();
    }

}

