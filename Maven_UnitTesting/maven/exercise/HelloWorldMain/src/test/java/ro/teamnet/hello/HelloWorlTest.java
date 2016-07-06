package ro.teamnet.hello;

import org.junit.Test;

/**
 * Created by user on 7/6/2016.
 */
public class HelloWorlTest {
    @Test
    public void testSayHello(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();
        assert helloWorld.returnHelloKey().equals("HelloKey");
    }

    @Test
    public void testReturnHelloKey(){
        HelloWorld helloWorld = new HelloWorld();
        System.out.println("From Test: " + helloWorld.returnHelloKey());
    }

}
