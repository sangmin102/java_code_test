package exam02;// 3개의 정숫값을 오름차순으로 정렬
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수 a:"); int a = stdIn.nextInt();
        System.out.println("정수 b:"); int b = stdIn.nextInt();
        System.out.println("정수 c:"); int c = stdIn.nextInt();

        if (a > b) {     // a가 b보다 크면 a와 b를 교환
            int t = a;
            a = b;
            b = t;
        }

        if (b > c) {     // b가 c보다 크면 b와 c를 교환
            int t = b;
            b = c;
            c = t;
        }


        System.out.println("a<= b <= c가 되도록 정렬했습니다.");
        System.out.println("변수 a는 " + a + "입니다.");
        System.out.println("변수 b는 " + b + "입니다.");
        System.out.println("변수 c는 " + c + "입니다.");
    }
}
