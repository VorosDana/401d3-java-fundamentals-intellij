package inheritance;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void addReview() {
        Shop testShop = new Shop("Pile of Stuff", "It's a big pile of stuff, come get some", 1);

        List<Review> testReviews = testShop.getReviews();

        assertEquals(0, testReviews.size());

        testShop.addReview("Blorp", 3, "Disorganized");

        assertEquals(1, testReviews.size());
    }

    @Test
    public void getStars() {
        Shop testShop = new Shop("Pile of Stuff", "It's a big pile of stuff, come get some", 1);

        assertEquals(1, testShop.getPriceCategory());
    }

    @Test
    public void getName() {
        Shop testShop = new Shop("Pile of Stuff", "It's a big pile of stuff, come get some", 1);

        String expected = "Pile of Stuff";

        String actual = testShop.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        Shop testShop = new Shop("Pile of Stuff", "It's a big pile of stuff, come get some", 1);

        testShop.addReview("Blorp", 3, "Disorganized");

        String expected = "Pile of Stuff ★★★☆☆ $____";

        String actual = testShop.toString();

        assertEquals(expected, actual);
    }
}