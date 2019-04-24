package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    // Confirms toString works as intended
    @Test
    public void toString1() {
        Restaurant testRest1 = new Restaurant("Golgor's Meats", 4);
        Restaurant testRest2 = new Restaurant("Pile of Mushrooms", 2);
        Restaurant testRest3 = new Restaurant("Tofu Palace", 5);

        testRest1.addReview("Jill", 4, "PROTEIN");
        testRest2.addReview("Jill", 3, "SOME PROTEIN");
        testRest3.addReview("Jill", 1, "NO PROTEIN");

        assertEquals("Golgor's Meats ★★★★☆ $$$$_", testRest1.toString());
        assertEquals("Pile of Mushrooms ★★★☆☆ $$___", testRest2.toString());
        assertEquals("Tofu Palace ★☆☆☆☆ $$$$$", testRest3.toString());
    }

    // Tests initial star setting, and also star count updating with new reviews
    @Test
    public void testReviewStarsChange() {
        Restaurant testRest = new Restaurant("Golgor's Meats", 4);

        testRest.addReview("Jill", 5, "PROTEIN");

        assertEquals(5, testRest.getStars());

        testRest.addReview("Bolzer", 3, "NO VEG");

        assertEquals(4, testRest.getStars());

        testRest.addReview("Reviewy the Reviewer", 1, "Wordy the Word...s");

        assertEquals(3, testRest.getStars());
    }

    // Confirms length of Reviews List across additions
    @Test
    public void testReviewCount() {
        Restaurant testRest = new Restaurant("Golgor's Meats", 4);

        assertEquals(0, testRest.getReviews().size());

        testRest.addReview("Jill", 4, "PROTEIN");

        assertEquals(1, testRest.getReviews().size());

        testRest.addReview("Bolzer", 2, "NO VEG");

        assertEquals(2, testRest.getReviews().size());
    }
}