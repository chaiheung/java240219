package ch06.lecture.p2method;

public class C01Method {
    public static void main(String[] args) {
        C01Person person1 = new C01Person();
        C01Person person2 = new C01Person();

        person1.name = "son";
        person2.name = "lee";

        person1.walk();
        person2.walk();
    }
}

class C01Person {
    // 필드 작성
    // 이름, 나이, 주소
    String name;

    // 메소드(기능) 작성
    void walk() {
        // 메소드가 실행하는 코드 작성
        // 변수, 연산자, 조건문, 반복문
        // 필드의 내용 사용 가능
        System.out.println(name + "이 걷습니다.");
    }
}
