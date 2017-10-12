package com.base;

/**
 * Created by h on 2017/10/11.
 */
public class Test01 {

    public static void main(String[] args) {
        /*Thread t1 = new Thread();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        Thread t = new DeamonT();
        t.setDaemon(true);      //守护线程不能作为虚拟机是否退出的一个标志
        t.start();
    }

    public static class DeamonT extends Thread{
        public void run(){
            while (true){
                System.out.println("Live");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }

    }
}
