package inheritance;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TheaterTest {

    // Make sure movies are added properly
    @Test
    public void addMovie() {
        Theater testTheater = new Theater("MOVIES HERE");

        int expected = 0;
        int actual = testTheater.getMovies().size();

        assertEquals(expected, actual);

        testTheater.addMovie("Puppy Eating Kibble");
        testTheater.addMovie("Rainbow Puppies");

        expected = 2;
        actual = testTheater.getMovies().size();

        assertEquals(expected, actual);

        testTheater.addMovie("Rainbow Puppies 2: Now With Indigo");

        expected = 3;
        actual = testTheater.getMovies().size();

        assertEquals(expected, actual);
    }

    // Make sure movies can be removed as intended
    @Test
    public void removeMovie() {
        Theater testTheater = new Theater("MOVIES HERE");

        int expected = 0;
        int actual = testTheater.getMovies().size();

        assertEquals(expected, actual);

        testTheater.addMovie("Puppy Eating Kibble");
        testTheater.addMovie("Rainbow Puppies");

        expected = 2;
        actual = testTheater.getMovies().size();

        assertEquals(expected, actual);

        testTheater.removeMovie("Rainbow Puppies");

        expected = 1;
        actual = testTheater.getMovies().size();

        assertEquals(expected, actual);

        assertFalse(testTheater.isShowing("Rainbow Puppies"));
    }

    // Test that check for a movie showing is working
    @Test
    public void isShowing() {
        Theater testTheater = new Theater("MOVIES HERE");

        testTheater.addMovie("Puppy Eating Kibble");
        testTheater.addMovie("Rainbow Puppies");


        assertTrue(testTheater.isShowing("Puppy Eating Kibble"));
        assertTrue(testTheater.isShowing("Rainbow Puppies"));
        assertFalse(testTheater.isShowing("Murder Puppies"));
    }

    //
    @Test
    public void getReviews() {
        Theater testTheater = new Theater("MOVIES HERE");

        testTheater.addReview("Yuvax", 3, "POPCORN OK");
        int expected = 1;
        int actual = testTheater.getReviews().size();

        assertEquals(expected, actual);

        testTheater.addReview("ZAXOR", 4, "SAD MOVIE GOOD", "Puppy Eating Kibble");

        expected = 2;
        actual = testTheater.getReviews().size();

        assertEquals(expected, actual);
        assertEquals(4, actual = testTheater.getReviews().get(1).getStars());
    }

    @Test
    public void testToString() {
        Theater testTheater = new Theater("MOVIES HERE");

        testTheater.addReview("Yuvax", 3, "POPCORN OK");
        testTheater.addReview("ZAXOR", 4, "SAD MOVIE GOOD", "Puppy Eating Kibble");

        testTheater.addMovie("Puppy Eating Kibble");
        testTheater.addMovie("Rainbow Puppies");

        String expected = "MOVIES HERE ★★★☆☆\n" +
                "\n" +
                "Movies Showing:\n" +
                "Puppy Eating Kibble\n" +
                "Rainbow Puppies";

        String actual = testTheater.toString();

        assertEquals(expected, actual);

        String reviewOneExpected = "Yuvax's review of MOVIES HERE\n" +
                "★★★☆☆\n" +
                "POPCORN OK";
        String reviewTwoExpected = "ZAXOR's review of Puppy Eating Kibble at MOVIES HERE\n" +
                "★★★★☆\n" +
                "SAD MOVIE GOOD";

        String reviewOneActual = testTheater.getReviews().get(0).toString();
        String reviewTwoActual = testTheater.getReviews().get(1).toString();

        assertEquals(reviewOneExpected, reviewOneActual);
        assertEquals(reviewTwoExpected, reviewTwoActual);
    }


    @Test
    public void getStars() {
        Theater testTheater = new Theater("MOVIES HERE");

        testTheater.addReview("Yuvax", 3, "POPCORN OK");

        int expected = 3;
        int actual = testTheater.getStars();

        assertEquals(expected, actual);

        testTheater.addReview("ZAXOR", 5, "SAD MOVIE GOOD", "Puppy Eating Kibble");

        assertEquals(4, testTheater.getStars());

        testTheater.addReview("DAK", 1, "BAD");

        assertEquals(3, testTheater.getStars());
    }

    @Test
    public void getName() {
        Theater testTheater = new Theater("MOVIES HERE");
        Theater testTwoter = new Theater("MOVIES THERE");
        Theater testThreeter = new Theater("MOVIES EVERYWHERE");

        assertEquals("MOVIES HERE", testTheater.getName());
        assertEquals("MOVIES THERE", testTwoter.getName());
        assertEquals("MOVIES EVERYWHERE", testThreeter.getName());
    }
}