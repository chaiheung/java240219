package ch04.exercise;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        //p 138

        // 1번
        // switch문에서는 long, double 변수타입 사용 불가

        // 2번
        String grade = "A";
        int score1 = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                score1 = result;
                yield result;
            }
            default -> 60;
        };
        System.out.println("score1 = " + score1);

        // 3번
        int sum = 0;

        for (int i = 1; i <= 100; i++)
            if (i % 3 == 0) {
                sum += i;
            }
        System.out.println("sum = " + sum);


        // 4번
        while (true) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            System.out.println("(" + dice1 + ", " + dice2 + ")");
            if (dice1 + dice2 == 5) {
                break;
            }
        }
        System.out.println(" 주사위 멈춰! ");


        // 5번
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                boolean z = (4 * x) + (5 * y) == 60;
                if (z) {
                    System.out.println("(" + x + ", " + y + ")");
                    System.out.println(STR."(\{x}, \{y})");
                }
            }
        }

        // 7번
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int money = 0;

        while (run) {
            System.out.println("--------------------------");
            System.out.println("1.예금|2.출금|3.잔고|4.종료");
            System.out.println("--------------------------");
            System.out.print("선택>");

            String menu = scanner.nextLine();

            switch (menu) {
                case "1" -> {
                    // 예금
                    System.out.print("예금액>");
                    String depositString = scanner.nextLine();
                    int deposit = Integer.parseInt(depositString);
                    money += deposit;
                }
                case "2" -> {
                    // 출금
                    System.out.print("출금액>");
                    String withdrawalString = scanner.nextLine();
                    int withdrawal = Integer.parseInt(withdrawalString);
                    money -= withdrawal;
                }
                case "3" -> System.out.println(STR."잔고> \{money}");
                case "4" -> run = false;
            }
        }


        System.out.println("프로그램 종료");
        scanner.close();

    }
}