package org.example.stream.map;

import org.example.model.Movie;

import java.util.Comparator;
import java.util.List;

public class MapDemo {

    public static void show() {

        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30));

        movies.stream()
                .map(movie -> movie.getTitle())
                .forEach(name -> System.out.println(name));

        movies.stream()
                .mapToInt(movie -> movie.getLikes())
                .forEach(like -> System.out.println(like));

        //filtering
        movies.stream()
                .filter(m -> m.getLikes() > 10)
                .forEach(movie -> movie.getTitle());

        // limit, skip, takeWhile, dropWhile
        movies.stream()
                .limit(2)
                .forEach(m -> System.out.println(m.getTitle()));

        movies.stream()
                .skip(2)
                .forEach(m -> System.out.println(m.getTitle()));

        // => pagination

        // takeWhile
        movies.stream()
                .takeWhile(m -> m.getLikes() < 30)
                .forEach(m -> System.out.println(m.getTitle()));

        //sorting
        movies.stream()
                .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
//                .sorted(Comparator.comparing(m -> m.getTitle())) // better
                .forEach(m -> System.out.println(m.getTitle()));
    }
}
