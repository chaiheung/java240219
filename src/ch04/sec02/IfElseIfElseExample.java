package ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 75;

        if (score >= 90) {
            System.out.println("점수가 90~100이므로");
            System.out.println("A입니다");
        } else if (score >= 80) {
            System.out.println("점수가 80~89이므로");
            System.out.println("B입니다");
        } else if (score >= 70) {
            System.out.println("점수가 70~79이므로");
            System.out.println("C입니다");
        } else {
            System.out.println("점수가 70 미만이므로");
            System.out.println("재수강입니다");
        }
    }
}
