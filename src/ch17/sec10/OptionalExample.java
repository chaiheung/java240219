package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        OptionalDouble optional = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        if (optional.isPresent()) {
            System.out.println("평균1: " + optional.getAsDouble());
        } else {
            System.out.println("평균1: 0.0");
        }

        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("평균2: " + avg);

        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a -> System.out.println("평균3: " + a));
    }
}
