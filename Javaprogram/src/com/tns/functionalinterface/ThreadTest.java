package com.tns.functionalinterface;

public class ThreadTest {
    public static void main(String args[]) {

        Thread myThread = new MyThread();

        myThread.run(); // #1

        System.out.println("In main method; thread name is: " + Thread.currentThread().getName());

    }


}
