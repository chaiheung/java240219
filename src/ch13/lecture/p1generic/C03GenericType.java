package ch13.lecture.p1generic;

public class C03GenericType {
    public static void main(String[] args) {
        C03Box<String, Integer> box1 = new C03Box<>();
        var box2 = new C03Box<Double, String>();

        box1.setItem1("java");
        String item1 = box1.getItem1();
        box1.setItem2(300);
        Integer item2 = box1.getItem2();

        box2.setItem1(3.14);
        Double item3 = box2.getItem1();
        box2.setItem2("spring");
        String item4 = box2.getItem2();
    }
}

class C03Box<T1, T2> {
    private T1 item1;
    private T2 item2;

    public T1 getItem1() {
        return item1;
    }

    public void setItem1(T1 item1) {
        this.item1 = item1;
    }

    public T2 getItem2() {
        return item2;
    }

    public void setItem2(T2 item2) {
        this.item2 = item2;
    }
}
