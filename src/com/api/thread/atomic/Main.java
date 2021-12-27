package com.api.thread.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        int initialValue=0;
        int delta=100;
        AtomicInteger atomicInteger=new AtomicInteger(initialValue);
        System.out.println(atomicInteger.incrementAndGet());
        System.out.println(atomicInteger.getAndIncrement());
        System.out.println(atomicInteger.addAndGet(delta));
        System.out.println(atomicInteger.getAndAdd(delta));

    }
}
