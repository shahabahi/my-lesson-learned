package com.api.thread.atomicreference;

import java.util.concurrent.atomic.AtomicReference;

public class MyClass {
    public static void main(String[] args) {
        String oldName="oldName";
        String newName="newName";
        AtomicReference<String> atomicReference=new AtomicReference<>(oldName);

        if(atomicReference.compareAndSet(oldName,newName)){
            System.out.println("New value is "+ atomicReference.get());
        }else{
            System.out.println("Nothing changed");
        }


    }
}
