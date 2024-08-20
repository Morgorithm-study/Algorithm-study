package org.example.part1.ch04.DY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = 0;
        int m = 0;
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());


        ArrayList<String> result = new ArrayList<>();
        while(n > 0){
            if(n % m < 10)
                result.add(String.valueOf(n % m));
            else {
                char a = (char)('A' + (n % m) - 10);
                result.add(String.valueOf(a));
            }
            n /= m;
        }
        for(int i = result.size() - 1; i >= 0; i--) {
            System.out.print(result.get(i));
        }
    }
}
