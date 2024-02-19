package c02.sec01;

import com.sun.source.tree.CaseLabelTree;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x:"+x+",y:"+y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("x:"+x+",y:"+y);

        int a = 100;
        int b = 200;

        int alt = a;
        a = b;
        b = alt;

        System.out.println(a);;
        System.out.println(b);
    }
}
