package com.sastelvio.movies.service;

import com.sastelvio.movies.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sastelvio.movies.entity.Movie;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovie(){
        return movieRepository.findAll();
    }
    public Optional<Movie> singleMovie(String imdbId){return movieRepository.findMovieByImdbId(imdbId);}
}
