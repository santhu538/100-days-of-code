package com.coding.ds.model;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {
    private String expression;
    public Expression(String expression) {
        this.expression = expression;
    }

    private final List<Character> leftBrackets = Arrays.asList('{','(','[','<');
    private final List<Character> rightBrackets = Arrays.asList('}',')',']','>');

    public boolean isExpressionBalanced() {
        char[] chArr = expression.toCharArray();
        Stack<Character> stack = new Stack<>();
        char bracket;
        for(char ch:chArr) {
            if(leftBrackets.contains(ch)) {
                stack.push(ch);
            }
            else if(rightBrackets.contains(ch)) {
                if(!bracketsMatch(stack.pop(), ch)) {
                    return false;
                }
            }
        }
        return true;
    }
    private boolean bracketsMatch(char begin, char end) {
        return leftBrackets.indexOf(begin) == rightBrackets.indexOf(end);
    }

    public boolean isBalanced() {
        char[] chArr = expression.toCharArray();
        Stack<Character> stack = new Stack<>();
        char bracket;
        for(char ch:chArr) {
            if(leftBrackets.contains(ch)) {
                stack.push(ch);
            }
            else if(rightBrackets.contains(ch)) {
                if(stack.empty()) return false;
                stack.pop();
            }
        }
        return stack.empty();
    }

    public String reverse() {
        Stack<Character> stack = new Stack<>();
        char[] chArr = expression.toCharArray();
        for(char ch:chArr) {
            stack.push(ch);
        }
        StringBuilder reverse = new StringBuilder();
        while(!stack.empty()) {
            reverse.append(stack.pop());
        }
        return reverse.toString();
    }
}
