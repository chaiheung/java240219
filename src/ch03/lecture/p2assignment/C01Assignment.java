package ch03.lecture.p2assignment;

public class C01Assignment {
    public static void main(String[] args) {
        // assignment operator (할당연산자, 대입연산자)
        // 기호: =
        // 오른쪽 값을 왼쪽에 대입 (할당)
        // 연산 순서 오른쪽에서 시작

        int a = 3;
        int b = 5;
        int c = b;
        int d = c = 7;
        int e = c = b + 1 + a * d;
    }
}