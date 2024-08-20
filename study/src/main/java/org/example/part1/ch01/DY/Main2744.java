package org.example.part1.ch01.DY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c >= 'a'){
                System.out.print(String.valueOf(c).toUpperCase());
            }
            else if(c >= 'A'){
                System.out.print(String.valueOf(c).toLowerCase());
            }
        }
    }
}
