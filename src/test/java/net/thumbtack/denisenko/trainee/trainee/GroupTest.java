package net.thumbtack.denisenko.trainee.trainee;

import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import net.thumbtack.denisenko.trainee.trainee.Group;
import net.thumbtack.denisenko.trainee.trainee.Trainee;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GroupTest {

    private Trainee [] trainees = new Trainee[5];
    private List<Trainee> listTrainee = new ArrayList<>();
    private Group group1 = new Group("PIN", trainees);

    public GroupTest() throws TraineeException {
        this.trainees[0] = new Trainee("Tom","Folk", 5);
        this.trainees[1] = new Trainee("Chuck","Lost", 1);
        this.trainees[2] = new Trainee("Lui","Ghoust", 3);
        this.trainees[3] = new Trainee("Anne","Notxor", 4);
        this.trainees[4] = new Trainee("Katary","Middelton", 2);


        listTrainee.add(new Trainee("Lui","Ghoust", 3));
        listTrainee.add(new Trainee("Chuck","Lost", 1));
        listTrainee.add(new Trainee("Tom","Folk", 5));
        listTrainee.add(new Trainee("Anne","Notxor", 4));
        listTrainee.add(new Trainee("Katary","Middelton", 2));
    }

    @Test
    public void testReversList(){
        Collections.reverse(listTrainee);
        assertEquals(listTrainee.toString(),listTrainee.toString() );
    }


    @Test
    public void testSortByName(){
        Arrays.sort(group1.getTrainees(), Trainee.NameComparator);
        String s = Arrays.toString(group1.getTrainees());
        assertEquals(s, Arrays.toString(group1.getTrainees()));
    }


    @Test
    public void testSortByRating(){
        Arrays.sort(group1.getTrainees(), Trainee.RatingComparator);
        String s = Arrays.toString(group1.getTrainees());
        assertEquals(s, Arrays.toString(group1.getTrainees()));
    }


    @Test
    public void testSortBySurname(){
        Arrays.sort(group1.getTrainees(), Trainee.SurnameComparator);
        String s = Arrays.toString(group1.getTrainees());
        assertEquals(s, Arrays.toString(group1.getTrainees()));
    }


    @Test(expected = TraineeException.class)
    public void getNullName() throws Exception {
        Group group = new Group("PIN131",new Trainee[5]);
        assertEquals("PIN131", group.getName());
        group.setName(null);
        assertEquals(null, group.getName());
    }

    @Test(expected = TraineeException.class)
    public void getEmptyName() throws Exception {
        Group group = new Group("PIN131",new Trainee[5]);
        assertEquals("PIN131", group.getName());
        group.setName(null);
        assertEquals(null, group.getName());
    }

    @Test(expected = TraineeException.class)
    public void getNullTrainees() throws Exception {
        Trainee [] trainees = new Trainee[5];
        Group group = new Group("PIN131",trainees);
        assertEquals(5, group.getTrainees().length);
            group.setTrainees(null);
        assertEquals(null, group.getTrainees().length);
    }

    @Test(expected = TraineeException.class)
    public void getEmptyTrainees() throws Exception {
        Trainee [] trainees = new Trainee[5];
        Group group = new Group("PIN131",trainees);
        group.setTrainees(new Trainee[0]);
        assertEquals(0, group.getTrainees().length);

    }

}