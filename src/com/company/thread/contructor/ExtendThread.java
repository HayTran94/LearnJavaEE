package com.company.thread.contructor;

public class ExtendThread extends java.lang.Thread {
    private String name;
    private int interval;

    public ExtendThread(String name, int interval) {
        this.name = name;
        this.interval = interval;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            System.out.printf("ExtendThread %s is running\n",this.name);
            try {
                ExtendThread.sleep(this.interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
