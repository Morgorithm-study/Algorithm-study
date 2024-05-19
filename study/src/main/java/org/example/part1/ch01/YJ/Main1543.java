package org.example.part1.ch01.YJ;

import java.util.Scanner;

public class Main1543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word = sc.nextLine();
        int i = 0;
        while(str.contains(word)){// a a a
            int idx = str.indexOf(word);// 1
            i++;
            str = str.substring(idx+word.length()); //a a
        }
        System.out.print(i);
    }
}

