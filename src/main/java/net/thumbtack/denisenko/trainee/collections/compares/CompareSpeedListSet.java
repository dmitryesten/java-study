package net.thumbtack.denisenko.trainee.collections.compares;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class CompareSpeedListSet {

    private long startTime;
    private long endTime;

    public List<Integer> fillRandomValue(List <Integer> list){
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            list.add(random.nextInt(10000));
        }
        return list;
    }

    public long timeList(List<Integer> list, int source){
        startTime = System.nanoTime();
        flag:for(int i = 0; i < 10000; i++){
            for (Integer j: list) {
                if(list.get(j) == source){
                    break flag;
                }
            }
        }
        endTime = System.nanoTime();

        return  endTime - startTime;
    }

    public Set<Integer> fillRandomValue(Set <Integer> set){
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            set.add(random.nextInt(10000));
        }
        return set;
    }


    public long timeSet(Set<Integer> set, int source){
        startTime = System.nanoTime();
        flag:for(int i = 0; i < 10000; i++){
            for (Integer j: set) {
                if(set.contains(source)){
                    break flag;
                }
            }
        }
        endTime = System.nanoTime();

        return  endTime - startTime;
    }


}
