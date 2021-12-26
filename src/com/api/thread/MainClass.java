package com.api.thread;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        Runnable updater = new Runnable() {
            @Override
            public void run() {
                Sequence sequence = new Sequence();
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+ " -- " + sequence.getNext());
                }
            }
        };
        Thread thread1 = new Thread(updater, "t1");
        Thread thread2 = new Thread(updater, "t2");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

    }
}
