package c03.exercise;

public class Exercise {
    public static void main(String[] args) {

        // 3.
        int pencils = 534;
        int students = 30;
        int pencilsPerStudent = (pencils / students);
        System.out.println(pencilsPerStudent);
        int pencilsLeft = (pencils % students);
        System.out.println(pencilsLeft);

        // 4.
        int value = 356;
        System.out.println(value / 100 * 100);
        System.out.println(value - (value % 100));

        // 5.
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area1 = (lengthTop + lengthBottom) * height / 2.0;
        System.out.println("area1 = " + area1);
        double area2 = (lengthTop + lengthBottom) * height * 1.0 / 2;
        System.out.println("area2 = " + area2);
        double area3 = (double) (lengthTop + lengthBottom) * height / 2;
        System.out.println("area3 = " + area3);
        double area4 = (double) ((lengthTop + lengthBottom) * height / 2);
        System.out.println("area4 = " + area4);

    }
}
