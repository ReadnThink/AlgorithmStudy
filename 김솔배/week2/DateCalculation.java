package week2;

import java.util.Scanner;

public class DateCalculation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();

        int a = 0; //e
        int b = 0; // s
        int c = 0; // m
        int cnt = 0;

        // 나눈 나머지가 동일하면 된다.
        // 나눈 나머지가 0이되면 + 1을 해준다.
        while(true){
            a++;
            b++;
            c++;
            a = a % 16;
            if(a == 0)
                a++;
            b = b % 29;
            if(b == 0)
                b++;
            c = c % 20;
            if(c == 0)
                c++;

            cnt++;

            if(a == E && b == S && c == M){
                System.out.println(cnt);
                break;
            }
        }
    }
}
