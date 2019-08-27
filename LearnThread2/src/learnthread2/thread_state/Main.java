/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnthread2.thread_state;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author haytran
 */
public class Main {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread exited");
            }
        });
        r.addShutdownHook(thread);
        System.out.println("Now main sleeping... press ctrl+c to exit");
        try {
            Thread.sleep(100000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
