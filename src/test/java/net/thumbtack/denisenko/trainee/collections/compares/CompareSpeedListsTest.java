package net.thumbtack.denisenko.trainee.collections.compares;

import net.thumbtack.denisenko.trainee.collections.compares.CompareSpeedLists;
import org.junit.Test;


import java.util.ArrayList;
import java.util.LinkedList;

public class CompareSpeedListsTest {

    @Test
    public void getSpeedAdd() throws Exception {
        CompareSpeedLists compare = new CompareSpeedLists();
        long msArrayList = compare.getSpeedADD(new ArrayList<Integer>(), 1000000);
        long msLinkedList = compare.getSpeedADD(new LinkedList<Integer>(), 1000000);
        System.out.println("----ADD----");
        System.out.println("ArrayList " + msArrayList + " ms");
        System.out.println("LinkedList " + msLinkedList + " ms");
    }


    @Test
    public void getSpeedGET() throws Exception {
        CompareSpeedLists compare = new CompareSpeedLists();
        long msArrayList;
        long msLinkedList;
        msArrayList = compare.getSpeedGET(new ArrayList<Integer>(), 10000,0, 1000);
        msLinkedList = compare.getSpeedGET(new LinkedList<Integer>(), 10000, 0, 1000);
        System.out.println("----GET begin----");
        System.out.println("ArrayList: " + msArrayList + " ms");
        System.out.println("LinkedList: " + msLinkedList + " ms");

        msArrayList = compare.getSpeedGET(new ArrayList<Integer>(), 10000,5000, 6000);
        msLinkedList = compare.getSpeedGET(new LinkedList<Integer>(), 10000, 5000, 6000);
        System.out.println("----GET middle----");
        System.out.println("ArrayList: " + msArrayList + " ms");
        System.out.println("LinkedList: " + msLinkedList + " ms");

        msArrayList = compare.getSpeedGET(new ArrayList<Integer>(), 10000,9500, 10000);
        msLinkedList = compare.getSpeedGET(new LinkedList<Integer>(), 10000, 9500, 10000);
        System.out.println("----GET end----");
        System.out.println("ArrayList: " + msArrayList + " ms");
        System.out.println("LinkedList: " + msLinkedList + " ms");
    }


    @Test
    public void getSpeedREMOVE() throws Exception {
        CompareSpeedLists compare = new CompareSpeedLists();
        long msArrayList;
        long msLinkedList;
        msArrayList = compare.getSpeedREMOVE(new ArrayList<Integer>(), 10000,0, 10000);
        msLinkedList = compare.getSpeedREMOVE(new LinkedList<Integer>(), 10000, 0, 10000);
        System.out.println("----REMOVE----");
        System.out.println("ArrayList: " + msArrayList + " ms");
        System.out.println("LinkedList: " + msLinkedList + " ms");

    }






}