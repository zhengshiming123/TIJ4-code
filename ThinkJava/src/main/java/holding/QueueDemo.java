package holding;//: holding/QueueDemo.java
// Upcasting to a Queue from a LinkedList.

import java.util.*;

public class QueueDemo {
    public static void printQ(Queue queue) {
        while (queue.peek() != null)
            System.out.print(queue.remove() + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            int i1 = rand.nextInt(i + 10);
            queue.offer(i1);
            System.out.println("=="+i1);

        }
        printQ(queue);
        Queue<Character> qc = new LinkedList<Character>();
        for (char c : "Brontosaurus".toCharArray()) {
            System.out.println(c);
            qc.offer(c);
        }
        printQ(qc);
    }
} /* Output:
8 1 1 1 5 14 3 1 0 1
B r o n t o s a u r u s
*///:~