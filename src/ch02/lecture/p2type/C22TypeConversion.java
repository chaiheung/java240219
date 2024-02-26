package ch02.lecture.p2type;

public class C22TypeConversion {
    public static void main(String[] args) {

        // p74 Q5
        byte byteValue = 10;
        char charValue = 'A';

        int intValue1 = byteValue;
        int intValue2 = charValue;
        //short shortValue = charValue;
        double doubleValue = byteValue;

        // p74 Q6
        int intValue3 = 10;
        char charValue3 = 'A';
        double doubleValue3 = 5.7;
        String strValue3 = "A";

        double var1 = (double) intValue3;
        byte var2 = (byte) intValue3;
        int var3 = (int) doubleValue3;
        //char var = (char) strValue3;

        // 기본 타입과 참조 타입간 형변환 안됨.
    }
}
