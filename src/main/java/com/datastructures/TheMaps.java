package com.datastructures;

import java.util.HashMap;
import java.util.Map;

public class TheMaps {
    public static void main(String[] args) {
        ///// Very important to remember about Equals and HashCode overriding
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex")); //the hashCode for the same, for example, 'Person' will be same always. ( .... .hashCode()).
        map.put(2, new Person("Alexa"));
        map.put(3, new Person("Mariam"));// Keys must be uniq otherwise new putting will override the privies one
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.remove(3);

        System.out.println();

        map.entrySet().forEach(System.out::println);

        System.out.println();

        map.entrySet()
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        System.out.println();


        map.forEach((key, person) -> {
            System.out.println(key + " - " + person);
        });
        System.out.println();
        System.out.println(map.getOrDefault(3, new Person("default")));
        System.out.println();
        System.out.println(map.values());
    }

    static record Person(String name) {
    }
}