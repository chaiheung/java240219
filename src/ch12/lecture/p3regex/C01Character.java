package ch12.lecture.p3regex;

public class C01Character {
    public static void main(String[] args) {
        // 정규표현식 (regex) : 특정 규칙의 문자열을 표현하기 위한 문자열 패턴

        // 한 문자
        String pattern1 = "a";

        boolean b1 = "a".matches(pattern1); // true
        System.out.println("b1 = " + b1);

        System.out.println("b".matches(pattern1)); // false
        System.out.println("aa".matches(pattern1)); // false
        System.out.println("ab".matches("ab")); // true
        System.out.println("ab".matches("ba")); // false

        // regex 내의 "\\" : 2배
        System.out.println("\\".matches("\\\\")); // true

        // regex 내의 "." : 모든 문자 하나
        System.out.println(".".matches(".")); // true
        System.out.println("a".matches(".")); // true

        // "." 표현 원할 시
        System.out.println(".".matches("\\.")); // true
        System.out.println("a".matches("\\.")); // false
    }
}
