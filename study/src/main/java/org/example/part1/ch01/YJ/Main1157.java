package org.example.part1.ch01.YJ;

import java.util.Scanner;

public class Main1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toUpperCase(); //ZZA
        int[] arr = new int[26];

        for(int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'A'] += 1;
        }
        //ZZAAB
        int max = -1;
        char result = '?';
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]) {
                max = arr[i];
                result = (char) (i+'A');
            }
            else if (max == arr[i]) {
                result = '?';
                break;
            }
        }

        System.out.print(result);
    }
}