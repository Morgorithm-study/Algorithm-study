package org.example.part1.ch02.YJ;

import java.util.Scanner;

public class Main10158 {
    public static void main(String[] args) {
        /* 시간 초과남 . */
        int w, h;
        int p, q;
        int t;

        Scanner sc = new Scanner(System.in);
        w = sc.nextInt();
        h = sc.nextInt();

        p = sc.nextInt();
        q = sc.nextInt();

        t = sc.nextInt();

        int deltaX = 1;
        int deltaY = 1;
        int currX = p;
        int currY = q;

        for (int i = 0; i < t; i++) {
            if (currX == 0 || currX == w) {
                deltaX *= -1;
            }
            if (currY == 0 || currY == h) {
                deltaY *= -1;
            }
            currX += deltaX;
            currY += deltaY;
        }

        System.out.println(currX + " " + currY);
    }
}
