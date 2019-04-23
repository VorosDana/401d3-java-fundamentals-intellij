package inheritance;

public abstract class ReviewSiteComponent {
    //    int stars;
    String name;

    public ReviewSiteComponent(String name) {
        this.name = name;
//        this.stars = Math.min(5, Math.max(0, stars));
    }

    public abstract int getStars();
}
