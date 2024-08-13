package org.example.part1.ch03.YJ;

import java.util.Arrays;
import java.util.Scanner;

public class Main3273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int k = 0; k < n; k++){
            arr[k] = sc.nextInt();
        }
        int x = sc.nextInt();
        Arrays.sort(arr);
        int count = 0;
        int start = 0;
        int end = n - 1;

        while(start < end) {
            int sum = arr[start] + arr[end];
            if(sum == x) {
                count++;
                start++;
                end--;
            } else if(sum < x) {
                start++;
            } else {
                end--;
            }
        }
        System.out.print(count);
    }
}
