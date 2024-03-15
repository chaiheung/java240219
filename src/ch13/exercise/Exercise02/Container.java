package ch13.exercise.Exercise02;

public class Container<T> {
    private T item;

    public void set(T param) {
        item = param;
    }

    public T get() {
        return item;
    }
}