import java.util.Scanner;

public class ScannerIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요 : ");
        int input = sc.nextInt();
        System.out.println("입력한 숫자는 : " + input);

    }
}
