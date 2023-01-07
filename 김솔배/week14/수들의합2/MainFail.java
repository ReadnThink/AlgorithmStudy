package week14.수들의합2;

public class MainFail {
    static int m;
    static int n;
    static int result;
    static int[] arr;

    public static void main(String[] args) {
        n = 4;
        m = 2;
        arr = new int[]{1, 1, 1, 1};
        dfs(0, 0);
        System.out.println(result);
    }

    private static void dfs(int depth, int sum) {
        if (depth == n) {
            if (sum == m) result++;
            return;
        }
        dfs(depth + 1, sum + arr[depth]);
        dfs(depth + 1, sum);
    }
}
