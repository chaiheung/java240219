package ch09.sec04;

public class exam03 {
    public void method1(int arg) {
        int var = 1;

        class B {
            void method2() {
                System.out.println("arg = " + arg);
                System.out.println("var = " + var);

                // 로컬 변수 수정 불가
                //arg = 2;
                //var = 2;
            }
        }

        B b = new B();
        b.method2();

        // 로컬 변수 수정 불가
        // arg = 3;
        // var = 3;
    }
}