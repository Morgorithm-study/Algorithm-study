package org.example.part1.ch04.DY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

//층수 n번째 % m층 = 해당 층수  6층 6번재 - >601
//호  (n번째 / m층) + 1 = 호수  6층 12번째  -> 2
public class Main10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();

        int n = Integer.parseInt(br.readLine()); // 테스트 케이스의 수

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken()); // 호텔의 층 수
            int W = Integer.parseInt(st.nextToken()); // 각 층의 방 수
            int N = Integer.parseInt(st.nextToken()); // N번째 손님

            // 층수 계산
            int floor = N % H;
            // 호수 계산
            int roomNumber = N / H;

            // 만약 나머지가 0이면, 최상층에 배정
            if (floor == 0) {
                floor = H;
            }else {
                roomNumber += 1;
            }

            // 방 번호 형식 맞추기
            String room = String.format("%d%02d", floor, roomNumber);

            arrayList.add(room);
        }

        for(String a: arrayList){
            System.out.println(a);
        }
    }
}
