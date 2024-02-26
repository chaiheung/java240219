package ch04.lecture.p5break;

public class C04Label {
    public static void main(String[] args) {
        // label : 반복문에 label을 붙여서 break로 종료시킬 수 있다.

        // 아무 이름이나 써도 됨
        loop1:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(STR."(\{i}, \{j})");

                if (j == 5) {
                    break loop1; // 가장 가까운 반복문 종료
                }
            }
        }
    }
}
