package week2;

import java.util.Arrays;
import java.util.Scanner;

public class SevenDwarvesMind {

    public static void PrintDwarves(int[] Dwarves, int[] resultIndex){
        int[] result = new int[7];

        for(int i = 0; i < 7; i++){
            result[i] = Dwarves[resultIndex[i]];
        }
        Arrays.sort(result);
        for(int i = 0; i < 7; i++){
            System.out.println(result[i]);
        }
    }

    public static boolean CheckSum(int sum , int j) {
        if(j == 6 && sum == 100){
            return true;

        }else
            return false;
    }

    public static void FindDwarves(int[] Dwarves){
        int sum;
        int cnt;
        int[] resultIndex = new int[8];


        for(int i = 0; i < Dwarves.length; i++){

            sum = 0;
            cnt = 0;
            for(int j = i; j < Dwarves.length; j++){

                resultIndex[cnt++] = j; //정답이 아닐경우 초기화 안해줘도 됨. 정답이 나오면 덮어씌어짐
                sum += Dwarves[j];

                if(cnt == 7) {
                    if (CheckSum(sum, j)) {
                        System.out.println(sum); //sum 확인하려고 만듬
                        PrintDwarves(Dwarves, resultIndex);
                        return;
                    } else {
                        System.out.println(sum);
                        sum -= Dwarves[j];
                        cnt--;
                    }
                }

            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Dwarves = new int[9];

        for(int i = 0; i < Dwarves.length; i++){
            Dwarves[i] = sc.nextInt();
        }

        FindDwarves(Dwarves);
    }
}
