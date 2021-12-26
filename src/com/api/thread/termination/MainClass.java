package com.api.thread.termination;

public class MainClass {
    public static void main(String[] args) {
        Thread thread = new Thread(new BlockingTask());
        thread.start();
        thread.interrupt();
    }

    public static class BlockingTask implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(50000);
            } catch (InterruptedException ex) {
                System.out.println("Exiting blocking thread");
            }
        }
    }
}
