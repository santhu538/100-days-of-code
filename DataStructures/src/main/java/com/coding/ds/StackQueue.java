package com.coding.ds;

import java.util.Arrays;

public class StackQueue {

    private Stack stack;
    private Stack queue;
    private int size;

    public StackQueue(int size) {
        stack = new Stack(size);
        queue = new Stack(size);
        this.size = size;
    }

    public int dequeue() {
        if(queue.empty() && stack.empty()) {
            throw new IllegalStateException();
        }
        if(queue.empty()) {
            queue = reverse(stack);
        }

        return queue.pop();
    }

    public void enqueue(int item) {
        if(queue.full()) {
            throw new IllegalStateException();
        }
        //stack = queue;
      //  if(stack.empty()) {
        //    stack = reverse(queue);
        //}
        stack.push(item);
    }

    private Stack reverse(Stack stack) {
        while(!stack.empty()) {
            queue.push(stack.pop());
        }
        return queue;
    }

    @Override
    public String toString() {
        return stack.empty()?queue.toString():stack.toString();
    }


}
