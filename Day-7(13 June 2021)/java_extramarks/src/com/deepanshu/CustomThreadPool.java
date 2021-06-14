package com.deepanshu;

import java.util.concurrent.LinkedBlockingQueue;

public class CustomThreadPool implements CustomExecutorService{
    static int capacity;
    static int currentCapacity;
    static LinkedBlockingQueue<Runnable> taskQueue;
    Execution e;
    public CustomThreadPool(int capacity) {
        this.capacity = capacity;
        currentCapacity = 0;
        taskQueue = new LinkedBlockingQueue<Runnable>();
        e = new Execution();
    }

    @Override
    public void execute(Runnable r){
        taskQueue.add(r);
        e.executeMyThread();
    }
}
