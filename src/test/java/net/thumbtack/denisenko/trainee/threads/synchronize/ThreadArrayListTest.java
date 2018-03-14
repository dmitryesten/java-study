package net.thumbtack.denisenko.trainee.threads.synchronize;

import net.thumbtack.denisenko.trainee.threads.synchronize.ThreadAdd;
import net.thumbtack.denisenko.trainee.threads.synchronize.ThreadAddRemove;
import net.thumbtack.denisenko.trainee.threads.synchronize.ThreadArrayList;
import net.thumbtack.denisenko.trainee.threads.synchronize.ThreadRemove;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThreadArrayListTest {

    @Test
    public void twoThreadsArrayList() throws Exception {
        ThreadArrayList threadList = new ThreadArrayList();
        ThreadAdd callerOne = new ThreadAdd( threadList);
        ThreadRemove callerThree = new ThreadRemove(threadList);

        callerOne.start();
        callerThree.start();

        try {
            callerOne.join();
            callerThree.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        assertTrue(ThreadArrayList.list.isEmpty());

    }

    @Test
    public void monoThreadArrayList() throws Exception {
        ThreadArrayList threadList = new ThreadArrayList();
        ThreadAddRemove threadAddRemove = new ThreadAddRemove(threadList);

        threadAddRemove.start();

        try {
            threadAddRemove.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        assertTrue(ThreadArrayList.list.isEmpty());

    }

}