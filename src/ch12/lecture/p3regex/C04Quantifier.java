package ch12.lecture.p3regex;

public class C04Quantifier {
    public static void main(String[] args) {
        // 수량자
        // {n} : 정확히 n번
        // {n,m} : 정확히 n~m번
        // {n,} : n번 이상
        // {n,} : n번 이상
        // + = {1,} : 1번 이상
        // * = {0,} : 0번 이상
        // ? = {0,1} : 0 또는 1

        // {n}
        String p1 = "\\d{3}";
        System.out.println("012".matches(p1)); // true
        System.out.println("119".matches(p1)); // true
        System.out.println("19k".matches(p1)); // false
        System.out.println("7".matches(p1)); // false

        String p2 = "010-\\d{4}-\\d{4}";
        System.out.println("010-1234-5678".matches(p2)); // true
        System.out.println("010-123-4567".matches(p2)); // false

        // {n,m}
        String p3 = "[가-힣]{3,4}";
        System.out.println("대한민국".matches(p3)); // true
        System.out.println("한국".matches(p3)); // false

        // {n,}
        String p4 = "[가-힣]{3,}";
        System.out.println("대한민국".matches(p3)); // true
        System.out.println("한국".matches(p3)); // false

        String p5 = "[a-zA-Z가-힣]{1,}";
        System.out.println("한국".matches(p5)); // true
        System.out.println("korea".matches(p5)); // true
        System.out.println("seoul한국".matches(p5)); // true
        System.out.println("seoul 한국".matches(p5)); // false

        // ? = {0,1}
        String p6 = "010-?\\d{4}-?\\d{4}";
        System.out.println("010-1234-5678".matches(p6)); // true
        System.out.println("01012345678".matches(p6)); // true

        // + = {1,}
        String p7 = "\\w+";
        System.out.println("921123ch_".matches(p7)); // true
        System.out.println("".matches(p7)); // false

        // * = {0,}
        String p8 = "\\w*";
        System.out.println("921123ch_".matches(p8)); // true
        System.out.println("".matches(p8)); // true
    }
}
