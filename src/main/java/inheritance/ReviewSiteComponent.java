package inheritance;

public class ReviewSiteComponent {
    int stars;
    String name;

    public ReviewSiteComponent(String name, int stars) {
        this.name = name;
        this.stars = Math.min(5, Math.max(0, stars));
    }
}
