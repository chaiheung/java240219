package ch15.exercise.Exercise10;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        var treeSet = new TreeSet<Student>();
        treeSet.add(new Student("blue", 96));
        treeSet.add(new Student("hong", 86));
        treeSet.add(new Student("white", 92));

        Student student = treeSet.last();
        System.out.println("최고 점수: " + student.score);
        System.out.println("최고 득점자: " + student.id);
    }
}
