package ch16.lecture.p1lambda;

import java.util.Arrays;
import java.util.Comparator;

public class C15Sort {
    public static void main(String[] args) {
        String[] names = {"alpha", "beta", "gamma", "delta", "epsilon"};
        System.out.println(Arrays.toString(names));
        int loop = names.length;

        for (int current = 0; current < loop; current++) {
            String min = names[current];
            int minIndex = current;

            for (int i = current; i < loop; i++) {
                int result = min.compareTo(names[i]);
                if (result > 0) {
                    min = names[i];
                    minIndex = i;
                }
            }
            String tmp = names[current];
            names[current] = names[minIndex];
            names[minIndex] = tmp;
        }
        System.out.println(Arrays.toString(names));
    }
}

