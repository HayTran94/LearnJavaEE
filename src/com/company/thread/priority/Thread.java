package com.company.thread.priority;

public class Thread extends java.lang.Thread {
    public Thread(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i ++) {
            System.out.printf("Thread %s (%s) is running with priority %d\n", getName(), getId(), getPriority());
        }
    }
}
