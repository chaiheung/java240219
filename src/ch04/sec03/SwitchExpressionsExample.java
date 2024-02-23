package ch04.sec03;

public class SwitchExpressionsExample {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("우수 회원");
                break;

            case 'B':
            case 'b':
                System.out.println("일반 회원");
                break;

            default:
                System.out.println("비회원");
        }

        switch (grade) {
            case 'A', 'a' -> System.out.println("우수 회원");
            case 'B', 'b' -> System.out.println("일반 회원");
            default -> System.out.println("비회원");
        }
    }
}
