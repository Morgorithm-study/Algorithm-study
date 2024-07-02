package org.example.part1.ch04.DY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1730 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] pan = new char[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                pan[i][j] = '.';
            }
        }

        String sbr = br.readLine();
        String str = "";
        if (sbr != null) {
            str = sbr;
        }

        int x = 0;
        int y = 0;

        // 움직임 시작
        for (int i = 0; i < str.length(); i++) {
            // 1. 방향 확인
            char dir = str.charAt(i);

            // 2. 좌표 벗어나는지 체크
            int nx = x;
            int ny = y;
            // 이동
            if (dir == 'U') {
                nx--;
            } else if (dir == 'D') {
                nx++;
            } else if (dir == 'L') {
                ny--;
            } else if (dir == 'R') {
                ny++;
            }

            if (nx < 0 || nx >= N || ny < 0 || ny >= N) {
                continue;
            }


            if ((pan[x][y] == '|' && (dir == 'R' || dir == 'L'))
                    || (pan[x][y] == '-' && (dir == 'U' || dir == 'D'))) {
                pan[x][y] = '+';
            } else if (pan[x][y] == '.' && (dir == 'R' || dir == 'L')) {
                pan[x][y] = '-';
            } else if (pan[x][y] == '.' && (dir == 'U' || dir == 'D')) {
                pan[x][y] = '|';
            }

            if ((pan[nx][ny] == '|' && (dir == 'R' || dir == 'L'))
                    || (pan[nx][ny] == '-' && (dir == 'U' || dir == 'D'))) {
                pan[nx][ny] = '+';
            } else if (pan[nx][ny] == '.' && (dir == 'R' || dir == 'L')) {
                pan[nx][ny] = '-';
            } else if (pan[nx][ny] == '.' && (dir == 'U' || dir == 'D')) {
                pan[nx][ny] = '|';
            }

            x = nx;
            y = ny;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(pan[i][j]);
            }
            System.out.println();
        }
    }
}
