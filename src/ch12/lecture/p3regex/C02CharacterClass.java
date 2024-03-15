package ch12.lecture.p3regex;

public class C02CharacterClass {
    public static void main(String[] args) {
        // 문자집합
        // 대소문자 구별, 하나의 문자만 가능
        System.out.println("a".matches("[abc]")); // true
        System.out.println("b".matches("[abc]")); // true
        System.out.println("c".matches("[abc]")); // true
        System.out.println("d".matches("[abc]")); // false
        System.out.println("A".matches("[abc]")); // false
        System.out.println("abc".matches("[abc]")); // false

        String p1 = "[abc][abc][abc]";
        System.out.println("abc".matches(p1)); // true

        String p2 = "[a-z]";
        System.out.println("a".matches(p2)); // true
        System.out.println("p".matches(p2)); // true
        System.out.println("A".matches(p2)); // false
        System.out.println("0".matches(p2)); // false

        String p3 = "[A-zA-z]"; // 영문 대소문자
        // == [abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ]
        System.out.println("p".matches(p3)); // true
        System.out.println("P".matches(p3)); // true

        String p4 = "[a-zA-z0-9]"; // 영문 대소문자 + 숫자
        String p5 = "[가-힣]"; // 한글 한글자

        String p6 = "[^abc]"; // a, b, c 제외
        System.out.println("a".matches(p6)); // false
        System.out.println("c".matches(p6)); // false
        System.out.println("e".matches(p6)); // true
        System.out.println("A".matches(p6)); // true


    }
}
