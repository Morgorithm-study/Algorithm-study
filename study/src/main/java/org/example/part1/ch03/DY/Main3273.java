package org.example.part1.ch03.DY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int l = 0;
        int r = n-1;
        int cnt = 0;
        while(l < r){
           int sum = arr[l] + arr[r];
           if(sum == m){
               cnt++;
               l++;
               r--;
           } else if (sum > m)
               r--;
           else
               l++;

        }
        System.out.println(cnt);
    }
}
