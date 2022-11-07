package week5;

import java.util.Scanner;

public class 타일링2n2 {

    /*
        점화식

        1 = 1
        2 = 3
        3 = 5
        4 = 11
        5 = 21
     */
    static int isused[] = new int[1001];

    public static int solution(int n){
        if(n == 1) return 1;
        if(n == 2) return 3;
        if(isused[n] != 0) return isused[n];
        // n - 2일때는 2x2, 1x2 타일이 2개이므로 2를 곱해줘야 한다.
        return isused[n] = ( solution(n - 1) + (2 * solution(n - 2)) ) % 10007;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
