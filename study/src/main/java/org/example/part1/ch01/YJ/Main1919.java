package org.example.part1.ch01.YJ;

import java.util.*;
public class Main1919 {
    public static void main(String[] args) {
        /*1919*/

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];

        int cnt = 0;

        for(int i = 0; i < str1.length(); i++){
            cnt1[str1.charAt(i) - 'a'] += 1;
        } //aabbcc
        //2 2 2 0 0 0 0 ....

        for(int j = 0 ; j < str2.length(); j++){
            cnt2[str2.charAt(j) - 'a'] += 1;
        } //xxyybb
        //0 2 0 0 0 .... 2 2
        //

        for(int k = 0 ; k < 26; k++){
            cnt += (cnt1[k] > cnt2[k] ? cnt1[k]-cnt2[k] : cnt2[k] - cnt1[k]);
        }

        System.out.print(cnt);
    }
}

