package org.example.part1.ch04.EJ;

import java.util.Scanner;

public class Main11068 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] arr = new int[T];
        int i = 0;
        while( T --> 0 ) {
            arr[i++] = sc.nextInt();
        }

        for(int k = 0 ; k < arr.length; k++){
            boolean isPalindrome = false;
            for(int j = 2; j <= 64 ;j++){
                if(isPalindromeFun(solution(arr[k],j))) {
                    isPalindrome = true;
                    break;
                }
            }
            if(isPalindrome)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }

    static boolean isPalindromeFun(String n) {
        for(int i = 0 ; i < n.length()/2; i++){
            if(n.charAt(i) != n.charAt(n.length()-i-1))
                return false;
        }
        return true;
    }

    public static String solution(int n, int b) {
        if (n == 0) return "0";  // 숫자가 0인 특수한 경우를 처리

        StringBuilder result = new StringBuilder();
        while (n > 0) {
            int num = n % b;
            if (num < 10) {
                result.append(num);
            } else {
                result.append((char) (num - 10 + 'A'));  // 나머지를 적절한 문자로 변환
            }
            n /= b;
        }
        return result.toString();
    }
}
