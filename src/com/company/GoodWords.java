package com.company;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class GoodWords {
    static int count;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int quantity = Integer.parseInt(bf.readLine().trim());
        count = 0;

        for (int i = 0; i < quantity; i++) {
            Stack<Character> s = new Stack<>();
            String line = bf.readLine();
            checkGoodWord(line);
        }
        System.out.println(count);
    }

    public static void checkGoodWord(String s) {
        if (s.length() % 2 == 1) return;

        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (stack.size() > 0 && stack.peek() == s.charAt(i)) {
                stack.pop();
            } else {
                stack.add(s.charAt(i));
            }
        }
        if (stack.isEmpty()) count++;
    }
}



// 글자를 입력받아서 한 개씩 청크를 내고
// 그 값들을 큐에 집어넣음
// 만약 큐가 빈 상태가 되면은 그건 좋은단어, 그리고 스코어를 하나 올림
// 그 값을 최종적으로 뱉으면 돼


