package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cinema {
    List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void findMovieByTime(LocalDateTime time) {
        for (int i = 0; i < movies.size(); i++) {
            for (int j = 0; j < movies.get(i).getFilms().size(); j++) {
                if (time.equals(movies.get(i).getFilms().get(j))) {
                    System.out.println(movies.get(i).getTitle());
                }
            }
        }
    }

    public static void main(String[] args) {
        Cinema cinema = new Cinema();

        cinema.addMovie(new Movie("Titanic", Arrays.asList(
                LocalDateTime.of(2021, 11, 8, 12, 45),
                LocalDateTime.of(2021, 11, 8, 22, 25)
        )));
        cinema.addMovie(new Movie("Jurassic Park", Arrays.asList(
                LocalDateTime.of(2021, 11, 8, 19, 45),
                LocalDateTime.of(2021, 11, 8, 20, 25),
                LocalDateTime.of(2021, 11, 8, 22, 25)
        )));
    }
}
