package ch07.lecture.p2polymorphism;

public class C01Override {
    public static void main(String[] args) {
        C01GoldFish goldfish = new C01GoldFish();
        C01Cat cat = new C01Cat();

        goldfish.breathe();
        cat.breathe();
    }
}

class C01Animal {
    public void breathe() {
        System.out.println("호흡");
    }
}

class C01GoldFish extends C01Animal {
    // method override : 상위 타입의 메소드를 재정의
    public void breathe() {
        System.out.println("아가미로 호흡");
    }
}

class C01Cat extends C01Animal {
    public void breathe() {
        System.out.println("폐로 호흡");
    }
}

