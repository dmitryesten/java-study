package net.thumbtack.denisenko.trainee.threads.synchronize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectSynchronizeList {


    static List<Integer> list = Collections.synchronizedList(new ArrayList<>(10000));

    public static void main(String args[]) {
        CollectSynchronizeList collectSynchronizeList = new CollectSynchronizeList();
        ThreadAddW callerOne = new ThreadAddW(collectSynchronizeList);
        ThreadRemoveW callerThree = new ThreadRemoveW(collectSynchronizeList);

        callerOne.start();
        callerThree.start();

        try {
            callerOne.join();
            callerThree.join();
            //threadAddRemove.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        System.out.println(CollectSynchronizeList.list.isEmpty());
        for (Integer i:CollectSynchronizeList.list) {
            System.out.println(i);
        }

    }

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


class ThreadAddW extends Thread {
    private CollectSynchronizeList target;

    public ThreadAddW(CollectSynchronizeList target) {
        this.target = target;
    }

    public void run() {
      target.addValueList();
    }

}

class ThreadRemoveW extends Thread {

    private CollectSynchronizeList target;

    public ThreadRemoveW(CollectSynchronizeList target) {
        this.target = target;
    }

    public void run() {
        target.removeValueList();
    }

}

class ThreadAddRemoveW extends Thread {

    private CollectSynchronizeList target;

    public ThreadAddRemoveW(CollectSynchronizeList target) {
        this.target = target;
    }

    public void run() {
       target.addValueList();
       target.removeValueList();
    }

}
