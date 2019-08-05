package com.company.thread.deamon;

public class NonDeamonThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread("1");
        t1.setDaemon(true);
        t1.start();
        Thread.sleep(3000);
        System.out.println("Main thread done");
    }
}
