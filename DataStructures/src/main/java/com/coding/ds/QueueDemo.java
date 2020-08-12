package com.coding.ds;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueDemo {

    public static void main(String[] args) throws IllegalAccessException {
        //implementJavaQueue();
        implementQueueWithArray();
    }

    private static void implementQueueWithArray() throws IllegalAccessException {
        com.coding.ds.Queue queue = new com.coding.ds.Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue);
        System.out.println(" dequeue "+queue.dequeue());
        System.out.println(queue);
        System.out.println(" dequeue "+queue.dequeue());
        System.out.println(queue);
        System.out.println(" peek "+queue.peek());
        System.out.println(queue);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        System.out.println(queue);

        System.out.println("\n isFull "+queue.isFull());
        System.out.println("\n isEmpty "+queue.isEmpty());
        System.out.println("\n dequeue "+queue.dequeue()+" isEmpty "+queue.isEmpty());
        System.out.println("\n dequeue "+queue.dequeue()+" isEmpty "+queue.isEmpty());
        System.out.println("\n dequeue "+queue.dequeue()+" isEmpty "+queue.isEmpty());
        System.out.println("\n dequeue "+queue.dequeue()+" isEmpty "+queue.isEmpty());
        System.out.println("\n dequeue "+queue.dequeue()+" isEmpty "+queue.isEmpty());
        System.out.println(queue);
        queue.enqueue(10);
        System.out.println(queue);

    }

    private static void implementJavaQueue() {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println(" Queue "+reverse(queue));
    }

    private static Queue<Integer> reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
       while(!queue.isEmpty())
           stack.add(queue.remove());

       while(!stack.empty()) {
           queue.add(stack.pop());
       }

       return queue;
    }
}
