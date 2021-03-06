package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class StreamPatterns {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String theMoviesStore = movieStore.getMovies().values().stream()
                .flatMap(movie -> movie.stream())
                .collect(Collectors.joining("!"));

        System.out.println(theMoviesStore);
    }
}
