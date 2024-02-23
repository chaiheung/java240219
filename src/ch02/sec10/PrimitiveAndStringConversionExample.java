package ch02.sec10;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3);


        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);
        String str4 = "ABC" + "";

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);


        String str5 = String.valueOf(3.14);
        String str6 = Double.toString(3.14);
        String str7 = 3.14 + "";
        // 모두 사용 가능
        System.out.println("str5 = " + str5);
        System.out.println("str6 = " + str6);
        System.out.println("str7 = " + str7);
    }
}
