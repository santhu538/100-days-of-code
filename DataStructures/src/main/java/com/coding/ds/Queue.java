package com.coding.ds;

import java.util.Arrays;

public class Queue {
    private int[] array;
    private int count;
    private int start;
    private int end;

    public Queue(int capacity) {
        array = new int[capacity];
    }

    public void enqueue(int n) {
        if(isFull()) {
            throw new StackOverflowError();
        }
//        if(end == array.length) {
//            end = 0;
//        }
        array[end] = n;
        end = (end + 1)%array.length;
        count++;
    }

    public int dequeue() throws IllegalAccessException {
        if(isEmpty()) {
            throw new IllegalAccessException();
        }
//        if(start == array.length) {
//            start = 0;
//        }
        int item = array[start];
        array[start] = 0;
        start = (start + 1)%array.length;
        count--;
        return item;
    }

    public boolean isFull() {
        return count == array.length;
    }

    public boolean isEmpty() {
        return count == 0 ;
    }

    public int peek() throws IllegalAccessException {
        if(isEmpty()) {
            throw new IllegalAccessException();
        }
        return array[start];
    }

    @Override
   public String toString() {
        return Arrays.toString(array);
   }
}
