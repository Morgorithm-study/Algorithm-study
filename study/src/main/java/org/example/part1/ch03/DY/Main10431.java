package org.example.part1.ch03.DY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//줄 세우기
//문제이해 : 나보다 작은 수 만큼 cnt더하기
//전체배열 길이에서 for문 횟수뺀 위치 배열 값 바꾸기
public class Main10431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] ans = new int[n];
        int j;
        int k;

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            Integer.parseInt(st.nextToken());
            int[] num = new int[20];
            for (j=0; j < 20; j++) {
                num[j] = Integer.parseInt(st.nextToken());
            }

            int cnt = 0;
            for(j = 0; j < 20; j++){
                for(k = 0; k < j; k++){
                    if(num[j] < num[k]) cnt++;
                }
            }
            ans[i] = cnt;
        }
        for(int i = 0; i <n; i++){
            System.out.println(i+1 + " " + ans[i]);
        }

    }
}
