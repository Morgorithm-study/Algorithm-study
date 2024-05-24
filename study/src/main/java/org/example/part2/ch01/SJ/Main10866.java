package org.example.part2.ch01.SJ;

import java.io.*;
import java.util.*;

public class Main10866 {

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());

    Deque<Integer> dq = new LinkedList<>();

    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      String command = st.nextToken();
      switch (command) {
        case "push_front" :
          dq.addFirst(Integer.parseInt(st.nextToken()));
          break;
        case "push_back":
          dq.addLast(Integer.parseInt(st.nextToken()));
          break;
        case "pop_front":
          if (!dq.isEmpty()) {
            bw.write(String.valueOf(dq.pollFirst()+"\n"));
          } else {
            bw.write("-1\n");
          }
          break;
        case "pop_back" :
          if (!dq.isEmpty()) {
            bw.write(String.valueOf(dq.pollLast())+"\n");
          } else {
            bw.write("-1\n");
          }
          break;
        case "size" :
            bw.write(String.valueOf(dq.size())+"\n");
          break;
        case "empty" :
          if (!dq.isEmpty()) {
            bw.write("0\n");
          } else {
            bw.write("1\n");
          }
          break;
        case "front" :
          if (!dq.isEmpty()) {
            bw.write(String.valueOf(dq.peekFirst())+"\n");
          } else {
            bw.write("-1\n");
          }
          break;
        case "back" :
          if (!dq.isEmpty()) {
            bw.write(String.valueOf(dq.peekLast())+"\n");
          } else {
            bw.write("-1\n");
          }
          break;
      }
    }
    bw.flush();
    bw.close();
    br.close();
  }
}
