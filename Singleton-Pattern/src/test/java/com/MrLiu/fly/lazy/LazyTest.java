package com.MrLiu.fly.lazy;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author liu_l
 * @email: liu_lei_programmer@163.com
 * @time 2019/4/16 15:17
 * @Description: 描述: 懒汉模式测试类，验证懒汉模式多线程不安全
 */
public class LazyTest {

    private static CountDownLatch countDownLatch = new CountDownLatch(4);

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 4; i++){
            Task task = new Task();
            new Thread(task).start();
            countDownLatch.countDown();
        }
        TimeUnit.SECONDS.sleep(4);
    }

    static class Task implements Runnable{

        @Override
        public void run() {
            try {
                //TimeUnit.SECONDS.sleep(2);
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            LazySingleton lazySingleton = LazySingleton.getInstance();
            System.out.println(lazySingleton);
        }
    }
}
