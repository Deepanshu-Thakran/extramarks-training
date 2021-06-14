package com.deepanshu;

public class Main {

    public static void main(String[] args) {
        CustomExecutorService service = CustomExecutor.fixedThreadPool(3);

        for (int i = 0; i < 20; i++) {
            service.execute(new MyTasks());
        }

//        service.shutdown();
    }
}
