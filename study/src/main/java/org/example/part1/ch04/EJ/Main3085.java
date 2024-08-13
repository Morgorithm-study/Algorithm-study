package org.example.part1.ch04.EJ;

import java.util.Scanner;

public class Main3085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[][] map = new char[N][N];
        for(int i = 0; i < N; i++)
            map[i] = sc.next().toCharArray();

        /* 1. 가능한 모든 쌍의 사탕을 서로 교환 */
        int ans = 0;
        for(int i = 0 ; i < N; i++){
            for(int j = 0; j < N; j++) {
                //오른쪽 방향 교환
                if (j + 1 < N && map[i][j] != map[i][j + 1]) {
                    swapCandy(map, i, j, i, j + 1);
                    //2. 교환한 상태에서 가장 긴 연속 부분 행/열을 찾는다.
                    ans = Math.max(ans, Math.max(findMaxColumn(map),findMaxRow(map)));
                    //3. 교환한 사탕을 원복한다.
                    swapCandy(map, i, j, i, j + 1); //원복한다
                }

                //아래 교환
                if (i + 1 < N && map[i][j] != map[i + 1][j]) {
                    swapCandy(map, i, j, i + 1, j);
                    ans = Math.max(ans, Math.max(findMaxColumn(map), findMaxRow(map)));
                    swapCandy(map, i, j, i + 1, j); //원복한다
                }
            }
        }
        System.out.println(ans);

    }

    public static void swapCandy(char[][] map, int r1, int c1, int r2, int c2) {
        char tmp = map[r1][c1];
        map[r1][c1] = map[r2][c2];
        map[r2][c2] = tmp;
        /*인접한 네 방향 모두가 아닌 증가하는 두 방향만 확인*/
    }

    public static int findMaxColumn(char[][] map) {
        int N = map.length;
        int maxCol = 0;
        for (int c = 0; c < N; c++) {
            int len = 1; //이전값을 이용한 연속성 판단
            for (int r = 1; r < N; r++) {
                if (map[r][c] == map[r - 1][c]) len ++;
                else {
                    maxCol = Math.max(maxCol, len);
                    len = 1;
                }
            }
            maxCol = Math.max(maxCol, len);
        }
        return maxCol;
    }
    public static int findMaxRow(char[][] map) {
        int N = map.length;
        int maxRow = 0;
        for (int r = 0; r < N; r++) {
            int len = 1; //이전값을 이용한 연속성 판단
            for (int c = 1; c < N; c++) {
                if (map[r][c] == map[r][c - 1]) len ++;
                else {
                    maxRow = Math.max(maxRow, len);
                    len = 1;
                }
            }
            maxRow = Math.max(maxRow, len);
        }
        return maxRow;
    }
}
