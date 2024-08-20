package org.example.part1.ch01.DY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] c = new int[26];

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                c[str.charAt(i) - 'a']++;
            else
                c[str.charAt(i) - 'A']++;
        }

        int max = -1;
        char ch = '?';
        for(int i = 0; i < c.length; i++){
            if(c[i] > max){
                max = c[i];
                ch = (char) (i + 'A');
            }
            else if (c[i] == max)
                ch = '?';

        }
        System.out.println(ch);
    }
}
