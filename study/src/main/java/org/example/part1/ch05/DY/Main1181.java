package org.example.part1.ch05.DY;

import java.io.*;
import java.util.Arrays;

public class Main1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];
        for(int i = 0; i < N; i++){
            arr[i] = br.readLine();
        }
        br.close();

        Arrays.sort(arr, ((o1, o2) -> {
            if(o1.length() == o2.length()){
                return o1.compareTo(o2);
            }
            else{
                return o1.length() - o2.length(); //오름차순
            }
        }));

        String str = arr[0];
        System.out.println(str);
        for(int i = 1; i< N; i++){
            if(!arr[i].equals(str)){
                System.out.println(arr[i]);
                str = arr[i];
            }
        }
    }
}
