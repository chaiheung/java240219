package c03.lecture.p01arithmetic;

public class C01Arithmetic {
    public static void main(String[] args) {
        // 산술 연산자
        // + - * / %
        // 피연산자의 수: 2개
        // 피연산자: numeric(정수, 실수, 문자)
        // 연산결과의 타입: 피연산자 중 큰 타입

        int a = 3;
        int b = 9;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(b % a); // b를 a로 나눈 나머지
    }
}
