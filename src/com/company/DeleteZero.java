package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class DeleteZero {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(reader.readLine().trim());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < K; i++) {
            int N = Integer.parseInt(reader.readLine().trim());
            if (N == 0) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(N);
            }
        }

        int sum = stack.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}


// 백준 제출용

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Stack;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int K = Integer.parseInt(reader.readLine().trim());
//        Stack<Integer> stack = new Stack<>();
//
//        for (int i = 0; i < K; i++) {
//            int N = Integer.parseInt(reader.readLine().trim());
//            if (N == 0) {
//                if (!stack.isEmpty()) {
//                    stack.pop();
//                }
//            } else {
//                stack.push(N);
//            }
//        }
//
//        int sum = stack.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(sum);
//    }
//}
