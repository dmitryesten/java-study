package net.thumbtack.denisenko.trainee.collections;

import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import net.thumbtack.denisenko.trainee.trainee.Trainee;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Task_6.11
 */
public class QueueTest {

    private Queue<Trainee> listQueue = new LinkedList<>();
    private Queue<Trainee> priorityQueue = new PriorityQueue<>();


    @Test
    public void testNotEmptyListQueue() throws Exception {
        listQueue.add(new Trainee("Malder", "Fox", 5));
        listQueue.add(new Trainee("Dana", "Scully", 4));
        listQueue.add(new Trainee("Western", "Mouse", 4));

        assertFalse(listQueue.isEmpty());
    }

    @Test
    public void testNotEmptyPriorityQueue() throws Exception {
        priorityQueue.add(new Trainee("Malder", "Fox", 5));
        priorityQueue.add(new Trainee("Dana", "Scully", 4));
        priorityQueue.add(new Trainee("Western", "Mouse", 4));

        assertFalse(priorityQueue.isEmpty());
    }

    @Test
    public void testSelectElementsListQueue() throws Exception {
        System.out.println("ListQueue:");
        listQueue.add(new Trainee("Malder", "Fox", 5));
        listQueue.add(new Trainee("Dana", "Scully", 4));
        listQueue.add(new Trainee("Western", "Mouse", 4));
        for (Trainee t : listQueue)
            System.out.print(t);

    }


    @Test
    public void testSelectElementsPriorityQueue() throws Exception {
        System.out.println("PriorityQueue: ");
        priorityQueue.add(new Trainee("Malder", "Fox", 5));
        priorityQueue.add(new Trainee("Dana", "Scully", 4));
        priorityQueue.add(new Trainee("Western", "Mouse", 4));


        for (Trainee t : priorityQueue)
            System.out.print(t);

        //Iterator<Trainee> iterator = priorityQueue.iterator();
        //while(iterator.hasNext())
        //    System.out.println(iterator.next());

    }
}


