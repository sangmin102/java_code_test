package exam11.src;// 배열이 가지는 모든 요소의 합 구하기(기본 for문)
import java.util.Scanner;

public class Test03 {
    //--- 배열 a의 모든 요소의 합을 구한다. ---//
    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        return sum;
    }

    /* static int sumOf(int[] a) {
        int sum = 0;
        // 확장 for문
        for (int i : a)
            sum +=1;
        return sum;
    } */

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소 수:");
        int num = stdIn.nextInt();
        int[] x = new int[num];      // num개의 요소를 가지는 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]:");
            x[i] = stdIn.nextInt();
        }

        System.out.println("모든 요소의 합은 " + sumOf(x) + "입니다.");
    }
}
