package ch06.lecture.p7access;

import org.w3c.dom.ls.LSOutput;

public class C03Encapsulation {
    public static void main(String[] args) {
        C03MyClass o1 = new C03MyClass();
        o1.setName("son");
        o1.setAge(44);

        System.out.println(o1.getName());
        System.out.println(o1.getAge());
    }
}

class C03MyClass {
    // 필드
    private String name;
    private int age;

    // 메소드
    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
