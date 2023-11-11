import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ScannerIn {
    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요 : ");
        int input = sc.nextInt();
        System.out.println("입력한 숫자는 : " + input);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // throws IOException {
        String a = st.nextToken();
        String b = st.nextToken();

    }
}
