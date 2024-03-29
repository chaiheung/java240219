package ch04.lecture.p1if;

public class C04Random {
    public static void main(String[] args) {
        double random1 = Math.random(); // 0.0 <= r = 리턴값 < 1.0
        System.out.println("random1 = " + random1);

        double value1 = random1 * 6; // 0.0 <= 값 < 6.0
        System.out.println("value1 = " + value1);

        double value2 = value1 + 1; // 1.0 <= 값 < 7.0
        System.out.println("value2 = " + value2);

        int value3 = (int) value2; // 실수를 정수화
        System.out.println("value3 = " + value3);

        // 주사위 만들기
        int dice1 = (int) ((Math.random() * 6) + 1);
        System.out.println("dice1 = " + dice1);
    }
}
