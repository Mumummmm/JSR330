package com.pansy;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

public class SimpleMovieLister {
//    private MovieFinder movieFinder;
    private Provider<MovieFinder> movieFinder;

//    @Inject
//    public void setMovieFinder(MovieFinder movieFinder) {
//        this.movieFinder = movieFinder;
//    }

    @Inject
    public void setMovieFinder(@Named("main") Provider<MovieFinder> movieFinder) {
        this.movieFinder = movieFinder;
    }

//    public void listMovies() {
//        this.movieFinder.findMovies();
//    }
    public void listMovies() {
        this.movieFinder.get().findMovies();
    }
}
