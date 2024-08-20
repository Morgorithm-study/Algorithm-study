package org.example.part1.ch05.DY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main2910 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int numCnt = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<Integer>(map.keySet());

      Collections.sort(list, new Comparator<Integer>() {
          @Override
          public int compare(Integer a, Integer b) {
              return Integer.compare(map.get(b), map.get(a)); //내림차순
          }
      });

        // 정렬된 리스트를 출력
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer element = it.next();
            for(int i=0; i<map.get(element); i++){
                sb.append(element+" ");
            }

        }
        System.out.println(sb);
    }
}
