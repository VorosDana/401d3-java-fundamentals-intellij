package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends ReviewSiteComponent {
    private int price;
    private List<Review> reviews = new ArrayList<>();

    public Restaurant(String name, int price) {
        super(name);
        // Price category from 0 to 5
        this.price = Math.min(5, Math.max(0, price));
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        int reviewQuantity = 0;
        int reviewTotal = 0;

        for (Review rev : reviews) {
            reviewQuantity++;
            reviewTotal += rev.getStars();
        }

        int stars = (reviewQuantity > 0 ? reviewTotal / reviewQuantity : 0);
        return stars;
    }

    public int getPriceCategory() {
        return price;
    }

    public void addReview(String authorName, int reviewStars, String reviewBody) {
        Review newReview = new Review(authorName, reviewStars, this, reviewBody);
        reviews.add(newReview);
    }

    public List<Review> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        String output = "" + name;

        output += " ";

        for (int i = 0; i < getStars(); i++) {
            output += "★";
        }
        for (int i = getStars(); i < 5; i++) {
            output += "☆";
        }

        output += " ";

        for (int i = 0; i < price; i++) {
            output += "$";
        }
        for (int i = price; i < 5; i++) {
            output += "_";
        }

        return output;
    }
}
