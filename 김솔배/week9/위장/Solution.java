package week9.위장;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;

public class Solution {
    public static int solution(String[][] clothes) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < clothes.length; i++) {
            //각 카테고리의 경우의 수를 구한다.
            //아무것도 선택하지 않은 경우를 포함하기 때문에 defaultValue를 1로 함.
            hashtable.put(clothes[i][1], hashtable.getOrDefault(clothes[i][1],1) + 1);
        }
//        System.out.println(hashtable);
        Iterator<Integer> it = hashtable.values().iterator();
        int answer = 1;
        while (it.hasNext()) {
            answer *= it.next().intValue(); //경우의 수가 정해져있는 각 카테고리를 곱하면 모든 경우의 수를 찾을 수있다.
        }
        return answer -1; //아무것도 입지 않은 경우 -1 뺴기
    }

    public static void main(String[] args) {
        String[][] clothes = new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.println(solution(clothes));
    }
}
