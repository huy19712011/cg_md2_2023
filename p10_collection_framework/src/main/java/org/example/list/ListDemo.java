package org.example.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void show() {

        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");

        list.add(0, "!");
        System.out.println(list);

        Collections.addAll(list, "d", "e", "f");
        System.out.println(list);

        System.out.println(list.get(1));

        list.set(1, "aaa");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        System.out.println(list.indexOf("d"));
        System.out.println(list.indexOf("ddd")); // return -1
        System.out.println(list.lastIndexOf("e"));

        System.out.println(list.subList(1, 3));




    }
}
