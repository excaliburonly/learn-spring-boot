package learn.springboot.movieapi;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepo movieRepo;
    public List<Movie> getMovies() {
        return movieRepo.findAll();
    }

    public Optional<Movie> getMovieById(String id) {
        return movieRepo.findByImdbId(id);
    }
}
