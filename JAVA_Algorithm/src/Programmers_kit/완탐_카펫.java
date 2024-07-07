package Programmers_kit;

import java.util.*;

public class øœ≈Ω_ƒ´∆Í { // https://school.programmers.co.kr/learn/courses/30/lessons/42839
    public static void main(String args[]){

        int brown = 10;  // 8  // 24
        int yellow = 2;  // 1  // 24
        // answer [4, 3] [3,3] [8,6]  Í∞?Î°?, ?Ñ∏Î°?

    }
}

class Solution18 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        /*
        int sum = brown + yellow;

        for(int i = 1; i < sum + 1; i++){

            int col = sum / i;

            if(col < i) continue;

            if((col - 2) * (i - 2) == yellow){
                answer[0] = col;
                answer[1] = i;
                break;
            }
        }       
        */
        
        int sum = brown + yellow;
        
        for(int sero = 1; sero < sum + 1; sero ++) {
        	
        	int garo = sum / sero; // ¿¸√º ∞≥ºˆ ≥™¥©±‚ ºº∑Œ «œ∏È -> ∞°∑Œ
        	
        	if(garo < sero) // ∞°∑Œ >= ºº∑Œ
        		continue;
        	
        	if((garo-2) * (sero-2) == yellow) {
                answer[0] = garo;
                answer[1] = sero;
                break;
        	}
        }

        return answer;
    }
}
        /*
  int[] answer = new int[2];
        List<Integer[]> list = new ArrayList<>(); // x, y

        int sum = brown + yellow;
        
//        for(int i = 1; i < sum + 1; i++){ // i ¥¬ ºº∑Œ
//
//            int col = sum / i; // col ∞°∑Œ
//
//            if(col < i) continue;
//
//            if((col - 2) * (i - 2) == yellow){
//                answer[0] = col;
//                answer[1] = i;
//                break;
//            }
//        }
        
        
        int i = 1;
         // æ‡ºˆ∑Œ «™¥¬ πÊπ˝ [18, 6] ¿Œ ∞ÊøÏ 6,4 X -> 8, 3 ¿ÃæÓæﬂ«‘
        while(true){
            if(i > sum / 2) // π›¿˝ ¿ÃªÛ
                break;

            if(sum % i == 0){
                if((i-2) * (sum / i - 2) == yellow){
                    list.add(new Integer[]{i, sum / i, i + sum / i});    
                }
                
            }
            i++;
        }

        Collections.sort(list, new Comparator<Integer[]>(){
            @Override
            public int compare(Integer[] a, Integer[] b){
                return a[2] - b[2]; // 3π¯§ä ø¯º“∏¶ ±‚¡ÿ¿∏∑Œ ø¿∏ß¬˜º¯ ¡§∑ƒ
            }
        });

        int max, min;

        max = Math.max(list.get(0)[0], list.get(0)[1]); // ∞°¿Â ¿€¿∫∞≈ √‚∑¬
        min = Math.min(list.get(0)[0], list.get(0)[1]); // ∞°¿Â ¿€¿∫∞≈ √‚∑¬

        answer[0] = max;
        answer[1] = min;

        
        return answer;
    }
}
         */

        /* // ?ïΩ?àòÎ°? ?ë∏?äî Î∞©Î≤ï [18, 6] ?ù∏ Í≤ΩÏö∞ 6,4 X -> 8, 3 ?ù¥?ñ¥?ïº?ï®
        while(true){
            if( i > sum / 2) // Î∞òÏ†à ?ù¥?ÉÅ
                break;

            if(sum % i == 0){
                if((i-2) * (sum / i - 2) == yellow){ // Í∞úÏàò?ôï?ù∏
                    list.add(new Integer[]{i, sum / i, i + sum / i});
                }
            }
            i++;
        }

        Collections.sort(list, new Comparator<Integer[]>(){
            @Override
            public int compare(Integer[] a, Integer[] b){
                return a[2] - b[2]; // 3Î≤àÏ?? ?õê?ÜåÎ•? Í∏∞Ï??úºÎ°? ?ò§Î¶ÑÏ∞®?àú ?†ï?†¨
            }
        });

        int max, min;

        max = Math.max(list.get(0)[0], list.get(0)[1]); // Í∞??û• ?ûë??Í±? Ï∂úÎ†•
        min = Math.min(list.get(0)[0], list.get(0)[1]); // Í∞??û• ?ûë??Í±? Ï∂úÎ†•

        answer[0] = max;
        answer[1] = min;

        */
