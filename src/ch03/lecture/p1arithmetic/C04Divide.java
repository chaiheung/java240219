package ch03.lecture.p1arithmetic;

public class C04Divide {
    public static void main(String[] args) {
        // 정수 나누기, 나머지 연산시 0으로 나눌 수 없음
        int a = 3;
        int b = 0;
        if (b != 0) {
            int c = a / b;
            System.out.println("c = " + c);
        }

        if (b != 0) {
            int d = a % b;
            System.out.println("d = " + d);
        }

    }
}
