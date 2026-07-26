package Day15;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue);

        System.out.println("Front : " + queue.peek());

        System.out.println("Removed : " + queue.poll());

        System.out.println(queue);
    }
}