package Lessons.lesson17;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExmpl {

    public static void main(String[] args) {

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.offer(22);
//
//        queue.remove();
//
//        System.out.println(queue.element());

        Queue<String> queue = new LinkedList<>();
        queue.add("бананы");
        queue.add("яблоки");
        queue.add("ананасы");

        while (queue.peek() != null){
            System.out.println(queue.poll());
        }

        System.out.println(queue.poll());
    }
}
