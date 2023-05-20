package org.example;

public class join implements Runnable {
    public void run() {
        // Code to be executed by the thread
        System.out.println("Hello from the Runnable thread");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Demo {
    public static void main(String[] args) {
        join t = new join();
        Thread t1 = new Thread(t);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello from main");
    }
}
