package net.thumbtack.denisenko.trainee.collections;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class CompareSpeedLists {



    public long getSpeedADD(List<Integer> list, int numberValues){
        Date startLinked = new Date();
        for(int i = 0; i < numberValues; i++)
            list.add(i);
        Date finishLinked = new Date();

        return  finishLinked.getTime() - startLinked.getTime();
    }


    public long getSpeedGET(List<Integer> list, int numberValues, int minRandom, int maxRandom){
        Random random = new Random();
        CompareSpeedLists.randomInRange(minRandom, maxRandom);

        for(int i = 0; i < numberValues; i++)
            list.add(i);

        Date startLinked = new Date();
        for(int i = 0; i < numberValues; i++)
            list.indexOf(list.get(CompareSpeedLists.randomInRange(minRandom, maxRandom)));
        Date finishLinked = new Date();

        return  finishLinked.getTime() - startLinked.getTime();
    }


    public long getSpeedREMOVE(List<Integer> list, int numberValues, int minRandom, int maxRandom){
        Random random = new Random();

        for(int i = 0; i < numberValues; i++)
            list.add(i);

        Date startLinked = new Date();
        for(int i = 0; i < numberValues; i++)
            list.remove(CompareSpeedLists.randomInRange(minRandom, list.size()));
        Date finishLinked = new Date();

        return  finishLinked.getTime() - startLinked.getTime();
    }


    private static int randomInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

}
