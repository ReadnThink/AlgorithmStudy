package week2;

import java.util.Arrays;
import java.util.Scanner;

public class SevenDwarves {

    // 전부더해서 2개 뺀다.
    // 100이면 정답
    private int arrSum(int[] arr) {
        int result = 0;

        for(int i = 0; i < arr.length; i++){
            result += arr[i];
        }

        return result;
    }

    private void check(int[] arr, int result){
        for(int i = 0; i < arr.length; i++){
            int sum = result;
            for(int j = i + 1; j < arr.length; j++){
//                sum -= arr[i];
//                sum -= arr[j];
                if(sum - arr[i] - arr[j] == 100){
                    printResult(arr, i, j); // 난쟁이들 찾으면 출력
                }
//                else {
//                    sum += arr[i];
//                    sum += arr[j];
//                }
            }
        }
    }

    private void printResult(int[] arr, int i , int j){

        for(int a = 0; a < arr.length; a++){
            if((a == i) || (a == j))
                continue;;
            System.out.println(arr[a]);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SevenDwarves sevenDwarves = new SevenDwarves();
        int[] arr = new int[9];

        for (int i = 0 ; i < 9; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int result = sevenDwarves.arrSum(arr);
        sevenDwarves.check(arr, result);

    }


}
