package ch04.sec02;

public class IfElseExample {
    public static void main(String[] args) {
        int score = 85;

        if (score >= 90) {
            System.out.println("점수가 90 이상이므로");
            System.out.println("A입니다.");
        } else {
            System.out.println("점수가 90 미만이므로");
            System.out.println("재수강입니다.");
        }
    }
}
