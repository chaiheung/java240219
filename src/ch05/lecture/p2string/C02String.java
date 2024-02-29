package ch05.lecture.p2string;

public class C02String {
    public static void main(String[] args) {
        String a = "son";
        String b = "lee";
        String c = "son";

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));

        String d = new String("son");
        System.out.println(System.identityHashCode(d));

        // 참조값 비교
        System.out.println(a == c);
        System.out.println(a == d);

        // 내용물 비교
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));

        // String 비교는 equals 사용하는 것이 좋음
    }
}
