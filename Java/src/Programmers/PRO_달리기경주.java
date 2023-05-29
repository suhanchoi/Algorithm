package Programmers;

// 04.25 화
// 프로그래머스 안에서 함수 선언 확인 필요
public class PRO_달리기경주 { // https://school.programmers.co.kr/learn/courses/30/lessons/178871?language=java
    public static void main(String[] args) {

        // String[] answer = Solution.solution({"mumu", "soe", "poe", "kai", "mine"}, {"kai", "kai", "mine", "mine"});
        // 문자열 배열 선언 확인 필요
    }

}

class Solution { // 시간 초과 해결필요
    public static String[] solution(String[] players, String[] callings) {
        String[] answer = {};

        for(int i = 0; i < callings.length; i++){ // calling 길이만큼 반복
            for(int j = 0; j < players.length; j++) { // player 길이만큼 반복

                if(players[j].equals(callings[i])){ // 문자열 비교
                    String temp = players[j]; // switch java 함수 확인 필요
                    players[j] = players[j-1];
                    players[j-1] = temp;
                    break;
                }
            }
        }

        answer = players;

        return answer;
    }
}