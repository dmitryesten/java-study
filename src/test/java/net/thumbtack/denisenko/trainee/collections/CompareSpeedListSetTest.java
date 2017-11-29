package net.thumbtack.denisenko.trainee.collections;

import net.thumbtack.denisenko.trainee.collections.compares.CompareSpeedListSet;
import org.junit.Test;

import java.util.*;

public class CompareSpeedListSetTest {

    private CompareSpeedListSet compareSpeedListSet = new CompareSpeedListSet();
    private List<Integer> list = new ArrayList<>();
    private Set<Integer> hashSet = new HashSet<>();
    private Set<Integer> treeSet = new TreeSet<>();

    @Test
    public void timeArrayList() throws Exception {
        int numberNeed = 985;
        List<Integer> randomList = compareSpeedListSet.fillRandomValue(list);
        System.out.print("Время поиска числа "+ numberNeed+" в ArrayList: ");
        System.out.println(compareSpeedListSet.timeList((ArrayList<Integer>) randomList, numberNeed));
    }

    @Test
    public void timeHashSet() throws Exception {
        int numberNeed = 985;
        Set<Integer> randomSet = compareSpeedListSet.fillRandomValue(hashSet);
        System.out.print("Время поиска числа "+ numberNeed+" в HashSet: ");
        System.out.println(compareSpeedListSet.timeSet((HashSet<Integer>) randomSet, numberNeed));
    }

    @Test
    public void timeTreeSet() throws Exception {
        int numberNeed = 985;
        Set<Integer> randomSet = compareSpeedListSet.fillRandomValue(treeSet);
        System.out.print("Время поиска числа "+ numberNeed+" в TreeSet: ");
        System.out.println(compareSpeedListSet.timeSet((TreeSet<Integer>) randomSet, numberNeed));
    }



}