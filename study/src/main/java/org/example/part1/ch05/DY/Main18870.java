package org.example.part1.ch05.DY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int[] arr = new int[n];
        int[] arr2 = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            arr2[i] = arr[i];
        }

        Arrays.sort(arr);

        //배열의 압축값을 map에 저장
        int number = 0;
        for (int i = 0; i< n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], number++);
            }
        }

        // arr2를 이용해 압축된 좌표를 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(map.get(arr2[i])).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}

