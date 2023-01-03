package week13.가르침;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static int sum = 0;
    static Set<Character> set = new HashSet<>();
    static int k;
    public static void dfs(String words) {

        for (int i = 0; i < words.length(); i++) {
            if (!set.contains(words.charAt(i)) && k > 0) {
                set.add(words.charAt(i));
                k--;
            }
        }
        if (checkWords(words)) sum++;
    }

    public static boolean checkWords(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (set.contains(word.charAt(i))) continue;
            else if (!set.contains(word.charAt(i))) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        k = sc.nextInt();
        //nextInt()가 개행문자를 제거하지 않는다....
        //nextLine을 한번 더해주니 에러해결.
        sc.nextLine();
        String[] words = new String[n];
        k -= 5;
        set.add('a');
        set.add('n');
        set.add('t');
        set.add('i');
        set.add('c');

        for (int i = 0; i < n; i++) {
                words[i] = sc.nextLine();
                dfs(words[i]);
        }
        System.out.println(sum);
    }
}
