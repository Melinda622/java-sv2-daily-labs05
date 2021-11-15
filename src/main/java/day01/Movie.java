package day01;

import java.time.LocalDateTime;
import java.util.List;

public class Movie {
    private String title;
    private List<LocalDateTime> films;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<LocalDateTime> getFilms() {
        return films;
    }

    public void setFilms(List<LocalDateTime> films) {
        this.films = films;
    }

    public Movie(String title, List<LocalDateTime> films) {
        this.title = title;
        this.films = films;
    }
}
