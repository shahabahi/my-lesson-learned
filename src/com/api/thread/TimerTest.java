package com.api.thread;

import java.util.*;

public class TimerTest {
    public static void main(String[] args) {
        TimerTask task=new TimerTask(){
            public void run(){
                System.out.println(new Date());
            }
        };
        Timer timer=new Timer();
        timer.schedule(task,1000,1000);
    }
}
