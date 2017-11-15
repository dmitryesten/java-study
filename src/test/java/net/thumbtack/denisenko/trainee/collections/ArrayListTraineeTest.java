package net.thumbtack.denisenko.trainee.collections;

import net.thumbtack.denisenko.trainee.exceptions.TraineeException;
import net.thumbtack.denisenko.trainee.trainee.Trainee;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class ArrayListTraineeTest {

    List<Trainee> listTtrainee = new ArrayList<>();
    //List<Trainee> listTtrainee = new LinkedList<>()

    public ArrayListTraineeTest() throws TraineeException {
        listTtrainee.add(new Trainee("Tom","Folk", 5));
        listTtrainee.add(new Trainee("Chuck","Lost", 1));
        listTtrainee.add(new Trainee("Lui","Ghoust", 3));
        listTtrainee.add(new Trainee("Anne","Notxor", 4));
        listTtrainee.add(new Trainee("Katary","Middelton", 2));
    }

    @Test
    public void testReverseList() throws Exception {
        List<Trainee> excep = new ArrayList<>();
                excep.add(new Trainee("Katary","Middelton", 2));
                excep.add(new Trainee("Anne","Notxor", 4));
                excep.add(new Trainee("Lui","Ghoust", 3));
                excep.add(new Trainee("Chuck","Lost", 1));
                excep.add(new Trainee("Tom","Folk", 5));
        Collections.reverse(listTtrainee);
        Assert.assertEquals(excep, listTtrainee);
    }

    @Test
    public void testFlashElement() throws Exception {
        List<Trainee> expected = new ArrayList<>();
            expected.add(new Trainee("Anne","Notxor", 4));
            expected.add(new Trainee("Katary","Middelton", 2));
            expected.add(new Trainee("Tom","Folk", 5));
            expected.add(new Trainee("Chuck","Lost", 1));
            expected.add(new Trainee("Lui","Ghoust", 3));

        Collections.rotate(listTtrainee, 2);
        Assert.assertEquals(expected, listTtrainee);
    }

    @Test
    public void testShuffle() throws Exception {
        Collections.shuffle(listTtrainee);
        System.out.println("Случайная перестанова элеменов в спсике:"+listTtrainee);
    }

    @Test
    public void testMaxValueRating() throws Exception {
        Assert.assertEquals(new Trainee("Tom","Folk", 5), Collections.max(listTtrainee));
    }

    @Test
    public void testSortObjectByName() throws Exception {
        Collections.sort(listTtrainee, Trainee.NameComparator);
        System.out.println("Отсортированные обьекты по имени:"+listTtrainee);

    }

    @Test
    public void testSortObjectByRating() throws Exception {
        Collections.sort(listTtrainee, Trainee.RatingComparator);
        System.out.println("Отсортированные обьекты по оценке:"+listTtrainee);

    }

    @Test
    public void testFindObject() throws Exception {
        Trainee test = new Trainee("Anne","Notxor", 4);
        Assert.assertEquals(test,listTtrainee.get(listTtrainee.indexOf(test)));
    }




}
