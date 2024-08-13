package org.example.part1.ch05.DY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];

        for(int i = 0; i < N; i++) {
            // 한 줄을 읽어옵니다.
            st = new StringTokenizer(br.readLine());

            arr[i][0] = st.nextToken(); // 나이
            arr[i][1] = st.nextToken(); // 이름
        }
        br.close();

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }
        });

        // 배열의 내용을 출력해볼 수도 있습니다.
        // 예: 나이와 이름을 출력
        for(int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
