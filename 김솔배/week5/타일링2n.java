package week5;

import java.util.Scanner;

public class 타일링2n {
    // 2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
    public static int[] isused = new int[1001];
    public static int solution(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(isused[n] != 0) return isused[n];
        return isused[n] = ( solution(n - 1) + solution(n -2) );
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();
        System.out.println(solution(4));
    }
}
