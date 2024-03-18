package ch13.lecture.p1generic;

public class C09GenericMethod {
    public static void main(String[] args) {
        C07Box<String> box = new C07Box<>();
        method("hello"); // String로 유추
        method(34); // Integer로 유추

        String s = method1(); // String로 유추
        Integer i = method1(); // Integer로 유추
    }

    // 제네릭 메소드
    public static <T> void method(T param) {

    }

    public static <T> T method1() {
        return null;
    }
}
