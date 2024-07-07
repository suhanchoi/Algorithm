package Programmers_kit;

import java.util.*;

public class 동적계획법_N으로표현 { // https://school.programmers.co.kr/learn/courses/30/lessons/42895
    public static void main(String args[]){

		int N = 5;
		int number = 12;
		// return 4

		/*
		괄호와 사칙연산 가능, 나누기 연산에서 나머지 무시
		최소값이 8보다 크면 -1

		12 = 5 + 5 + (5 / 5) + (5 / 5)
		12 = 55 / 5 + 5 / 5
		12 = (55 + 5) / 5 -> 4번이 최소
		 */

        System.out.println(N으로표현.solution(N, number));
    }
}

class N으로표현 {
	public static int solution(int N, int number) {
		int answer = 0;
		//부분의 합이 전체의 합이 되도록 값 반환

		return answer;
	}
}