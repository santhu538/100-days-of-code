package com.coding.ds;

import com.coding.ds.model.Expression;

public class StackDemo {

    public static void main(String[] args) {
        StackDemo stackDemo = new StackDemo();


        String expression = "([4+(1+<3>)]+<1>)";
        Expression exp = new Expression(expression);
        System.out.println("Reverse of "+expression+" is "+exp.reverse());
        System.out.println("is Expression Balanced :: "+exp.isBalanced());
        System.out.println("is Expression Balanced :: "+exp.isExpressionBalanced());

        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        System.out.println(" peek "+stack.peek());
        System.out.println(" pop "+stack.pop());
        System.out.println(stack);
        System.out.println(" pop "+stack.pop());
        System.out.println("\n empty ? "+stack.empty());
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        System.out.println("\n empty ? "+stack.empty());
    }



}
