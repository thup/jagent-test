package com.javaagentboot.javaagentboot;

/**
 * @Author tlibn
 * @Date 2020/6/13 19:17
 **/
public class TestMain {

    public static void main(String[] args) {
        System.out.println("main start");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main end");
    }

}
