package ch05.sec05;

public class EmptyStringExample {
    public static void main(String[] args) {
        {
            String hobby = "";
            if (hobby.equals("")) {
                System.out.println("변수 hobby가 참조하는 String 객체는 빈 문자열");
            }
            if (hobby.isEmpty()) {
                System.out.println("변수 hobby가 참조하는 String 객체는 빈 문자열");
            }
            if (hobby.isBlank()) {
                System.out.println("변수 hobby가 참조하는 String 객체는 빈 문자열");
            }
        }
    }
}
