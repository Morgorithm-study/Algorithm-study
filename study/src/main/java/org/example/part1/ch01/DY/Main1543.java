package org.example.part1.ch01.DY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        int l = str1.length();
        int l2 = str2.length();

        str1 = str1.replace(str2, "");

        int cnt = (l - str1.length()) / l2;
        System.out.println(cnt);
    }
}
