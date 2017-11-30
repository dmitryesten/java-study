package net.thumbtack.denisenko.trainee.collections.compares;

import org.junit.Test;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class CompareSpeedSetsTest {

    private CompareSpeedSets compareSpeedSets = new CompareSpeedSets();
    private BitSet bitSet = new BitSet();
    private Set<Integer> treeSet = new TreeSet<>();
    private Set<Integer> hashSet = new HashSet<>();

    @Test
    public void speedAddBitSet() throws Exception {
        System.out.println("Скорость добавления(1000000)элементов в BitSet:  "+compareSpeedSets.speedAddBitSet(bitSet));
    }

    @Test
    public void speedAddSet() throws Exception {
        System.out.println("Скорость добавления(1000000)элементов в HashSet: "+compareSpeedSets.speedAddSet(hashSet));
        System.out.println("Скорость добавления(1000000)элементов в TreeSet: "+compareSpeedSets.speedAddSet(treeSet));
      }

}