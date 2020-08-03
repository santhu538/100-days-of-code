package com.coding.ds;

public class LinkedList {

    private Node first;
    private Node last;
    private int size;

    public LinkedList() {
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        if(first == null) {
            first = node;
            last = first;
            return;
        }
        node.next = first;
        first = node;
    }

    public void addLast(int value) {
        Node node = new Node(value);
        if(first == null) {
            first = node;
            last = node;
            return;
        }
        last.next = node;
        last = node;
    }

    public void deleteFirst() throws NoSuchFieldException {
        if(first == null) {
            throw new NoSuchFieldException();
        }

        if(first.next == null) {
            first = last = null;
        }
        else {
            first = first.next;
            first.next = null;
        }
    }

    public void deleteLast() throws NoSuchFieldException {
        if(last == null) {
            throw new NoSuchFieldException();
        }
        if(first.next == null) {
            first = last = null;
        }
        else {
            Node previous = getPrevious(last);
            previous.next = null;
            last = previous;
        }
    }

    private Node getPrevious(Node last) {

        Node head = first;
        while(head.next != last) {
            head = head.next;
        }
        return head;
    }

    public boolean contains(int value) {
        if(first ==  null) {
            return false;
        }

        Node node = new Node(value);
        Node head = first;
        while(head != null) {
            if(head.value == node.value) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public int indexOf(int value) {

        if(first == null) {
            return -1;
        }

        Node node = new Node(value);
        Node head = first;
        int count = 0;
        while(head != null) {
            if(head.value == node.value) {
                return count;
            }
            count ++;
            head = head.next;
        }
        return -1;
    }


    public void printValues() {
        System.out.print("\n List Values ::");
        Node head = first;
        while(head !=null) {
            System.out.print(" "+head.value);
            head = head.next;
        }
    }

    public int size() {
        size = 0;
        Node head = first;
        while(head != null) {
            head = head.next;
            size++;
        }
        return size;
    }

    public void reverse() {
        if(first == null) {
            return;
        }
        Node current = last;
        Node previous;
        while((previous = getPrevious(current)) != first) {

            current.next = previous;
            current = previous;
        }
        current.next = previous;
        first = last;
        last = previous;
        last.next = null;

    }

    public int getKthValueFromTheEnd(int k) {
        if(first == null) {
            throw new IllegalStateException();
        }
        if(k > size) {
            throw new IllegalArgumentException();
        }
        Node previous = first;
        Node current = getKthNode(k-1);
        while(current != last) {
            previous = previous.next;
            current = current.next;
        }
        return previous.value;
    }

    private Node getKthNode(int k) {
        if(k > size) {
            throw new IllegalArgumentException();
        }
        Node current = first;
        int i = 0;
        while(current != null && i <= k - 1) {
            current = current.next;
            i++;
        }
        return current;
    }

    public void reverseList() {
        if(first == null) {
            return;
        }
        Node previous = first;
        Node current = first.next;
        while(current != null) {
            Node next = current.next;
            current.next = previous;
            previous  =  current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
