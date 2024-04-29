package OOPs.CollectionFramework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab154 {
    public static void main(String[] args) {
        Queue pq = new PriorityQueue();

        pq.offer(40);
        pq.offer(30);
        pq.offer(22);
        pq.offer(44);
        pq.offer(90);
      //  pq.offer(null);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.add(80);
        System.out.println(pq);

    }
}
