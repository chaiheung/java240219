package ch17.exercise.Exercise05;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("This is a java book", "Lambda expressions", "Java8 supports lambda expressions");
        list.stream().filter(s -> s.toLowerCase().contains("java"))
                .forEach(System.out::println);
    }
}