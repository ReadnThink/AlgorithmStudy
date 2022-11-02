package week5;

public class 피보나치 {
    // DP는 한번 계산한 것을 다시 계산하지 않는 방법이다.
    static int[] isused = new int[100]; //이미 구한 수를 저장할 배열
    public static int f(int x){
        if(x == 1) return 1;
        if(x == 2) return 1;
        if(isused[x] != 0) return isused[x];
        return isused[x] = f(x -1) + f(x - 2);
    }

    public static void main(String[] args) {
        System.out.printf("%d", f(30));
    }
}
