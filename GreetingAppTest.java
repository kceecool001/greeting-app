import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GreetingAppTest {

    @Test
    public void testBuildGreetingWithName() {
        String result = GreetingApp.buildGreeting("Alice");
        assertEquals("Hello, Alice! Welcome.", result);
    }

    @Test
    public void testBuildGreetingWithEmpty() {
        String result = GreetingApp.buildGreeting("");
        assertEquals("Hello! (no name provided)", result);
    }

    @Test
    public void testBuildGreetingWithNull() {
        String result = GreetingApp.buildGreeting(null);
        assertEquals("Hello! (no name provided)", result);
    }
}
