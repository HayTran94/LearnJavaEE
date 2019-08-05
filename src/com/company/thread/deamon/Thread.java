package com.company.thread.deamon;

public class Thread extends java.lang.Thread {
    public Thread(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            try {
                java.lang.Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("%s is running\n", getName());
        }
    }
}
