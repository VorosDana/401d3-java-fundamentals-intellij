package inheritance;

public class Restaurant {
    private String name;
    private int stars;
    private int price;

    public Restaurant(String name, int stars, int price) {
        this.name = name;
        // Stars from 0 to 5
        this.stars = Math.min(5, Math.max(0, stars));
        // Price category from 0 to 5
        this.price = Math.min(5, Math.max(0, price));
    }

    @Override
    public String toString() {
        String output = "" + name;

        output += " ";

        for (int i = 0; i < stars; i++) {
            output += "★";
        }
        for (int i = stars; i < 5; i++) {
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
