
package net.thumbtack.denisenko.trainee.introduction.helloworld;


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
