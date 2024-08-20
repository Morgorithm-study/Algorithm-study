package org.example.part1.ch05.DY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String enterOrLeave = st.nextToken();

            if(enterOrLeave.equals("enter")){
                set.add(name);
            }else{
                set.remove(name);
            }
        }
        br.close();

        ArrayList<String> str = new ArrayList<>(set);
        Collections.sort(str, (o1, o2) -> {
            return o2.compareTo(o1);
        });

        for(int i = 0; i < str.size(); i++){
            System.out.println(str.get(i));
        }
    }
}
