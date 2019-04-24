package inheritance;

public class MovieReview extends Review {
    private String movie;

    public MovieReview(String authorName, int reviewStars, Rateable reviewTarget, String reviewBody, String movie) {
        super(authorName, reviewStars, reviewTarget, reviewBody);
        this.movie = movie;
    }

    public String getMovie() {
        return movie;
    }

    @Override
    public String toString() {
        String output = getReviewer() + "'s review of " + getMovie() + " at " + getReviewTarget().getName() + "\n";
        for (int i = 0; i < getStars(); i++) {
            output += "★";
        }
        for (int i = getStars(); i < 5; i++) {
            output += "☆";
        }

        output += "\n";
        output += getReviewBody();

        return output;
    }
}
