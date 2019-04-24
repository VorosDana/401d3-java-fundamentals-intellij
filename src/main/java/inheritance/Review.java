package inheritance;

public class Review {
    private String reviewBody;
    private Rateable reviewTarget;
    private int stars;
    private String authorName;

    public Review(String authorName, int reviewStars, Rateable reviewTarget, String reviewBody) {
        this.authorName = authorName;
        this.reviewBody = reviewBody;
        this.reviewTarget = reviewTarget;
        this.stars = Math.min(5, Math.max(0, reviewStars));
    }

    public int getStars() {
        return stars;
    }

    public String getReviewBody() {
        return reviewBody;
    }

    public String getReviewer() {
        return authorName;
    }

    public Rateable getReviewTarget() {
        return reviewTarget;
    }

    @Override
    public String toString() {
        String output = authorName + "'s review of " + reviewTarget.getName() + "\n";
        for (int i = 0; i < stars; i++) {
            output += "★";
        }
        for (int i = stars; i < 5; i++) {
            output += "☆";
        }

        output += "\n";
        output += reviewBody;

        return output;
    }
}
