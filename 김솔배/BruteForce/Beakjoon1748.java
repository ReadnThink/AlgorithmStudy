package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Beakjoon1748 {
    public static void main(String[] args) throws IOException {
        // 1. N을 받는다.
        // 2. 1부터 N까지 루프를 돌면서 숫자를 카운트.
        // 3. 자리수를 세주어 출력


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int num = 10;
        int plus = 1;
        int cnt = 0;

        for(int i = 1; i <= N; i++){

            if(i % num == 0){
                plus++;
                num *= 10;
            }
            cnt += plus;

        }

        System.out.println(cnt);
        bf.close();
    }
}
