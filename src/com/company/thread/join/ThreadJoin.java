package com.company.thread.join;

public class ThreadJoin extends Thread {
    public ThreadJoin(String name){
        super(name);
    }

    @Override
    public void run() {
        super.run();
        System.out.println(getName());
        for(int i =0; i < 5; i++) {
            System.out.printf("%s Doing %d\n", getName(), i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("%s done\n", getName());
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadJoin t1 = new ThreadJoin("Thread 1");
        ThreadJoin t2 = new ThreadJoin("Thread 2");

        t1.start();
        t1.join(600);
        t2.start();
        System.out.println("Main thread done");
    }
}
