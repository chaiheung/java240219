package ch03.sec03;

public class OverflowUnderflowExample {
    public static void main(String[] args) {

        byte var1 = 125;

        var1++;
        System.out.println("var1 = " + var1);
        var1++;
        System.out.println("var1 = " + var1);
        var1++;
        System.out.println("var1 = " + var1);
        var1++;
        System.out.println("var1 = " + var1);
        var1++;
        System.out.println("var1 = " + var1);


        System.out.println("---------------------------");
        // underflow
        byte var2 = -125;
        var2--;
        System.out.println("var2 = " + var2);
        var2--;
        System.out.println("var2 = " + var2);
        var2--;
        System.out.println("var2 = " + var2);
        var2--;
        System.out.println("var2 = " + var2);
        var2--;
        System.out.println("var2 = " + var2);
        var2--;
        System.out.println("var2 = " + var2);


        System.out.println("---------------------------");
        byte var3 = 125;
        for (int i = 0; i < 5; i++) {
            var3++;
            System.out.println("var3 = " + var3);
        }

        System.out.println("---------------------------");

        byte var4 = -125;
        for (int i = 0; i < 5; i++) {
            var4--;
            System.out.println("var4 = " + var4);
        }
    }
}
