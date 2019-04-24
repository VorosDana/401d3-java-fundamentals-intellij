package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Rateable {
    private String name;
    private String description;
    private int priceCategory;
    private ArrayList<Review> reviews;

    public Shop(String name, String description, int priceCategory) {
        this.name = name;
        this.description = description;
        this.priceCategory = priceCategory;
        this.reviews = new ArrayList<>();
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    @Override
    public void addReview(String authorName, int reviewStars, String reviewBody) {
        Review newReview = new Review(authorName, reviewStars, this, reviewBody);
        reviews.add(newReview);
    }

    @Override
    public List<Review> getReviews() {
        return reviews;
    }

    @Override
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

    @Override
    public String getName() {
        return name;
    }
}
