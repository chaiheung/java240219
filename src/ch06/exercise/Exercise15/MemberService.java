package ch06.exercise.Exercise15;

public class MemberService {
    boolean login(String id, String pw) {
        if (id.equals("hong") && pw.equals("12345")) {
            return true;
        }
        return false;
    }

    void logout(String id) {
        System.out.println("로그아웃 완료");
    }
}
