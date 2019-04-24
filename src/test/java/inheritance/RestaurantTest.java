package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    // Confirms toString works as intended
    @Test
    public void toString1() {
        Restaurant petes = new Restaurant("Pete\'s", 4);
        petes.addReview("Pete", 3, "Come try my food PLEASE");
        String actual = petes.toString();

        String expected = "Pete's ★★★☆☆ $$$$_";

        assertEquals(expected, actual);
    }

    // Tests initial star setting, and also updating
    @Test
    public void testReviewStarsChange() {
        Restaurant testRest = new Restaurant("Golgor's Meats", 4);

        testRest.addReview("Jill", 4, "PROTEIN");

        assertEquals(4, testRest.getStars());

        testRest.addReview("Bolzer", 2, "NO VEG");

        assertEquals(3, testRest.getStars());
    }

    // Confirms length of Reviews List across additions
    @Test
    public void testReviewCount() {
        Restaurant testRest = new Restaurant("Golgor's Meats", 4);

        testRest.addReview("Jill", 4, "PROTEIN");

        assertEquals(1, testRest.getReviews().size());

        testRest.addReview("Bolzer", 2, "NO VEG");

        assertEquals(2, testRest.getReviews().size());
    }
}