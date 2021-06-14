package com.deepanshu;

public class MyTasks implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Started Executing threadQueue element: -> "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ended threadQueue element: -> "+Thread.currentThread().getName());
    }
}
