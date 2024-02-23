package ch04.lecture.p2switch;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C04RPS {
    public static void main(String[] args) {
        // 가위바위보 게임 만들기
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String a1 = "가위";
        String b1 = "바위";
        String c1 = "보";

        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 선택하세요: ");

        // 1, 2, 3
        int user = Integer.parseInt(scanner.nextLine());
        int pc = random.nextInt(1, 4);


//        System.out.println("user = " + user);
//        System.out.println("pc = " + pc);

        // 가위바위보로 변환

        switch (user) {
            case 1 -> System.out.println("user = 가위 ✌️");
            case 2 -> System.out.println("user = 바위 ✊");
            case 3 -> System.out.println("user = 보 ✋");
        }
        switch (pc) {
            case 1:
                System.out.println("pc = 가위 ✌️");
                break;
            case 2:
                System.out.println("pc = 바위 ✊");
                break;
            case 3:
                System.out.println("pc = 보 ✋");
        }
        // 가위바위보 승패 출력
        System.out.println("----------");
        if (user == pc) {
            System.out.println("무승부");
        } else if ((user == 1 && pc == 3 || user == 2 && pc == 1 || user == 3 && pc == 2)) {
            System.out.println("승리");
        } else {
            System.out.println("패배");
        }

    }
}
