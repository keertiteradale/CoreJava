package OOPs.CollectionFramework.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab155 {
    public static void main(String[] args) {
        Queue<Integer> IQ = new PriorityQueue<>();
        IQ.add(1);
        System.out.println(IQ);
        IQ.poll();
        System.out.println(IQ);


        Queue IQ1= new PriorityQueue<>();
        IQ1.add("A");
        IQ1.add("B");
        IQ1.add("C");
        System.out.println(IQ1);
        IQ1.poll();
        System.out.println(IQ1);

        Iterator i = IQ1.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }


    }
}
