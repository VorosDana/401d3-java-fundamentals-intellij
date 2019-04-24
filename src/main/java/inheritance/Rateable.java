package inheritance;

import java.util.List;

public interface Rateable {
    public void addReview(String authorName, int reviewStars, String reviewBody);

    public List<Review> getReviews();

    public int getPriceCategory();

    public int getStars();

    public String getName();
}
