package org.example.part1.ch01.DY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//개미
public class Main10158 {
    public static void main(String[] args) throws IOException {
        //문제 이해 : 첫번재 입력 - 6*4 배열크기, 시작은 (4,1), 8시간 뒤의 좌표값??
        //이동은?? -> (x + 1, y + 1)
        //(6,3) -> x값이 끝임 -> (x-1, y+1) / (5, 4) -> y값이 끝임 (x-1, y-1)
        // (4,1), (5,2), (6,3), (5,4), (4,3), (3,2), (2,1), (0,1), (1, 0)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int t = Integer.parseInt(br.readLine());

        p = w - Math.abs(w - (t + p) % (w * 2));
        q = h - Math.abs(h - (t + q) % (h * 2));

        System.out.printf("%d %d", p, q);

    }
}
