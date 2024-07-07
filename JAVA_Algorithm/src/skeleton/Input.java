package skeleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Input {
	public static void main(String[] args) throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        st = new StringTokenizer(br.readLine());
        Integer.parseInt(st.nextToken());

        Scanner sc = new Scanner(System.in);
        sc.nextInt();

        String str = "hello world";

    
        str.split(" ");
        str.substring(1,3);
        str.charAt(2); // 

        String[] strArray = str.split(" ");

        str = str.toUpperCase();
        str = str.toLowerCase();

 
        str.tirm(); 

        str.valueOf(3); //  int -> String

        StringBuilder sb = new StringBuilder();
        sb.append("11");
        sb.toString();
        sb.reverse().toString();



	}
}
