package org.example.part1.ch01.DY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//소금 폭탄
public class Main13223 {
    public static void main(String[] args) throws IOException {
        //문제 이해 : 두번째 시간에서 첫번째 시간 뺀 시간 구하기
        //시,분,초 어케 나눌거니? -> split(":")으로 나누자
        //두번째 시간 보다 첫번째 시간이 더 클 수 있음.. -> 전체 시간으로 더해서 계산하자
        //but 두번째 hour이 크다면 -> 24시간 더해주기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] time1 = br.readLine().split(":");
        String[] time2 = br.readLine().split(":");

        int hour1 = Integer.parseInt(time1[0]);
        int minute1 = Integer.parseInt(time1[1]);
        int second1 = Integer.parseInt(time1[2]);

        int hour2 = Integer.parseInt(time2[0]);
        int minute2 = Integer.parseInt(time2[1]);
        int second2 = Integer.parseInt(time2[2]);

        int total1 = hour1 * 3600 + minute1 * 60 + second1;
        int total2 = hour2 * 3600 + minute2 * 60 + second2;

        if(hour1 >= hour2){
            total2 += 24 * 3600;
        }

        int total = total2 - total1;
        int hour = total/3600;
        int minute = (total % 3600) / 60;
        int second = total % 60;

        System.out.printf("%02d:%02d:%02d",hour,minute,second);
    }
}
