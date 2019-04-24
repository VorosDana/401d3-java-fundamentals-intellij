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

    @Test
    public void confirmBodyText() {
        Restaurant testRest = new Restaurant("Golgor's Meats", 4);

        testRest.addReview("Jill", 4, "PROTEIN");

        String expected = "PROTEIN";

        String actual = testRest.getReviews().get(0).getReviewBody();

        assertEquals(expected, actual);
    }

    @Test
    public void confirmReviewer() {
        Restaurant testRest = new Restaurant("Golgor's Meats", 4);

        testRest.addReview("Jill", 4, "PROTEIN");

        String expected = "Jill";

        String actual = testRest.getReviews().get(0).getReviewer();

        assertEquals(expected, actual);
    }

    @Test
    public void confirmReviewTarget() {
        Restaurant testRest = new Restaurant("Golgor's Meats", 4);

        testRest.addReview("Jill", 4, "PROTEIN");

        Rateable actual = testRest.getReviews().get(0).getReviewTarget();

        assertSame(testRest, actual);
    }
}