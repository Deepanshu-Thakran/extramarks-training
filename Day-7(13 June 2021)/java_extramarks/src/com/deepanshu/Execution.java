package com.deepanshu;

public class Execution implements Runnable{

    void executeMyThread(){
        if (CustomThreadPool.currentCapacity < CustomThreadPool.capacity ) {
            CustomThreadPool.currentCapacity++;
            Thread t = new Thread(new Execution());
            t.start();
        }
    }

    @Override
    public void run(){
        while (true) {
            if (CustomThreadPool.taskQueue.size() != 0) {
                CustomThreadPool.taskQueue.poll().run();
            }
        }
    }
}
