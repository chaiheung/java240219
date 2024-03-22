package ch17.lecture.p3optional;

import java.util.Optional;

public class C01Optional {
    public static void main(String[] args) {
        // Optional
        // null이 아닌 값을 포함할 수 있는 컨테이너

        Optional<String> s = Optional.of("java");
        Optional<Integer> i = Optional.of(3);
        Optional<Double> v = Optional.of(3.14);
        // Optional<Object> o = Optional.of(null);

        Optional<Object> container1 = Optional.empty();

        // 값이 있는지?
        boolean b1 = s.isPresent();
        boolean b2 = container1.isPresent();
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        // 값이 없는지?
        boolean b3 = s.isEmpty();
        boolean b4 = container1.isEmpty();

        // 값을 꺼내기
        String s1 = s.get();
        Integer i1 = i.get();
        Double v1 = v.get();
        // Object o = container1.get();

        // 값이 없을 때 꺼내기
        String s2 = s.orElse(""); // java
        Integer i2 = i.orElse(0); // 3
        Object o = container1.orElse(new Object()); // exception 안남

        System.out.println("C01Optional.main");

    }
}
