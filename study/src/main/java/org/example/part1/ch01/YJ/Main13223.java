package org.example.part1.ch01.YJ;

import java.util.Scanner;

public class Main13223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String curTime = sc.next();
        String resultTime = sc.next();

        //현재 시간 20:00:00
        //투하 시간 04:00:00
        /*기다려야 하는 시간 08:00:00
        현재 12 34 56
        투하 14 36 22
        기달 02 01 26
        12시 34분 56초
        14시 36분 22초
        1시간 = 60분 = 60*60초 = 3600초
        34분 56초는,, 60*34 + 56초 = 2096초
        36분 22초는,, 60*36 + 22초 = 2182초
        14시 2182초 = 52582초
        12시 2096초 = 45296초
        빼면 7286초 =

        7286초 = 7286 / 60 분
        60분 = 1시간
        121.4333분 = x시간

        *
        * */
        String[] cur = curTime.split(":");
        String[] res = resultTime.split(":");

        int curSec_h = Integer.parseInt(cur[0])*3600;
        int curSec_m = Integer.parseInt(cur[1])*60;
        int curSec_s = Integer.parseInt(cur[2]);

        int resSec_h = Integer.parseInt(res[0])*3600;
        int resSec_m = Integer.parseInt(res[1])*60;
        int resSec_s = Integer.parseInt(res[2]);

        int resTotal = resSec_h+resSec_m+resSec_s;
        int curTotal = curSec_h+curSec_m+curSec_s;

        String hour = "";
        String min = "";
        String sec = "";

        if ( resTotal - curTotal <= 0 )
            resTotal += 86400;

        int h = (resTotal - curTotal)/3600;
        int m = ((resTotal - curTotal)/60)%60;
        int s = (resTotal - curTotal)%60;

        System.out.printf("%02d:%02d:%02d\n", h, m, s);

    }
}
