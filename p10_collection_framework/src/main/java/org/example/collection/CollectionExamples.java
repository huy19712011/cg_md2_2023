package org.example.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionExamples {

    public static void show() {

        Collection<String> collection = new ArrayList<>();

        collection.add("a");
        collection.add("b");
        collection.add("c");

        System.out.println(collection);

        for (var i : collection) System.out.println(i);

        collection.forEach(item -> System.out.println(item));

        collection.forEach(System.out::println);

        Collections.addAll(collection, "d", "e", "f");
        System.out.println(collection);
        System.out.println(collection.size());

        collection.remove("a");
        System.out.println(collection);

//        collection.clear();
        System.out.println(collection);
        System.out.println(collection.isEmpty());

        boolean containsC = collection.contains("c");
        System.out.println(containsC);

        String[] array = collection.toArray(new String[0]);
        System.out.println(array[0]);

        Collection<String> other = new ArrayList<>();
        other.addAll(collection);
        System.out.println(other);

        System.out.println(other.equals(collection));
        System.out.println(other == collection);
    }
}
