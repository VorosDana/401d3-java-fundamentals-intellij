package inheritance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Theater implements Rateable {
    private String name;
    private ArrayList<Review> reviews;
    private HashSet<String> movies;

    public Theater(String name) {
        this.name = name;
        this.reviews = new ArrayList<>();
        this.movies = new HashSet<>();
    }

    public void addMovie(String movie) {
        movies.add(movie);
    }

    public void removeMovie(String movie) {
        movies.remove(movie);
    }

    public Set getMovies() {
        return movies;
    }

    public boolean isShowing(String movie) {
        return movies.contains(movie);
    }

    @Override
    public void addReview(String authorName, int reviewStars, String reviewBody) {
        Review newReview = new Review(authorName, reviewStars, this, reviewBody);
        reviews.add(newReview);
    }

    public void addReview(String authorName, int reviewStars, String reviewBody, String movie) {
        Review newReview = new MovieReview(authorName, reviewStars, this, reviewBody, movie);
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

    public String toString() {
        String output = "" + name;

        output += " ";

        for (int i = 0; i < getStars(); i++) {
            output += "★";
        }
        for (int i = getStars(); i < 5; i++) {
            output += "☆";
        }

        output += "\n\nMovies Showing:";

        for (String movie : movies) {
            output += "\n" + movie;
        }


        return output;
    }
}
