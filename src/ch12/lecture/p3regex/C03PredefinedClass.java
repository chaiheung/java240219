package ch12.lecture.p3regex;

public class C03PredefinedClass {
    public static void main(String[] args) {
        // digit [0-9] : \d
        // whitespace : \s
        // word character [a-zA-z0-9_] = \w
        // all : .

        String p1 = "\\d";
        System.out.println("0".matches(p1)); // true
        System.out.println("5".matches(p1)); // true
        System.out.println("a".matches(p1)); // false
        System.out.println("012".matches(p1)); // false

        System.out.println(" ".matches("\\s")); // true
        System.out.println("\t".matches("\\s")); // true
        System.out.println("\n".matches("\\s")); // true

        // 연습
        String str = "손 흥민";
        String s = str.replaceAll("\\s", "");
        System.out.println(s);

        // word character
        System.out.println("s".matches("\\w")); // true
        System.out.println("S".matches("\\w")); // true
        System.out.println("8".matches("\\w")); // true
        System.out.println("_".matches("\\w")); // true
        System.out.println(" ".matches("\\w")); // false
        System.out.println("$".matches("\\w")); // false

        // all
        System.out.println("a".matches(".")); // true
        System.out.println("$".matches(".")); // true
        System.out.println(" ".matches(".")); // true
        System.out.println("".matches(".")); // false
    }
}
