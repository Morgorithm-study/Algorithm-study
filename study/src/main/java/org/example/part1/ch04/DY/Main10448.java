package org.example.part1.ch04.DY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main10448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
           arr[i] = Integer.parseInt(br.readLine());
        }

        ArrayList<Integer> num = new ArrayList<>();
        int sum = 0;
        int len = 0;
        for(int i = 1; ; i++){
            sum = i*(i+1)/2;
            if(sum > 1000) break;
            else {
                num.add(sum);
                len++;
            }
        }

        for (int value : arr) {
            int check = 0;
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    for (int k = 0; k < len; k++) {
                        if (value == num.get(i) + num.get(j) + num.get(k)) {
                            check = 1;
                            break;
                        }
                    }
                }
            }
            if (check == 0) System.out.println(0);
            else System.out.println(1);
        }

    }
}
