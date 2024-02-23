package ch04.lecture.p1if;

public class C07SwitchExprssion {
    public static void main(String[] args) {
        int angle = 90; // or 180
        int answer = 0;

        answer = switch (angle) {
            case 90 -> 2;
            case 180 -> 4;
            default -> 0; // 결과값을 낼 때 반드시 default 작성!;
        };

        System.out.println("answer = " + answer);

    }
}
