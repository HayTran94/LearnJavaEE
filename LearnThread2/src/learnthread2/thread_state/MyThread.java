package learnthread2.thread_state;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author haytran
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        while(true) {
            try {
                System.out.println("Before sleep: " + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("After sleep: " + System.currentTimeMillis());
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
