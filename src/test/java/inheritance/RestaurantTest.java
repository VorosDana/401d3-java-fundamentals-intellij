package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void toString1() {
        Restaurant petes = new Restaurant("Pete\'s", 3, 4);
        String actual = petes.toString();

        String expected = "Pete's ★★★☆☆ $$$$_";

        assertEquals(expected, actual);
    }
}