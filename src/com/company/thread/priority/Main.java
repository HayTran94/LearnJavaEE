package com.company.thread.priority;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Thread t1 = new Thread("1");
        Thread t2 = new Thread("2");
        Thread t3 = new Thread("3");

        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
