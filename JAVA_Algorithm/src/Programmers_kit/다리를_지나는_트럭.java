package Programmers_kit;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class ?ã§Î¶¨Î??_Ïß??Çò?äî_?ä∏?ü≠ { // https://school.programmers.co.kr/learn/courses/30/lessons/42583
    public static void main(String args[]){

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};

    }
}

class Solution11 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int tgCnt = 0; // ?ã§Î¶? Ïß??Çú ?ä∏?ü≠ idx

        Queue<int[]> q = new LinkedList<>();
        boolean isRemain = true;

        while(true){

            answer++;

            if(!q.isEmpty()){
                Iterator<int[]> it = q.iterator();
                while(it.hasNext()){
                    if(it.next()[1] == bridge_length){
                        it.remove();
                    }
                }
            }

            int wSum = 0;

            if (isRemain) { //  ?ä∏?ü≠?ù¥ ?†ÑÎ∂? Ï∂úÎ∞ú?ïòÏß? ?ïä??Í≤ΩÏö∞
                if (!q.isEmpty()) { // ?òÑ?û¨ ?ã§Î¶¨ÏúÑ?óê ?ûà?äî Í≤ΩÏö∞
                    for (int[] info : q) {
                        wSum += info[0];
                    }
                    if (wSum <= weight) {
                        if (tgCnt == truck_weights.length) { // Î™®Îëê Ï∂úÎ∞ú ?ñà?ùÑ?ãú
                            isRemain = false;
                        } else {
                            wSum += truck_weights[tgCnt];
                        }
                        if (wSum <= weight && isRemain) {
                            q.add(new int[]{truck_weights[tgCnt], 0});
                            tgCnt++;
                        }
                    }
                } else { // ?ã§Î¶¨ÏúÑ?óê ?ä∏?ü≠?ù¥ ?óÜ?äî Í≤ΩÏö∞
                    q.add(new int[]{truck_weights[tgCnt], 0});
                    tgCnt++;
                }
            }

            if(!q.isEmpty()) { // ?ã§Î¶? ?úÑ?óê ?ûà?äî Í≤ΩÏö∞ ?ãúÍ∞? Ï¶ùÍ?
                for(int[] info : q){
                    info[1] += 1; // ?ã§Î¶? ?úÑ ?ä∏?ü≠?ì§ ?ãúÍ∞? Ï¶ùÍ?
                }
            }

            if(tgCnt == truck_weights.length && q.isEmpty()){
                break;
            }
        }
        return answer;
    }
}

