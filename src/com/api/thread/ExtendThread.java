package com.api.thread;

public class ExtendThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from : "+ this.getName() );
    }

    public static void main(String[] args) {
        Thread thread=new ExtendThread();
        thread.start();
    }
}
