package week5;

import java.util.Arrays;

public class 피보나치 {
    // DP는 한번 계산한 것을 다시 계산하지 않는 방법이다.
    //재귀에 들어가면서 2갈래로 나누어 진다.
    //즉 한번 돌때마다 2n이 추가된다? + 중복호출이 된다.(한쪽은 -1씩, 한쪽은 -2씩 재귀를 호출하기 때문에)
    //시간복잡도가 매우 높다...
    static int[] isused = new int[100]; //이미 구한 수를 저장할 배열
    // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...
    // f(n) = f(n-1) + f(n-2) = 작은 문제들을 합쳐 큰 문제를 만들어 낸다.
    // f(1) = f(2) = 1
    public static int f(int x){
        if(x == 1 || x == 2) return 1;
        if(isused[x] != 0) return isused[x];
        return isused[x] = f(x -1) + f(x - 2);
//        return f(x-1) + f(x-2);
    }

    public static void main(String[] args) {
        System.out.printf("%d", f(10));
    }
}
