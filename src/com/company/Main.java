package com.company;

import com.company.thread.contructor.ExtendThread;
import com.company.thread.contructor.ImplementRunnable;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello world");
	    ExtendThread t1 = new ExtendThread("1", 600);
        ExtendThread t2 = new ExtendThread("2", 800);
        ImplementRunnable r1 = new ImplementRunnable("1", 700);
        ImplementRunnable r2 = new ImplementRunnable("2", 1000);
        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(r2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
