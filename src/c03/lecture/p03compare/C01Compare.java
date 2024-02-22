package c03.lecture.p03compare;

public class C01Compare {
    public static void main(String[] args) {
        // 비교 연산자
        // ==, !=, >, >=, <, <=
        // 연산결과 : boolean (true or false)
        // 다른 타입간 연산 가능 ( but 지양)

        int a = 5;
        int b = 8;

        boolean c1 = a == b;
        System.out.println("c1 = " + c1);

        boolean c2 = a != b;
        System.out.println("c2 = " + c2);

        boolean c3 = a > b;
        System.out.println("c3 = " + c3);

        boolean c4 = a >= b;
        System.out.println("c4 = " + c4);

        boolean c5 = a < b;
        System.out.println("c5 = " + c5);

        boolean c6 = a <= b;
        System.out.println("c6 = " + c6);

    }
}
