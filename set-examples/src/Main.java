import domain.Movie;
import domain.MovieListing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Main {

    private void init() {
        System.out.println("Main initiated");

        var movie1 = new Movie("Spider-Man: No Way Home", "Jon Watts", LocalDate.of(2021, 12, 17));
        var movie2 = new Movie("Interstellar", "Christopher Nolan", LocalDate.of(2014, 11, 5));
        var movie3 = new Movie("The Karate Kid", "John G. Avildsen", LocalDate.of(1984, 12, 19));

        System.out.println(movie1.getReleaseDate());
        System.out.println(movie2.getReleaseDateWithFormat("d MMM uuuu"));
        System.out.println(movie3.getReleaseDateWithFormat("E d LLLL, uuuu"));
        System.out.println("-------------------------------------------------------------------");

        var movieListingsJanuary = List.of(
                new MovieListing(movie1, LocalDateTime.of(2022, 1, 21, 10, 0)),
                new MovieListing(movie1, LocalDateTime.of(2022, 1, 21, 16, 0)),
                new MovieListing(movie2, LocalDateTime.of(2022, 1, 19, 18, 0)),
                new MovieListing(movie2, LocalDateTime.of(2022, 1, 19, 22, 0))
        );

        var movieListingsFebruary = List.of(
                new MovieListing(movie3, LocalDateTime.of(2022, 2, 21, 18, 0)),
                new MovieListing(movie3, LocalDateTime.of(2022, 2, 22, 18, 0)),
                new MovieListing(movie3, LocalDateTime.of(2022, 2, 23, 18, 0)),
                new MovieListing(movie3, LocalDateTime.of(2022, 2, 24, 18, 0))
        );

        movieListingsJanuary.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------");

        Set<MovieListing> uniqueMoviesJanuary = new HashSet<>(movieListingsJanuary);
        uniqueMoviesJanuary.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------");

        Set<MovieListing> uniqueMoviesFebruary = new HashSet<>(movieListingsFebruary);
        uniqueMoviesJanuary.addAll(uniqueMoviesFebruary); // Modifies the set you call addAll on
        uniqueMoviesJanuary.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------");

        var combined = new HashSet<MovieListing>(); // Create a new set and just add all entries from both sets, as a Set cannot contain duplicates
        combined.addAll(uniqueMoviesJanuary);
        combined.addAll(uniqueMoviesFebruary);
        combined.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new Main().init();
    }
}
