package com.datastructures;

import java.util.ArrayList;
import java.util.List;

public class TheLists {
    public static void main(String[] args) {
        List colors = new ArrayList();
        colors.add("blue");
        colors.add("purple");
        colors.add(1);
        colors.add(new Object());

        List<String> colorsTrue = new ArrayList<>(); //No mettter. Also can write 'new LinkedList<>();'
        colorsTrue.add("blue");
        colorsTrue.add("purple");

        System.out.println(colors);
        System.out.println();
        System.out.println(colorsTrue);
        System.out.println();

        for (String color : colorsTrue) {
            System.out.println(color);
        }

        System.out.println();

        colorsTrue.forEach(System.out::println);

        System.out.println();

        for (int i = 0; i < colorsTrue.size(); i++) {
            System.out.println(colorsTrue.get(i));
        }

        List<String> collorsUnmodifiable = List.of(
                "blue",
                "purple",
                "yellow",
                "..."
        );
    }
}