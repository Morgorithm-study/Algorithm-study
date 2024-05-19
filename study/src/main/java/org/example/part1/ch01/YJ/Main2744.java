package org.example.part1.ch01.YJ;

import java.util.Scanner;

public class Main2744 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i = 0 ;i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                System.out.print((char)(ch - 'A' + 'a'));
                // A와 몇 칸 떨어져있는지 구하고, 그 거리를 a에 더함
            }
            else {
                System.out.print((char)(ch - 'a' + 'A'));
            }
        }

    }
}
