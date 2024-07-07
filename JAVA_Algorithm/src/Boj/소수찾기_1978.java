package Boj;

import java.util.*;

class �Ҽ�ã��_1978{ // https://www.acmicpc.net/problem/1978
    public static void main(String args[]){
    		
    	// 4
    	// 1 3 5 7
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	
    	int[] ary = new int[n];
    	
    	for(int i = 0; i < n; i++) {
    		ary[i] = sc.nextInt();
    	}
    	
    	// �Է� ���� ��(n)���� �Ҽ� ������ ���
    	
    	// �����佺�׳׽��� ü Ȱ��
    	// �޸������̼� Ȱ��
    	
    	Arrays.sort(ary); // ary ����

    	int[] primeAry = new int[ary[n-1] + 1]; // �Ҽ��� �޸������̼�
    	// ���� �� �ʱⰪ false
    	
    	// �Ҽ����� �迭
    	primeAry[0] = 0; // �Ҽ� ���� 0 false 1 true
    	primeAry[1] = 0; 
    	
    	for(int i = 2; i <= ary[n-1] ; i ++) {
    		if(isPrime(i)){
    			primeAry[i] = 1;
    		}
    	}
    	
    	int result = 0;
    	
    	// �Է¹��� ���� �߿��� �Ҽ��� ����� �Ǻ�
    	for(int i : ary) {
    		if(primeAry[i] == 1) {
    			result++;
    		}
    	}
    	
    	System.out.println(result);
    }
	    
    public static boolean isPrime(int num) { // �Ҽ� �Ǻ� �Լ�
    	
    	int lim = (int)Math.sqrt(num); // �ִ� ���� Ȯ�� 
    	
    	for(int i = 2; i <= lim; i++) {
			if(num % i == 0) {
				return false;
			}
		}
    	return true;
    }
}


