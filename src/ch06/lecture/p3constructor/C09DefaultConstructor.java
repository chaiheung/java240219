package ch06.lecture.p3constructor;

public class C09DefaultConstructor {
    public static void main(String[] args) {
        C09MyClass1 o1 = new C09MyClass1(33);
        C09MyClass2 o2 = new C09MyClass2();
        C09MyClass3 o3 = new C09MyClass3();
        C09MyClass4 o4 = new C09MyClass4(3);
        C09MyClass4 o5 = new C09MyClass4();
    }
}

class C09MyClass1 {
    int age;

    public C09MyClass1(int age) {
        this.age = age;
    }
}

class C09MyClass2 {
    public C09MyClass2() {
    }
}

class C09MyClass3 {
    // 필드 x
    // 생성자 x
    // default/0-args constructor ( 기본 생성자 )
    // 생성자를 작성하지 않으면(*)
    // 파라미터 없는 생성자 자동 추가
    // 단, 생성자를 작성하면 추가되지 않음

    // 메소드 x
}

class C09MyClass4 {
    int age;

    public C09MyClass4(int age) {
        this.age = age;
    }

    // 필요시 만들어야 함

    public C09MyClass4() {
    }
}
