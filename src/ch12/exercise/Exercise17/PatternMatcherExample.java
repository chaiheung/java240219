package ch12.exercise.Exercise17;

import java.util.regex.Pattern;

public class PatternMatcherExample {
    public static void main(String[] args) {
        String id = "5Angel1004";
        String regExp = "[A-za-z][A-za-z0-9]{8,12}";
        boolean isMatch = id.matches(regExp);
        if (isMatch) {
            System.out.println("사용할 수 있는 ID입니다.");
        } else {
            System.out.println("사용할 수 없는 ID입니다.");
        }
    }
}
