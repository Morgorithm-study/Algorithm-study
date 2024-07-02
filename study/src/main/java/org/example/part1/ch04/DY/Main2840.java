package org.example.part1.ch04.DY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2840 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        char[] wheel = new char[N];
        for (int i = 0; i < N; i++) {
            wheel[i] = '?';
        }

        int current = 0;
        int check = 0;
        boolean[] used = new boolean[26]; //문자 중복 확인
        for (int i = 0; i < K; i++) {
            String[] str = br.readLine().split(" ");
            int spin = Integer.parseInt(str[0]);
            char ch = str[1].charAt(0);

            current = (current + spin) % N;
            if(wheel[current] != '?' && wheel[current] != ch){ //비어있지 않으면서 기존 단어와 다를때
                check = 1;
            } else if (wheel[current] == '?') { //비어있을 때 -> 알파벳 넣어야함
                if(used[ch - 'A']){ //우선 같은 알파벳을 넣고 있는지? -> true라면
                    check = 1; //얜 오류
                }else { //아니라면
                    wheel[current] = ch; //단어집어넣기
                    used[ch - 'A'] = true; //이 단어는 사용하고 있다고 표시
                }
            }
        }


        if(check == 0){
            for (int i = 0; i < N; i++) {
                System.out.print(wheel[(current - i + N) % N]);
            }
        }else {
            System.out.println("!");
        }
    }

}
