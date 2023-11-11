package Programmers;

import java.util.HashMap;
import java.util.Map;

public class 의상 { public static void main(String args[]){ // https://school.programmers.co.kr/learn/courses/30/lessons/42578
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
    }
}


class Solution8 {
    public int solution(String[][] clothes) {
        int answer = 0;
        // 부위가 한개인 경우에는
        // 옷 전부 안입은 경우 제외
        // *= 부위당 항목갯수 +1 에서 전부안입은 경우 최종 -1

        Map<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 1) +1);
        }

        answer = 1;

        if(map.size() == 1) return map.get(clothes[0][1]);

        for(int cnt : map.values()){
            answer *= cnt +1;
        }

        answer -= 1;

        return answer;
    }
}