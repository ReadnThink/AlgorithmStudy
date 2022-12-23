package week12.연산자끼워넣기;

import java.util.Scanner;

public class Main {

    static int[] arr;
    static int[] skills = new int[4];
    static int Max = -100000000;
    static int Min = 100000000;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            skills[i] = sc.nextInt();
        }

        Main m = new Main();
        m.solution(arr[0], 0);
        System.out.println(Max);
        System.out.println(Min);
    }

    private void solution(int sum, int depth) {
        // 종료조건
        if (n - 1 == depth){
//            System.out.println(sum);
            if(Min > sum) {
                Min = sum;
            }

            if(Max < sum){
                Max = sum;
            }
            return;
        }

        for (int i = 0; i < skills.length; i++) {
            if (skills[i] != 0) {
                skills[i]--;
                if (i == 0) {
                    solution(sum + arr[depth + 1], depth + 1);
                } else if (i == 1) {
                    solution(sum - arr[depth + 1], depth + 1);
                } else if (i == 2) {
                    solution(sum * arr[depth + 1], depth + 1);
                } else if (i == 3) {
                    solution(sum / arr[depth + 1], depth + 1);
                }
                skills[i]++;
            }
        }
    }
}
