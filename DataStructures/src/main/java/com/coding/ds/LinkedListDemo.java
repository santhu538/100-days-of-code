package com.coding.ds;


public class LinkedListDemo {



    public static void main(String[] args) throws NoSuchFieldException {
      LinkedList list = new LinkedList();
      list.addFirst(20);
      list.addFirst(10);
      list.addLast(30);
      list.addLast(40);


        System.out.println("index of 20 "+list.indexOf(20));
        System.out.println("contains of 30 "+list.contains(30));
      System.out.println("list size "+list.size());
      System.out.println("KthNode from end "+list.getKthValueFromTheEnd(-1));
      list.printValues();
      list.reverseList();
        list.printValues();
        list.deleteLast();
        list.printValues();

    }




}
