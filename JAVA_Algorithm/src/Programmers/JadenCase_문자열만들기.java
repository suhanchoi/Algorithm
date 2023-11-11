package Programmers;

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
                sb.append(" "); // 공백추가
            }

            String str = input[i];

            if(Character.isDigit(input[i].charAt(0))) { // 첫번째 글자가 숫자인지 판별
                sb.append(str.toLowerCase());
            } else {
                sb.append(str.substring(0,1).toUpperCase());
                sb.append(str.substring(1,str.length()).toLowerCase());
            }
        }
        answer = sb.toString();
        */
        boolean flag = true; // 공백이후 첫번째 단어인지 판별

        String[] input = s.split(""); // 공백을 삭제하면 안되므로

        for(String str : input) {
            answer += flag ? str.toUpperCase() : str.toLowerCase();
            flag = " ".equals(str) ? true : false; // 공백이라면 다음 문자는 대문자화
        }



        return answer;
    }
}
