
package net.thumbtack.denisenko.trainee.introduction.task1;


import static org.junit.Assert.*;

import net.thumbtack.denisenko.trainee.introduction.task1.HelloWorld;
import org.junit.*;

public class HelloWorldTest {

    HelloWorld helloWorld = new HelloWorld();

    @Test
    public void testPrintStringHelloWorld(){
        assertEquals("Hello, World", helloWorld.printStringHelloWorld());
        assertNotNull(helloWorld.printStringHelloWorld());
    }

}
