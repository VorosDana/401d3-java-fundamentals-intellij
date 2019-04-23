package inheritance;

public class Review extends ReviewSiteComponent {
    private String reviewBody;
    private Restaurant reviewTarget;
    private int stars;

    public Review(String authorName, int reviewStars, Restaurant reviewTarget, String reviewBody) {
        super(authorName);
        this.reviewBody = reviewBody;
        this.reviewTarget = reviewTarget;
        this.stars = Math.min(5, Math.max(0, reviewStars));
    }

    public int getStars() {
        return stars;
    }


    @Override
    public String toString() {
        String output = name + "'s review of " + reviewTarget.getName() + "\n";
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
