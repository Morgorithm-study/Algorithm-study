package org.example.part1.ch03.YJ;

import java.util.Scanner;

public class Main1236 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();

        char[][] arr = new char[n][m];

        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.next().toCharArray();
        }

        boolean[] existRow = new boolean[n];
        boolean[] existCol = new boolean[m];

        int existRowCount = 0;

        for(int i = 0; i < n; i++) {
            boolean exist = false;
            for(int j = 0; j < m; j++){
                if(arr[i][j]=='X'){
                    existRow[i] = true;
                    existCol[j] = true;
                }
            }
        }
        int needRowCount = n;
        int needColCount = m;

        for(int i = 0 ; i < n ; i++){
            if(existRow[i]==true)
                needRowCount--;
        }

        for(int j = 0 ; j < m ; j++){
            if(existCol[j]==true)
                needColCount--;
        }
        System.out.println(Math.max(needRowCount,needColCount));

    }
}
