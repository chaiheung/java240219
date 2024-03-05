package ch06.lecture.p3constructor;

public class C08This {
    public static void main(String[] args) {
        C08MyClass o1 = new C08MyClass();
    }
}

class C08MyClass {
    // 필드
    String name;
    int age;
    String address;

    public C08MyClass(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public C08MyClass(String name) {
        // this() : 생성자 호출

        this(name, 1, "n/a");
    }

    public C08MyClass() {
        this("홍길동");
    }
}
