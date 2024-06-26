package org.example.part1.ch04.EJ;

import java.util.Scanner;

public class Main10448 {
    static boolean[] isEurekaNumber = new boolean[1001];
    public static void preprocess() {
        //1. k보다 작은 삼각수를 모두 구한다

        int[] triangleNumbers = new int[50];
        int triangleNumberCount = 0;
        for(int i = 1 ; ; i++) {
            int triangleNumber = i * (i + 1) / 2;
            if (triangleNumber >= 1000) break;
            triangleNumbers[triangleNumberCount++] = triangleNumber;
        }
        //2. 구해진 삼각수 세개의 합으로 k를 나타낼 수 있는지 확인한다.
        boolean[] isSumOfTriangleNumber = new boolean[1000];

        //2개의 합
        for(int i = 0; i < triangleNumberCount; i++)
            for(int j = 0; j < triangleNumberCount; j++) {
                int sum = triangleNumbers[i] + triangleNumbers[j];
                if (sum < 1000) isSumOfTriangleNumber[sum] = true;
            }

        //2개의 합 + triangleNumber
        for (int i = 1; i < 1000; i++) {
            if (!isSumOfTriangleNumber[i]) continue;
            for(int j = 0 ; j < triangleNumberCount; j++){
                int sum = i + triangleNumbers[j];
                if (sum <= 1000) isEurekaNumber[sum] = true;
            }
        }
    }
    public static void main(String[] args) {
        // [3,1000]
        // isEurekaNumber[]
        preprocess();


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n --> 0){
            int k = sc.nextInt();
            //1. k보다 작은 삼각수를 모두 구한다
            //2. 구해진 삼각수 세개의 합으로 k를 나타낼 수 있는지 확인한다.
            System.out.println(isEurekaNumber[k] ? "1" : "0");
        }


        /*
        t1 = 1 = 1 = t1+0
        t2 = 1+2 = 3 = t1+2
        t3 = 1+2+3 = 6 = t2+3 = t1+0 + t1+2
        t4 = 1+2+3+4 = 10
        t5 = 1+2+3+4+5 = 15 = t4+5 =
        t6 = t5+6
        ...


         */

    }

}
