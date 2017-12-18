package com.pansy;

import javax.inject.Inject;
import javax.inject.Named;

//@Named("MovieLister") //@ManagerBean("MovieLister") could be used as well
@Named
public class SimpleMovieList2 {
    private MovieFinder movieFinder;

    @Inject
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }
}
