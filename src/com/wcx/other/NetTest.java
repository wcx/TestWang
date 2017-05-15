package com.wcx.other;


import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by wcx on 16-8-2.
 */
public class NetTest {
    static String result = "";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            for (int i=0;i<n;i++){
                int[]x={};
                x[i]=in.nextInt();
            }
        }
//        int n = 3;
//        int[] x = {7, 6, 8};
//        int[] y = {1, 2, 1};
//        int result = x[0] + y[0] - 2;
//        for (int i = 1; i < n; i++) {
//            if (result > x[i] + y[i] - 2) {
//                result = x[i] + y[i] - 2;
//            }
//        }
//        System.out.println(result);
//    }
    }
}
