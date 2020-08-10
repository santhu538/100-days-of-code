package com.coding.ds;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QuoteDemo {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue = reverse(queue);

        System.out.println(" Queue "+queue);
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
