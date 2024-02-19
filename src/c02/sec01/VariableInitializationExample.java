package c02.sec01;

public class VariableInitializationExample {
    public static void main(String[] args) {
        // 변수 value 선언
        int value;
        value = 10;

        // 값이 없는 변수를 사용할 수 없음
        int result = value + 10;

        // 변수 result 값을 읽고 콘솔에 출력
        System.out.println(result);
    }
}