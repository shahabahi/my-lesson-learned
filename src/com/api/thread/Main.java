package com.api.thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("We are in Thread : "+ Thread.currentThread().getName() );
                System.out.println("Current Thread priority is : "+ Thread.currentThread().getPriority() );
                throw new RuntimeException("salam");
            }
        });
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println(t.getName() + " the error is :" + e.getMessage());
            }
        });

        thread.setName("New worker thread");
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("We are in Thread : "+ Thread.currentThread().getName() + " Before starting a new thread ");
        thread.start();
        System.out.println("We are in Thread : "+ Thread.currentThread().getName() + " After starting a new thread ");
//        Thread.sleep(10000);
    }
}
