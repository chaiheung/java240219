package ch09.lecture.p2anonymous;

import java.util.Random;

public class C07Sample {
    public static void main(String[] args) {
        // TODO : null 대신 익명클래스 객체 코드 작성

        Game rpsGame = new Game() {
            @Override
            public void play() {
                String[] rps = {"가위", "바위", "보"};
                int choice = new Random().nextInt(rps.length);
                System.out.println(rps[choice]);
            }
        };
        rpsGame.play();


        Game lottoGame = new Game() {
            @Override
            public void play() {
                Random random = new Random();
                int[] lotto = new int[6];
                for (int i = 0; i < lotto.length; ) {
                    int randomNumber = random.nextInt(45) + 1;
                    boolean isRaffle = false;
                    for (int j = 0; j < i; j++) {
                        if (lotto[j] == randomNumber) {
                            isRaffle = true;
                            break;
                        }
                    }
                    if (!isRaffle) {
                        lotto[i] = randomNumber;
                        i++;
                    }
                }
                for (int number : lotto) {
                    System.out.print(number + " ");
                }
            }
        };
        lottoGame.play();

    }
}

interface Game {
    void play();
}
