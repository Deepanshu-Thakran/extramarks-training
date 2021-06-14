package com.deepanshu;

interface CustomExecutorService {
    void execute(Runnable r);
}

class CustomExecutor {
    int capacity;
    static CustomExecutorService fixedThreadPool(int capacity) {
        return new CustomThreadPool(capacity);
    }
}

