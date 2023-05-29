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

        // 자르기
        str.split(" ");
        str.substring(1,3);
        str.charAt(2); // char형 반환

        String[] strArray = str.split(" ");

        str = str.toUpperCase();
        str = str.toLowerCase();

        // 변경 불가능해서 substring 으로 잘라서 사용해야함

        str.tirm(); //빈칸제거

        str.valueOf(3); // i를 문자열로 변환 int -> String

        StringBuilder sb = new StringBuilder();
        sb.append("11");
        sb.toString();
        sb.reverse().toString();





        



    }


}
