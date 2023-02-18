package dev.rishi.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MovieRepository extends MongoRepository<Movies , ObjectId> {

    Optional<Movies> findMovieByImdbId(String imdbId);
}
