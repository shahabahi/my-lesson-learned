package com.api.thread.termination;

import java.math.BigInteger;

public class DaemonThread {

    public static void main(String[] args) {
        Thread thread = new Thread(new MainClass1.LongComputationTask(new BigInteger("20000"), new BigInteger("10000000")));
        thread.setDaemon(true);
        thread.start();
        thread.interrupt();
    }

    public static class LongComputationTask implements Runnable {
        private BigInteger base;
        private BigInteger power;

        public LongComputationTask(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
            System.out.println(base + "^" + power + " = " + pow(base, power));
        }

        private BigInteger pow(BigInteger base, BigInteger power) {
            BigInteger result = BigInteger.ONE;
            for (BigInteger i = BigInteger.ZERO; i.compareTo(power) != 0; i = i.add(BigInteger.ONE)) {
                result = result.multiply(base);
            }
            return result;

        }
    }
}
