package ch06.lecture.p6final;

public class C04Final {
    public static void main(String[] args) {
        C04MyClass.I = 30;
        C04MyClass.I = 50;
    }
}

class C04MyClass {
    // static field
    static int I;

    // final static field
    // final static field 작명 관습 : UPPER_SNAKE_CASE
    final static int J = 100;
    final static int K;

    // 순서는 바뀌어도 상관 없음
    static final int AMOUNT_OF_MONEY = 300;

    static {
        K = 200;
    }

}
