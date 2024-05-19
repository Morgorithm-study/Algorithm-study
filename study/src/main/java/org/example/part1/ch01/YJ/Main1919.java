package org.example.part1.ch01.YJ;
import java.util.*;
public class Main1919 {
    public static void main(String[] args) {
        /*1919*/

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String result = "";
        String big="";
        String small="";
        int cnt = 0;
        int bigIdx = 0;
        int smIdx = 0;
        //dared
        //bread
        // b => x, r => o, e => o, a => o, d => o

        //aabbcc
        //bby
        // 긴문자열에서 4, 작은 문자열에서 1제거

        //aabbcc - b (smCnt=1)
        //aabbcc - b (smCnt=2)
        //aabbcc - y
        ///0
        //result = bb
        // aabbcc.length - result.length
        // bby.length - result.length

        if (str1.length() < str2.length()) {
            big=str2;
            small=str1;
        }
        else{
            big=str1;
            small=str2;
        }

        while (smIdx < small.length()) {
            if(big.contains(Character.toString(small.charAt(smIdx)))) {
                result += small.charAt(smIdx);
                smIdx ++;
            }
            else {
                smIdx++;
            }
        }

        cnt = big.length() - result.length() + small.length() - result.length();
        System.out.print(cnt);
    }
}
