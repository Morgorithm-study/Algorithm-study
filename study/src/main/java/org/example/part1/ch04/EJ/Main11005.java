package org.example.part1.ch04.EJ;

import java.util.Scanner;

public class Main11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        if (N == 0) {
            System.out.println("0");
        } else {
            solution(N, B);
        }
    }

    public static void solution(int n, int b) {
        if (n == 0) return;

        int num = n % b;
        solution(n / b, b);

        if (num < 10) {
            System.out.print(num);
        } else {
            System.out.print((char) (num - 10 + 'A'));
        }
    }
}
