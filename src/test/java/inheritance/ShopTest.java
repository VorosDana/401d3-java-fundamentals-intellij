package inheritance;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ShopTest {

    // Make sure Reviews are getting added properly by checking size between review adds
    @Test
    public void addReview() {
        Shop testShop = new Shop("Pile of Stuff", "It's a big pile of stuff, come get some", 1);

        List<Review> testReviews = testShop.getReviews();

        assertEquals(0, testReviews.size());

        testShop.addReview("Blorp", 3, "Disorganized");

        assertEquals(1, testReviews.size());

        testShop.addReview("Blerp", 3, "Organized");

        assertEquals(2, testReviews.size());
    }

    // Check star levels between review adds
    @Test
    public void addReviewTestStars() {
        Shop testShop = new Shop("Pile of Stuff", "It's a big pile of stuff, come get some", 1);

        assertEquals(0, testShop.getStars());

        testShop.addReview("Blorp", 3, "Disorganized");

        assertEquals(3, testShop.getStars());

        testShop.addReview("Blerp", 5, "Organized");

        assertEquals(4, testShop.getStars());
    }

    // Make sure price categories are working right
    @Test
    public void getPriceCategory() {
        Shop testShop = new Shop("Pile of Stuff", "It's a big pile of stuff, come get some", 1);
        Shop testShopTwo = new Shop("THINGS", "IS STUFF", 3);
        Shop testShopThree = new Shop("FLURGLE GURGLE", "PLERP", 2);

        assertEquals(1, testShop.getPriceCategory());
        assertEquals(3, testShopTwo.getPriceCategory());
        assertEquals(2, testShopThree.getPriceCategory());
    }

    // Make sure name is stored properly
    @Test
    public void getName() {
        Shop testShop = new Shop("Pile of Stuff", "It's a big pile of stuff, come get some", 1);
        Shop testShopTwo = new Shop("THINGS", "IS STUFF", 3);
        Shop testShopThree = new Shop("FLURGLE GURGLE", "PLERP", 2);

        assertEquals("Pile of Stuff", testShop.getName());
        assertEquals("THINGS", testShopTwo.getName());
        assertEquals("FLURGLE GURGLE", testShopThree.getName());
    }

    // Confirm entire toString is working as intended
    @Test
    public void testToString() {
        Shop testShop = new Shop("Pile of Stuff", "It's a big pile of stuff, come get some", 1);
        Shop testShopTwo = new Shop("THINGS", "IS STUFF", 3);
        Shop testShopThree = new Shop("FLURGLE GURGLE", "PLERP", 2);

        testShop.addReview("Blorp", 3, "Disorganized");
        testShopTwo.addReview("STUFFLOVER", 5, "STUFFF!!!!");
        testShopThree.addReview("SHLURP", 4, "GLORP");


        assertEquals("Pile of Stuff ★★★☆☆ $____",
                testShop.toString());
        assertEquals("THINGS ★★★★★ $$$__",
                testShopTwo.toString());
        assertEquals("FLURGLE GURGLE ★★★★☆ $$___",
                testShopThree.toString());
    }
}