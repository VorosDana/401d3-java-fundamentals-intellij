package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void toString1() {
        Restaurant testRest = new Restaurant("Golgor's Meats", 4);

        testRest.addReview("Jill", 4, "PROTEIN");

        Review testRev = testRest.getReviews().get(0);

        String actual = testRev.toString();

        String expected = "Jill's review of Golgor's Meats\n" +
                "★★★★☆\n" +
                "PROTEIN";

        assertEquals(expected, actual);
    }
}