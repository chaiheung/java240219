package ch07.exercise.Exercise08;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;

        System.out.println(System.identityHashCode(snowTire));
        System.out.println(System.identityHashCode(tire));

        tire.run();
        snowTire.run();
    }
}