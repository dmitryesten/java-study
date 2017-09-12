
package net.thumbtack.denisenko.trainee.introduction;

//REVU remove
import jdk.nashorn.internal.ir.annotations.Ignore;
import static org.junit.Assert.*;
import org.junit.*;

public class HelloWorldTest {

    HelloWorld helloWorld = new HelloWorld();

    @Test
    public void testPrintStringHelloWorld(){
        assertEquals("Hello, World", helloWorld.printStringHelloWorld());
        assertNotNull(helloWorld.printStringHelloWorld());
    }

}
