package com.wcx.thinkinjava.bingfa;

/**
 * Created by wcx on 16-6-4.
 */
public class MoreBasicThread {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for LiftOff");
    }
}
