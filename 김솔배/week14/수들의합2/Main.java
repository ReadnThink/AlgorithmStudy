package week14.수들의합2;

public class Main {
    static int m;
    static int n;
    static int result;
    static int[] arr;
    static boolean[] isUsed;

    public static void main(String[] args) {
        n = 4;
        m = 2;
        arr = new int[]{1, 1, 1, 1};
        isUsed = new boolean[n];

        dfs(0, 0);
        System.out.println(result);
    }

    private static void dfs(int depth, int sum) {
        if (depth == n) {
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if(isUsed[i] == true) cnt += arr[i];
            }
            if (sum == m) result++;
            return;
        }else {
            for (int i = 0; i < n; i++) {
                if (!isUsed[i]) {
                    isUsed[i] = true;
                    dfs(depth + 1, sum + arr[i]);
                    isUsed[i] = false;
                }
            }
        }

    }
}
