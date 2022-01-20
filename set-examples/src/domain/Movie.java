package domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Movie {

    private String name;
    private String directorName;
    // US release date is used
    private LocalDate releaseDate;

    /*
    TODO: add constructor, and overrides for equals and hashCode
     */
    public Movie(String name, String directorName, LocalDate releaseDate) {
        this.name = name;
        this.directorName = directorName;
        this.releaseDate = releaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return name.equals(movie.name) && directorName.equals(movie.directorName) && releaseDate.equals(movie.releaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, directorName, releaseDate);
    }

    public String getName() {
        return name;
    }

    public String getDirectorName() {
        return directorName;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    /*
    Format release date based on a simple pattern of letters and symbols as described in the class documentation.
    For example, d MMM uuuu will format 2011-12-03 as '3 Dec 2011'.
    https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/time/format/DateTimeFormatter.html#patterns
     */
    public String getReleaseDateWithFormat(String format) {
        return releaseDate.format(DateTimeFormatter.ofPattern(format));
    }

    public String getReleaseDateWithFormat() {
        return getReleaseDateWithFormat("d MMM uuuu");
    }

    @Override
    public String toString() {
        return "Movie{\n" +
                "\tname='" + name + '\'' +
                ", directorName='" + directorName + '\'' +
                ", releaseDate='" + getReleaseDateWithFormat() + "'\n" +
                '}';
    }
}
