package learnthread2.thread_state;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author haytran
 */
public class TrackingThread {

    public Thread myThread;
    public Thread.State myState;

    public TrackingThread(Thread myThread) {
        this.myThread = myThread;
        this.myState = null;
    }

    public void tracking() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                do {       
                    Thread.State newState = myThread.getState();
                    if (newState != myState) {
                        System.out.println("NEW STATE: " + newState + ", at " + System.currentTimeMillis());
                        myState = newState;
                    }
                    if (!myThread.isAlive()) {
                        myThread.start();
                    }
                } while (true); 
            }
        }).start();
    }
}
