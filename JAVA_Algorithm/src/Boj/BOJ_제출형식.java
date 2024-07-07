package Boj;

import java.util.*;
import java.io.*;

class BOJ_제출형식{
    public static void main(String args[]) throws IOException{
    	
    	/*
		
    	import java.util.*;
    	import java.io.*;
    	
    	public class Main{
    		public static void main(String args[]){
    		// public static void main(String args[]) throws NumberFormatException, IOException{
    			Scanner sc = new Scanner(System.in);
    			int a, b;
    			a = sc.nextInt();
    			b = sc.nextInt();
    			System.out.println(a + b);
    		}
    	}
    	*/
    	
    	
    	
    	// input
    	
    	//public static void main(String args[]) throws NumberFormatException, IOException{
    	
    	Scanner sc = new Scanner(System.in);
    	sc.nextInt();
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	// split
    	String[] data = br.readLine().split(",");
    	
    	StringTokenizer st1 = new StringTokenizer(br.readLine(), ","); // "," 으로 구분
    	while(st.hasMoreTokens()) {
    		st.nextToken();
    	}
    	
    	
    }
}


