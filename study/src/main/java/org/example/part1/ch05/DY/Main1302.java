package org.example.part1.ch05.DY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int max = 0;
        HashMap<String ,Integer> map =new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = br.readLine();
            if (!map.containsKey(name)) {
                map.put(name,1);
            }
            else map.put(name,map.get(name)+1);

            max = Math.max(max, map.get(name));
        }
        br.close();

        ArrayList<String> arr = new ArrayList<String>(map.keySet());
        Collections.sort(arr);

        for(String a : arr){
            if(map.get(a) == max){
                System.out.println(a);
                break;
            }
        }
    }
}
