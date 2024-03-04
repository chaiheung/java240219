package ch06.lecture.p2method;

public class C03Method {
    public static void main(String[] args) {
        C03Person john = new C03Person();
        C03Person jane = new C03Person();
        john.name = "john";
        jane.name = "jane";

        john.run(); // 콘솔에 "john이 달립니다." 출력
        jane.walk(); // 콘솔에 "jane이 걷습니다." 출력
    }
}

class C03Person {
    // 필드
    String name;

    // 메소드
    void run() {
        System.out.println(name + "이 달립니다.");
    }

    void walk() {
        System.out.println(name + "이 걷습니다.");
    }
}