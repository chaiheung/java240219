package ch05.lecture.p1array;

import java.util.Arrays;

public class C13Reference {
    public static void main(String[] args) {

        int[] arr1 = {5, 4};
        int[] arr2 = arr1;

        arr1[0] = 10;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println(System.identityHashCode(arr1));
        System.out.println(System.identityHashCode(arr2));

        int[] arr3 = {2, 3};
        int[] arr4 = Arrays.copyOf(arr3, 2);
        System.out.println(System.identityHashCode(arr3));
        System.out.println(System.identityHashCode(arr4));

        arr3[0] = 20;

        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }
}
