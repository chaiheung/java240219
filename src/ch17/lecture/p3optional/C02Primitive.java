package ch17.lecture.p3optional;

import java.util.Optional;
import java.util.OptionalInt;

public class C02Primitive {
    public static void main(String[] args) {
        // OptionalInt : int 값을 가질 수 있는 컨테이너
        // OptionalDouble : double 값을 가질 수 있는 컨테이너
        // OptionalLong : long 값을 가질 수 있는 컨테이너


        // 만드는 법
        OptionalInt o1 = OptionalInt.of(3);
        OptionalInt o2 = OptionalInt.of(50);
        OptionalInt o3 = OptionalInt.empty();

        // isPresent : 값이 있으면 true
        // isEmpty : 값이 없으면 true
        o1.isPresent(); // true
        o3.isPresent(); // false
        o1.isEmpty(); // false
        o1.isEmpty(); // true


        // getAsInt : 값을 얻기 ( 없으면 exception )
        o1.getAsInt(); // 3
        // o3.getAsInt(); // exception

        // orElse : 값 없으면 기본값으로 얻기
        o1.orElse(0); // 3
        o3.orElse(0); // 0

    }
}