package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void toString1() {
        Restaurant petes = new Restaurant("Pete\'s", 4);
        String actual = petes.toString();

        String expected = "Pete's ★★★☆☆ $$$$_";

        assertEquals(expected, actual);
    }

    @Test
    public void testReviewStarsChange() {
        Restaurant testRest = new Restaurant("Golgor's Meats", 4);

        testRest.addReview("Jill", 4, "PROTEIN");

        assertEquals(4, testRest.getStars());

        testRest.addReview("Bolzer", 2, "NO VEG");

        assertEquals(3, testRest.getStars());
    }
}