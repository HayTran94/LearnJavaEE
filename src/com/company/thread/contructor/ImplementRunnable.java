package com.company.thread.contructor;

public class ImplementRunnable implements Runnable {

    private String name;
    private int interval;

    public ImplementRunnable(String name, int interval) {
        this.name = name;
        this.interval = interval;
    }

    @Override
    public void run() {
        while(true) {
            System.out.printf("ImplementRunnable %s is running\n",this.name);
            try {
                Thread.sleep(this.interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
