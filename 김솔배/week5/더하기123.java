package week5;

import java.util.Arrays;
import java.util.Scanner;

public class 더하기123 {
    /*
    정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.

    1+1+1+1
    1+1+2
    1+2+1
    2+1+1
    2+2
    1+3
    3+1
    정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
     */

    static int[] result = new int[11];
    static int[][] isused = new int[10000][10000];
    static int sum = 0;
    static int cnt = 0;
    static int j = 0;
    public static int f(int k, int n){

        if(k == n){
           for (int j = 0; j < n; j++){
               sum += result[j];
               if(n == sum){
                   cnt++;
                   int[] a = Arrays.copyOfRange(result,0,j+1);
                   isused[j++] = a;
                   System.out.println("sum" + sum);
                   System.out.println("result"+Arrays.toString(result));
                   break;
               }
           }
           sum = 0;
        } else {
            for (int i = 1; i <= n; i++) {
                result[k] = i;
                f(k+1,n);
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
            System.out.println(f(0, nums[i]));
        }
    }
}
