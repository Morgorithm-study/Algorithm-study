package org.example.part1.ch03.DY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//성 지키기
public class Main1236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] castle = new char[n][m];
        int[] c1 = new int[n];
        int[] c2 = new int[m];
        for(int i = 0; i < n; i++){
            String line = br.readLine();
            castle[i] = line.toCharArray();  //배열 입력
        }

        for(int i = 0; i < n; i++){ //3
            for(int j = 0; j < m; j++){
                if(castle[i][j] =='X'){ //X가 있다면 행,열별 계산
                    c1[i] = 1;
                    c2[j] = 1;
                }
            }
        }

        int cnt1 = 0;
        for(int i = 0; i < n; i++){
            if(c1[i] != 1){ //X가 없었던 행 구하기
                cnt1++;
            }
        }

        int cnt2 = 0;
        for(int j = 0; j < m; j++){
            if(c2[j] != 1){ //X가 없었던 열 구하기
                cnt2++;
            }
        }

        System.out.println(Math.max(cnt1, cnt2));
    }
}
