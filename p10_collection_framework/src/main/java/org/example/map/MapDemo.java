package org.example.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void show() {

        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");
        var c3 = new Customer("c", "e3");

        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);
        map.put(c3.getEmail(), c3);

        //get()
        Customer e1 = map.get("e1");
        System.out.println(e1);

        Customer e10 = map.get("e10");
        System.out.println(e10);

        Customer unknown = new Customer("Unknown", "");
        Customer e20 = map.getOrDefault("e20", unknown);
        System.out.println(e20);

        // containsKey()
        boolean exists = map.containsKey("e10");
        System.out.println(exists);
        System.out.println(map.containsValue(new Customer()));
        System.out.println(map.containsValue(c2));

        // replace()
        map.replace("e1", new Customer("aaa", "e1"));
        System.out.println(map);

        // iterate
        for (var key: map.keySet()){
            System.out.println(key);
        }

        for (var entry: map.entrySet()) {
            System.out.println(entry);
        }

        for (var customer: map.values()) {
            System.out.println(customer);
        }

        // remove()
        map.remove("e3");
        System.out.println(map);

    }
}
