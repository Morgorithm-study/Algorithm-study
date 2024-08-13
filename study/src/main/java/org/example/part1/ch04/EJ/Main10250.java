package org.example.part1.ch04.EJ;

import java.util.Scanner;

public class Main10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int floor = (N - 1) % H + 1; //배정받을 방의 층 수
            int distance = (N - 1) / H + 1; //엘리베이터와의 거리
            System.out.printf("%d%02d\n", floor, distance);
        }
    }
    /*
    * 1번 - 1층 1호
    * 10번 - 1층 10호
    * 11번 - 1층 2호
    * 22번 - 2층 2호
    * 23번 - 2층 3호
    *
    * 호 : 번호 / 10
    * -> 1-H => H로 나누면, 1~H-1까지는 몫이 0,H만 몫이 1
    * -> H+1 ~ 2H => H로 나누면, 2H-1까지는 몫이 1, 2H만 몫이2
    *
    * -> 0 ~ H-1 (0) / H ~ 2H -1 (1)
    *
    *
    * 층 : 번호 % 10 -> 나머지가 [0, H-1] 까지 나오니, [1,H] 로 변환필요
    * */



}
