package ch06.lecture.p2method;

import java.util.Random;

public class C10Return {
    public static void main(String[] args) {
        C10MyClass o = new C10MyClass();
        int a = o.method1();
        int b = 10 / o.method1();
        System.out.println(o.method1());
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        double c = o.method2();
        double d = 10 * o.method2();
        System.out.println(o.method2());
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        System.out.println("-----");
        System.out.println(o.method7(6)); // 1~6
        System.out.println(o.method7(45)); // 1~45
        System.out.println(o.method7(100)); // 1~100
    }
}

class C10MyClass {
    // return:
    // 호출된 곳으로 값을 반환
    // 반환되는 값의 타입 = 메소드 타입 일치해야 함

    int method1() {
        return 5; // 1. 메소드 종료, 2. 값 반환
    }

    double method2() {
        return 3.14;
    }

    String method3() {
        return "hello";
    }

    long method4() {
        return 5;
    }

    double method5() {
        return 10;
    }

    void method6() {
        return; // 반환값 없음, 메소드 종료 기능으로만 사용
    }

    // 1~bound
    int method7(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }
}
