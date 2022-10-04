package Math;

import java.util.Arrays;
import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Numbers = sc.nextInt();
        int[] arr = new int[Numbers];

        for(int i = 0; i < Numbers; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if (Numbers == 1){
            System.out.println(arr[0] * arr[0]);
        }else {
            System.out.println(arr[0] * arr[Numbers - 1]);
        }
    }
}
