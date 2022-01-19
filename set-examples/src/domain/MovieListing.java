package domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class MovieListing {

    private Movie movie;
    private LocalDateTime showtime;

    public MovieListing(Movie movie, LocalDateTime showtime) {
        this.movie = movie;
        this.showtime = showtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieListing that = (MovieListing) o;
        // Not correct from a object-oriented standpoint, but doing it like this for the example
        return movie.equals(that.movie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie);
    }

    @Override
    public String toString() {
        return "MovieListing{" +
                "movie=" + movie +
                ", showtime='" + showtime.format(DateTimeFormatter.ofPattern("\"'B, kk:mm'")) +
                "'}";
    }
}
