package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 다음순열 {
   static int[] arr;
   static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        arr = new int[N];

        //순열 및 조합을 생성할 때 재귀적으로 구현하지 않고 각 인덱스 값을 비교하여 모든 경우의 인덱스 값을 뽑아내는 방법

        //StringTokenizer 클래스는 문자열을 우리가 지정한 구분자로 문자열을 쪼개ㅑㅑ주는 클래스
        //bufferedReader로 입력받으면 line으로밖에 못받기 때문에 문자열로 쪼개야 한다.
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());//.nextToken으로 확인할 수 있다.
        }
        
        if(next_Permutation(arr)){
            for(int val : arr){
                stringBuilder.append(val).append(" ");
            }
        }else {
            stringBuilder.append("-1");
        }
        System.out.println(stringBuilder);
    }

    private static boolean next_Permutation(int[] arr) {
        int i = arr.length-1; // 배열 뒤에서부터 찾는다.

        //1. A[i-1] < A[i] 를 만족하는 가장 큰 i를 찾는다.
        while(i > 0 && arr[i-1] >= arr[i]) {
            i -= 1;
        }

        //i의 위치가 0이면 내림차순(마지막 순열)
        if(i<=0) return false;

        int j = arr.length - 1;

        //2. j >= i 이면서 A[j] > A[i-1] 을 만족하는 가장 큰 j를 찾는다.
        while(arr[i-1] >= arr[j]) {
            j -= 1;
        }

        //3. A[i-1]과 A[j] 를 swap 한다.
        int temp = arr[j];
        arr[j] = arr[i-1];
        arr[i-1] = temp;

        j = arr.length-1;


        //4. A[i] 부터 순열을 뒤집는다.
        while(i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i += 1;
            j -= 1;
        }

        return true;
    }
}
