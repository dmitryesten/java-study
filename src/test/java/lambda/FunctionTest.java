package lambda;


import net.thumbtack.denisenko.trainee.lambda.Person;
import org.junit.Assert;

import java.util.*;
import java.util.function.*;

import org.junit.Test;

public class FunctionTest {

    @Test
    public void testSplit(){
        String myString = "Hello, world!";
        List<String> listWords = new ArrayList<>();
        Function<String, List<String>> split = x -> Arrays.asList(myString.split(" "));

        listWords = split.apply(myString);
        Assert.assertNotNull(listWords);
    }

    @Test
    public void testCount(){
        List <?> list = Arrays.asList('1', new Object(), 45);
        Integer countElements;
        Function<List<?>, Integer> count = List::size;
        //Function<List<?>, Integer> count = x -> x.size();

        Assert.assertNotNull(list);
        countElements = count.apply(list);
        Assert.assertEquals(java.util.Optional.ofNullable(list.size()), java.util.Optional.ofNullable(countElements));

    }

    @Test
    public void testIntegrationSplitCount() {
        String actualString = "Hello world, how are you?";
        int countWords;
        Function<String, List<String>> split = x -> Arrays.asList(actualString.split(" "));
        Function<List<?>, Integer> count = List::size;
        //Function<List<?>, Integer> count = x -> x.size();

        Assert.assertNotNull(actualString);
        countWords = count.apply(split.apply(actualString));
        Assert.assertEquals(5, countWords);

        countWords = split.andThen(count).apply(actualString);
        Assert.assertEquals(5, countWords);

        countWords = count.compose(split).apply(actualString);
        Assert.assertEquals(5, countWords);

    }

    @Test
    public void testCreatePerson(){
        String namePerson = "Ivan";
        Function<String, Person> create = name -> new Person(name);
        Person p = create.apply("Ivan");
        Assert.assertEquals(namePerson, p.getName());
    }

    @Test
    public void testCreatePersonMethodRef(){
        String namePerson = "Ivan";
        Function<String, Person> create = Person::new;
        Person p = create.apply("Ivan");
        Assert.assertEquals(namePerson, p.getName());
    }

    @Test
    public void testMax(){
        IntBinaryOperator max = (a, b) -> a >= b ? a : b;
        Assert.assertEquals(10, max.applyAsInt(10, 5));
    }

    @Test
    public void testGetCurrentDate(){
        Supplier<String> getCurrentDate = () -> new Date().toString();
        Assert.assertEquals(new Date().toString(), getCurrentDate.get());
    }

    @Test
    public void testIsEven(){
        Predicate<Integer> areEqual = (a) -> a % 2 == 0 ? true : false;
        Assert.assertEquals(true, areEqual.test(2));
        Assert.assertEquals(false, areEqual.test(5));
    }


    @Test
    public void testAreEqual(){
        BiPredicate<Integer, Integer> areEqual = (a, b) -> a == b ? true : false;
        Assert.assertEquals(true, areEqual.test(10, 10));
        Assert.assertEquals(false, areEqual.test(10, 5));
    }




}
