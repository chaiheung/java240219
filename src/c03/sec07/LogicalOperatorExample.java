package c03.sec07;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        // 대문자 65~90, 소문자 97~122, 숫자 48~57
        int charCode = 'a';
        if ((65 <= charCode) & (charCode <= 90)) {
            System.out.println("대문자");
        }
        if ((97 <= charCode) && (charCode <= 122)) {
            System.out.println("소문자");
        }
        if ((48 <= charCode) && (charCode <= 57)) {
            System.out.println("0~9 숫자");
        }
        //--------------------

        int value = 9;
        if ((value % 2 == 0) | (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수");
        }
        if ((value % 2 == 0) && (value % 3 == 0)) {
            System.out.println("2 그리고 3의 배수");
        }
    }
}
