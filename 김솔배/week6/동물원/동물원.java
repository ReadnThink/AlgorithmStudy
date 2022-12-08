package week6.동물원;

import java.util.Scanner;

public class 동물원 {
   /*
   *     어떤 동물원에 가로로 두칸 세로로 N칸인 아래와 같은 우리가 있다.
   *     이 동물원에는 사자들이 살고 있는데 사자들을 우리에 가둘 때,
   *     가로로도 세로로도 붙어 있게 배치할 수는 없다.
   *     이 동물원 조련사는 사자들의 배치 문제 때문에 골머리를 앓고 있다.
   *     동물원 조련사의 머리가 아프지 않도록 우리가 2*N 배열에
   *     사자를 배치하는 경우의 수가 몇 가지인지를 알아내는 프로그램을 작성해 주도록 하자.
   *     사자를 한 마리도 배치하지 않는 경우도 하나의 경우의 수로 친다고 가정한다.
   * */

    static boolean[][] isUsed;
    static int cnt;

    public void reset(int n){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                isUsed[i][j] = false;
            }
        }
    }

    public boolean check(int i, int j) {
        if (i == 0) {
            if(j > 0 && isUsed[0][j + 1] == false && isUsed[0][j - 1] == false
                    && isUsed[1][j] == false) return true;
            else if(j == 0 && isUsed[0][j + 1] == false && isUsed[1][j] == false) return true;
            else return false;
        } else {
            if(j > 0 && isUsed[1][j + 1] == false && isUsed[1][j - 1] == false
                    && isUsed[0][j] == false) return true;
            else if(j == 0 && isUsed[1][j + 1] == false && isUsed[0][j] == false) return true;
            else return false;
        }
    }

    public void printBoolean(int n){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(isUsed[i][j] + ", ");
            }
            System.out.println();
        }
    }
    public void solution(int n, int k){
        int limit = n * 2;
        System.out.printf("limit = %d    k = %d\n",limit,k);
        if(k == limit) {
            System.out.println(cnt);
            return ;
        }

        for (int i = 0; i < 2; i++){

            for (int j = k; j < n; j++) {
                isUsed[i][j] = true;
                if (check(i, j)) {
                    cnt++;
                } else {
                    isUsed[i][j] = false;
                }
            }
        }
        printBoolean(n);
        System.out.println("cnt = "+cnt % 9001);
        reset(n);
        solution(n,k + 1);

    }
    public static void main(String[] args) {
        동물원 z = new 동물원();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isUsed = new boolean[2][n + 2]; //2 X n 배열
        z.solution(n, 0);
    }
}
