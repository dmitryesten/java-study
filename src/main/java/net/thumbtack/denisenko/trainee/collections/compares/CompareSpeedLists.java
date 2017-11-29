package net.thumbtack.denisenko.trainee.collections.compares;

import java.util.List;
import java.util.Random;

public class CompareSpeedLists {

    private long startTime;
    private long endTime;

    public long getSpeedADD(List<Integer> list, int numberValues){
        startTime = System.nanoTime();
        for(int i = 0; i < numberValues; i++)
            list.add(i);
        endTime = System.nanoTime();

        return  endTime - startTime;
    }


    public long getSpeedGET(List<Integer> list, int numberValues, int minRandom, int maxRandom){
        for(int i = 0; i < numberValues; i++)
            list.add(i);

        startTime = System.nanoTime();
        for(int i = 0; i < numberValues; i++)
            list.indexOf(list.get(CompareSpeedLists.randomInRange(minRandom, maxRandom)));
        endTime = System.nanoTime();

        return  endTime - startTime;
    }


    public long getSpeedREMOVE(List<Integer> list, int numberValues, int minRandom, int maxRandom){
        for(int i = 0; i < numberValues; i++)
            list.add(i);

        startTime = System.nanoTime();
        for(int i = 0; i < numberValues; i++)
            list.remove(CompareSpeedLists.randomInRange(minRandom, list.size()));
        endTime = System.nanoTime();

        return  endTime - startTime;
    }


    private static int randomInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

}
