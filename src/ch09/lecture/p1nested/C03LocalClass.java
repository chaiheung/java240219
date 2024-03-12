package ch09.lecture.p1nested;

public class C03LocalClass {
    // 중첩클래스
    // 필드
    // 생성자
    // 메소드
    void method1() {
        // 로컬 클래스
        class LocalClass {
            // 필드, 생성자, 메소드
        }
        LocalClass Obj1 = new LocalClass();
    }
}