package ch06.lecture.p5static;

public class C05Static {

}

class C05MyClasS {
    // 필드

    // Static 필드
    static int age = 30;
    static double area;

    // static block
    // static 멤버 초기 설정용
    static {
        System.out.println("statement...");
        System.out.println("statement...");
        System.out.println("statement...");
        System.out.println("statement...");
        area = Math.PI * 10 * 10;
    }

    // 생성자

    // 메소드

    // static 메소드
    static void method1() {
    }
}