package Programmers_kit;

public class JadenCase_문자열만들기 { // https://school.programmers.co.kr/learn/courses/30/lessons/12951
    public static void main(String args[]){

        String s = 	"3people unFollowed me";
        // A

    }
}


class Solution5 {
    public String solution(String s) {
        String answer = "";
        /*
        StringBuilder sb = new StringBuilder();

        String[] input = s.split(" ");

        for(int i = 0; i < input.length; i++){
            if(i != 0){
                sb.append(" "); // 怨듬갚異붽�
            }

            String str = input[i];

            if(Character.isDigit(input[i].charAt(0))) { // 泥ル쾲吏� 湲��옄媛� �닽�옄�씤吏� �뙋蹂�
                sb.append(str.toLowerCase());
            } else {
                sb.append(str.substring(0,1).toUpperCase());
                sb.append(str.substring(1,str.length()).toLowerCase());
            }
        }
        answer = sb.toString();
        */
        boolean flag = true; // 怨듬갚�씠�썑 泥ル쾲吏� �떒�뼱�씤吏� �뙋蹂�

        String[] input = s.split(""); // 怨듬갚�쓣 �궘�젣�븯硫� �븞�릺誘�濡�

        for(String str : input) {
            answer += flag ? str.toUpperCase() : str.toLowerCase();
            flag = " ".equals(str) ? true : false; // 怨듬갚�씠�씪硫� �떎�쓬 臾몄옄�뒗 ��臾몄옄�솕
        }



        return answer;
    }
}
