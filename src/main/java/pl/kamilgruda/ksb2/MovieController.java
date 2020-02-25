package pl.kamilgruda.ksb2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    List<Movie> lists = new ArrayList<>();


    @GetMapping
    public List<Movie> getMovie() {
        return lists;
    }

    @PostMapping
    @SendEmail
    public boolean addMovie(Movie movie) {
        return lists.add(movie);
    }

}
