package org.example.part1.ch01.DY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String st1 = bf.readLine();
        String st2 = bf.readLine();

        int[] cs1 = new int[26];
        int[] cs2 = new int[26];

        for (int i = 0; i < st1.length(); i++) {
            cs1[st1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < st2.length(); i++) {
            cs2[st2.charAt(i) - 'a']++;
        }
        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            cnt += Math.abs(cs1[i] - cs2[i]);
        }
        System.out.println(cnt);
    }
}
