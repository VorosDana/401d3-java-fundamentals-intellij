package inheritance;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TheaterTest {

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
    }

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
    }

    @Test
    public void isShowing() {
        Theater testTheater = new Theater("MOVIES HERE");

        testTheater.addMovie("Puppy Eating Kibble");
        testTheater.addMovie("Rainbow Puppies");

        boolean actual = testTheater.isShowing("Puppy Eating Kibble");

        assertTrue(actual);
    }

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
    }

    @Test
    public void testReviewsToString() {
        Theater testTheater = new Theater("MOVIES HERE");

        testTheater.addReview("Yuvax", 3, "POPCORN OK");
        testTheater.addReview("ZAXOR", 4, "SAD MOVIE GOOD", "Puppy Eating Kibble");

        testTheater.addMovie("Puppy Eating Kibble");
        testTheater.addMovie("Rainbow Puppies");

        List reviews = testTheater.getReviews();

//        String expectedFirst =

        String expectedFirst = "Yuvax's review of MOVIES HERE\n" +
                "★★★☆☆\n" +
                "POPCORN OK";

        String actualFirst = reviews.get(0).toString();

        assertEquals(expectedFirst, actualFirst);

        String expectedSecond = "ZAXOR's review of Puppy Eating Kibble at MOVIES HERE\n" +
                "★★★★☆\n" +
                "SAD MOVIE GOOD\n" +
                "BUILD SUCCESSFUL in 0s";

        String actualSecond = reviews.get(1).toString();

        assertEquals(actualSecond, actualSecond);
    }

    @Test
    public void getStars() {
        Theater testTheater = new Theater("MOVIES HERE");

        testTheater.addReview("Yuvax", 3, "POPCORN OK");

        int expected = 3;
        int actual = testTheater.getStars();

        assertEquals(expected, actual);
    }

    @Test
    public void getName() {
        Theater testTheater = new Theater("MOVIES HERE");

        String expected = "MOVIES HERE";
        String actual = testTheater.getName();

        assertEquals(expected, actual);
    }
}