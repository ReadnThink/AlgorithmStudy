package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class consecutiveNumber {
    public static void main(String[] args) throws IOException {
        // 1. N을 받는다.
        // 2. 1부터 N까지 루프를 돌면서 스트링으로 더해준다.
        // 3. 스트링길이를 출력


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());

        //str.add(Integer.toString(i));
        for(int i = 1; i <= N; i++){
            sb.append(Integer.parseInt(String.valueOf(i)));
        }
        System.out.println(sb.length());
    }
}
