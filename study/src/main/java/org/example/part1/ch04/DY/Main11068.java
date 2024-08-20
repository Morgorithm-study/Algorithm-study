package org.example.part1.ch04.DY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main11068 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < n; i++) {
            if (isPalindrome(arr[i])) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    private static boolean isPalindrome(int num) { //n진수로 변환
        for (int i = 2; i <= 64; i++) {
            StringBuilder sb = new StringBuilder();
            int tmp = num;
            while (tmp > 0) {
                if (tmp % i < 10) {
                    sb.append(tmp % i);
                } else {
                    sb.append((char) ('A' + tmp % i - 10));
                }
                tmp /= i;
            }
            if (isPalindromeString(sb.toString())) {
                return true;
            }
        }
        return false;
    }
    private static boolean isPalindromeString(String s) { //찐 palindrome인지 확인
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
