package week1;

import java.util.Scanner;

public class FindPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();

        int cnt = 0;

        for (int i = 0; i < length; i++) {

            int num = sc.nextInt();

            for (int j = 2; j <= num; j++) {
                if(num == j){
                    cnt++;
                }
                if(num % j == 0){
                    break;
                }

            }
        }

        System.out.println(cnt);
    }
}

