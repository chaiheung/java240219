package ch16.lecture.p1lambda;

public class C03FunctionalInterface {
}

// @FunctionalInterface // x
interface C03MyInterface1 {
}

@FunctionalInterface // ok
interface C03MyInterface2 {
    void method1();
}

// @FunctionalInterface // x
interface C03MyInterface3 {
    void method2();

    void method3();
}

@FunctionalInterface // ok
interface C03MyInterface4 {
    void method1();

    default void method2() {
    }
}

@FunctionalInterface // ok
interface C03MyInterface5 {
    void method1();

    String toString();

    int hashCode();

    boolean equals(Object o);
}