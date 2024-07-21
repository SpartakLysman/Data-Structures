package com.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueues {
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Mariam", 18));
        supermarket.add(new Person("Ali", 40));
        supermarket.add(new Person("Jamila", 21));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());

        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());

        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age) {
    }
}