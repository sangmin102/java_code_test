package exam05;

// 왼쪽 아래가 직각인 이등변 삼각형
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        System.out.println("단수는? :");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
