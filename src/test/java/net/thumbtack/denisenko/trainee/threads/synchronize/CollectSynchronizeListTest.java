package net.thumbtack.denisenko.trainee.threads.synchronize;

import org.junit.Test;

import static org.junit.Assert.*;

public class CollectSynchronizeListTest {

    @Test
    public void twoThreadsCollectionList(){
        CollectSynchronizeList collectSynchronizeList = new CollectSynchronizeList();
        ThreadAddW callerOne = new ThreadAddW(collectSynchronizeList);
        ThreadRemoveW callerThree = new ThreadRemoveW(collectSynchronizeList);

        callerOne.start();
        callerThree.start();

        try {
            callerOne.join();
            callerThree.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        assertTrue(CollectSynchronizeList.list.isEmpty());

    }


}