package com.march;

public class Main {
    public static void main(String[] args) {
        Stacks test1 = new Stacks();
        System.out.println("Test FIFO: ");
        test1.fifo();
        test1.fifoString();
        System.out.println("Test LIFO: ");
        test1.lifo();
        test1.lifoString();

    }
}