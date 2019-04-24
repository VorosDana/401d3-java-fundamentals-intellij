package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    // Confirms toString implementation of Review
    @Test
    public void toString1() {
        Restaurant testRest = new Restaurant("Golgor's Meats", 4);

        testRest.addReview("Jill", 4, "PROTEIN");
        testRest.addReview("PERSON", 2, "WORDS");
        testRest.addReview("NOT PERSON", 1, "NOT WORDS");

        Review testRev1 = testRest.getReviews().get(0);
        Review testRev2 = testRest.getReviews().get(1);
        Review testRev3 = testRest.getReviews().get(2);


        assertEquals("Jill's review of Golgor's Meats\n" +
                        "★★★★☆\n" +
                        "PROTEIN",
                testRev1.toString());
        assertEquals("PERSON's review of Golgor's Meats\n" +
                        "★★☆☆☆\n" +
                        "WORDS",
                testRev2.toString());
        assertEquals("NOT PERSON's review of Golgor's Meats\n" +
                        "★☆☆☆☆\n" +
                        "NOT WORDS",
                testRev3.toString());
    }

    // Confirms body text of Review
    @Test
    public void confirmBodyText() {
        Restaurant testRest = new Restaurant("Golgor's Meats", 4);

        testRest.addReview("Jill", 4, "PROTEIN");
        testRest.addReview("PERSON", 2, "WORDS");
        testRest.addReview("NOT PERSON", 1, "NOT WORDS");

        Review testRev1 = testRest.getReviews().get(0);
        Review testRev2 = testRest.getReviews().get(1);
        Review testRev3 = testRest.getReviews().get(2);

        assertEquals("PROTEIN", testRev1.getReviewBody());
        assertEquals("WORDS", testRev2.getReviewBody());
        assertEquals("NOT WORDS", testRev3.getReviewBody());
    }

    // Confirms reviewer name is correct
    @Test
    public void confirmReviewer() {
        Restaurant testRest = new Restaurant("Golgor's Meats", 4);

        testRest.addReview("Jill", 4, "PROTEIN");
        testRest.addReview("PERSON", 2, "WORDS");
        testRest.addReview("NOT PERSON", 1, "NOT WORDS");

        assertEquals("Jill",
                testRest.getReviews().get(0).getReviewer());
        assertEquals("PERSON",
                testRest.getReviews().get(1).getReviewer());
        assertEquals("NOT PERSON",
                testRest.getReviews().get(2).getReviewer());
    }

    // Confirms review's target is the same object as the object that created it
    @Test
    public void confirmReviewTarget() {
        Restaurant testRest1 = new Restaurant("Golgor's Meats", 4);
        Restaurant testRest2 = new Restaurant("Pile of Mushrooms", 2);
        Restaurant testRest3 = new Restaurant("Tofu Palace", 5);

        testRest1.addReview("Jill", 4, "PROTEIN");
        testRest2.addReview("Jill", 3, "SOME PROTEIN");
        testRest3.addReview("Jill", 1, "NO PROTEIN");


        assertSame(testRest1,
                testRest1.getReviews().get(0).getReviewTarget());
        assertSame(testRest2,
                testRest2.getReviews().get(0).getReviewTarget());
        assertSame(testRest3,
                testRest3.getReviews().get(0).getReviewTarget());

    }
}