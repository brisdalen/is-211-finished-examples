import domain.Movie;
import domain.MovieListing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

    private void init() {
        System.out.println("Main initiated");

        var movie1 = new Movie("Spider-Man: No Way Home", "Jon Watts", LocalDate.of(2021, 12, 17));
        var movie2 = new Movie("Interstellar", "Christopher Nolan", LocalDate.of(2014, 11, 5));
        var movie3 = new Movie("The Karate Kid", "John G. Avildsen", LocalDate.of(1984, 12, 19));

        System.out.println(movie1.getReleaseDate());
        System.out.println(movie2.getReleaseDateWithFormat("d MMM uuuu"));
        System.out.println(movie3.getReleaseDateWithFormat("E d LLLL, uuuu"));

        var spidermanListings = List.of(
                new MovieListing(movie1, LocalDateTime.of(2022, 1, 19, 10, 0)),
                new MovieListing(movie1, LocalDateTime.of(2022, 1, 19, 16, 0)),
                new MovieListing(movie1, LocalDateTime.of(2022, 1, 19, 18, 0)),
                new MovieListing(movie1, LocalDateTime.of(2022, 1, 19, 22, 0))
        );

        ArrayList<MovieListing> listingList = new ArrayList<>(spidermanListings);
        listingList.forEach(System.out::println);
        System.out.println("-----------------------------------------------------");

        HashSet<MovieListing> listingSet = new HashSet<>(listingList);
        listingSet.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new Main().init();
    }
}
