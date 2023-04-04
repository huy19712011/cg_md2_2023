package org.example.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeDemo {

    public static void show() {

        Queue<String> queue = new ArrayDeque<>();

        queue.add("a");
        queue.add("b");
        queue.add("c");
        // c-> b->a
        System.out.println(queue);

        queue.offer("d");
        System.out.println(queue);

        String front = queue.peek(); //null
        System.out.println(front);
        System.out.println(queue);

        String front1 = queue.element(); // exception
        System.out.println(front1);

        String front2 = queue.remove();//exception
        System.out.println(front2);
        System.out.println(queue);

        queue.remove("d");
        System.out.println(queue);

        queue.poll(); //null
        System.out.println(queue);


    }


}
