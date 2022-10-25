package week3;

import java.util.Arrays;
import java.util.Scanner;

public class 모든순열 {

    public static int N;
    public static int[] arr;
    public static boolean[] isused = new boolean[10];

    public static void solution(int k){
        if(k == N){
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }else{
            for (int i = 1; i <= N; i++) {
                if(!isused[i]){
                    isused[i] = true;
                    arr[k] = i;
                    solution(k+1);
                    isused[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        solution(0);
    }
}
