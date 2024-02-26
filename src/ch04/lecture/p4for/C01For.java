package ch04.lecture.p4for;

public class C01For {
    public static void main(String[] args) {
        int a = 0;
        while (a < 3) {
            System.out.println("명령문1");
            a++;
        }

        System.out.println("##for문 사용##");

        for (int b = 0; b < 3; b++) {
            System.out.println("명령문2");
        }
    }
}
