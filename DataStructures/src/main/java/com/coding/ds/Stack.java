package com.coding.ds;

import java.util.Arrays;

public class Stack {
    private int maxSize;
    private int[] array;
    private int index=0;

    public Stack(int size) {
        this.maxSize = size;
        array = new int[maxSize];
    }

    public void push(int v) {
        if(index >= maxSize) {
            throw new StackOverflowError();
        }
        array[index++] = v;
    }

    public int pop() {
        if(index == 0 ) {
            throw new IllegalStateException();
        }
        return array[--index];
    }

    public int peek() {
        if(index < 0 ) {
            throw new IllegalStateException();
        }
        return array[index-1];
    }

    public boolean empty() {
        return index == 0;
    }

    @Override
    public String toString() {
        int[] content = Arrays.copyOfRange(array, 0, index);
        return Arrays.toString(content);
    }
}
