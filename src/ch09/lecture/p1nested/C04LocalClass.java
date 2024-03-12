package ch09.lecture.p1nested;

public class C04LocalClass {
    void method1() {
        final int j = 1;
        int k = 2; // effectively final
        // k = 3; // 값 변경하면 local class에서 사용 못함
        class LocalClass {
            void method1() {
                int i = 0;
                i = 1; // 변경 가능
                System.out.println(i);
                i = 1;

                // 감싸고 있는 메소드의 final 지역변수만 사용 가능
                System.out.println(j);
                // j = 5; // 감싸고 있는 메소드의 변수값 변경 불가
                System.out.println(k);
            }
        }
    }
}
