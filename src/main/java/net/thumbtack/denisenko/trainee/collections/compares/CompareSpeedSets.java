package net.thumbtack.denisenko.trainee.collections.compares;

import java.util.BitSet;
import java.util.Set;

public class CompareSpeedSets {

    private long startTime;
    private long endTime;

    public long  speedAddBitSet(BitSet bitSet){
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++)
            bitSet.get(i);
        endTime = System.nanoTime();
        return  endTime - startTime;
    }

    public long  speedAddSet(Set<Integer> set){
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++)
            set.add(i);
        endTime = System.nanoTime();
        return  endTime - startTime;
    }

}
