package com.march;

import java.util.Stack;

public class Stacks{

    public void lifo() {

        Stack<Integer> numbers = new Stack<>();
        for (int i = 0; i < 10; i++) {
                numbers.push(i);
                System.out.println(numbers);
        }
        for (int i = 0; i < 10; i++) {
            if (!numbers.isEmpty()) {
                numbers.pop();
                System.out.println(numbers);
            }
        }
    }
    public void fifo(){

        Stack<Integer> numbers = new Stack<>();
        for (int i = 0; i < 10; i++) {
            numbers.push(i);
            System.out.println(numbers);
        }
        for (int i = 0; i < 10; i++) {
            if (!numbers.isEmpty()) {
                numbers.remove(0);
                System.out.println(numbers);
            }
        }
    }
    String[] letters = {"a","b","c","d","e","f","g"};
    public void lifoString() {
        Stack<String> strings = new Stack<>();
        for (int i = 0; i < letters.length; i++) {
            strings.push(letters[i]);
            System.out.println(strings);
        }
        for (int i = 0; i < 10; i++) {
           if (!strings.isEmpty()) {
               strings.pop();
               System.out.println(strings);
           }
        }
    }
    public void fifoString() {
        Stack<String> strings = new Stack<>();
        for (int i = 0; i < letters.length; i++) {
            strings.push(letters[i]);
            System.out.println(strings);
        }
        for (int i = 0; i < 10; i++) {
            if (!strings.isEmpty()) {
                strings.remove(0);
                System.out.println(strings);
            }
        }
    }
}