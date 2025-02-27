package exam08.src;// 배열의 나열 순서 섞기
import java.util.Random;
import java.util.Scanner;


public class Test08 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소 수:");
        int n = stdIn.nextInt();         // 요소 수 읽기
        int[] a = new int[n];            // 배열 생성

        for (int i = 0; i < n; i++){
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextInt();
        }

        for (int i = 0; i < 2 * n; i++) {
            int idx1 = rand.nextInt(n);
            int idx2 = rand.nextInt(n);
            int t = a[idx1];
            a[idx1] = a[idx2];
            a[idx2] = t;
        }

        System.out.println("요소를 섞었습니다.");
        for (int i = 0; i < n; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}
