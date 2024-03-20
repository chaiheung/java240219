package ch15.lecture.p4queue;

import java.util.LinkedList;
import java.util.Queue;

public class C02Sample {
}

class Solution {
    // leetcode #1700
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for (int student : students) {
            q1.offer(student);
        }
        for (int sandwich : sandwiches) {
            q2.offer(sandwich);
        }

        int remain = q1.size();
        while (!q1.isEmpty() && remain > 0) {
            int student = q1.peek();
            int sandwich = q2.peek();
            if (student == sandwich) {
                q1.poll();
                q2.poll();

                remain = q1.size();
            } else {
                remain--;
                q1.offer(q1.poll());
            }
        }
        return q1.size();
    }
}
