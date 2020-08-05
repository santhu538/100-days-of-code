package com.coding.ds;


public class LinkedListDemo {



    public static void main(String[] args) throws NoSuchFieldException {
      LinkedList list = new LinkedList();
      list.addLast(10);
      list.addLast(20);
      list.addLast(30);
      list.addLast(40);
     // list.addLoop();

     /* list.addLast(50);
      list.addLast(60);*/
      //list.addLast(70);

      if(list.hasLoop()) {
        System.out.println("LinkedList has a loop");
        System.exit(1);
      }

        System.out.println("index of 20 "+list.indexOf(20));
        System.out.println("contains of 30 "+list.contains(30));
      System.out.println("list size "+list.size());
      list.printMiddle();
      if(list.hasLoop()) {
        System.out.println("LinkedList has a loop");
      }
      System.out.println("KthNode from end "+list.getKthValueFromTheEnd(-1));

       list.printValues();
       list.reverseList();
        list.printValues();
        list.deleteLast();
        list.printValues();

    }




}
