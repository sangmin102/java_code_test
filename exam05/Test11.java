package exam05;

<<<<<<< HEAD
// 읽은 정숫값들은 합산(1,000이 넘지 않은 범위에서 합산)
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 더합니다.");
        System.out.print("몇 개를 더할까요?:");
        int n = stdIn.nextInt();  //정수의 개수

        int sum = 0; //합계
        int i;
        for (i = 0; i < n; i++) {
            System.out.print("정수:");
            int t = stdIn.nextInt();
            if (sum + t > 1000) {
                System.out.println("합계가 1,000을 넘었습니다.");
                System.out.println("마지막 값은 무시합니다.");
                break;
            }
            sum += t;
        }
        System.out.println("합계는 " + sum + "입니다.");
        if (i != 0)
            System.out.println("평균은 " + sum / i + "입니다.");
    }
}
=======
// 읽은 정숫값들은 합산(1,000이 넘지 않은 범위에서 합산)
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 더합니다.");
        System.out.print("몇 개를 더할까요?:");
        int n = stdIn.nextInt();  //정수의 개수

        int sum = 0; //합계
        int i;
        for (i = 0; i < n; i++) {
            System.out.print("정수:");
            int t = stdIn.nextInt();
            if (sum + t > 1000) {
                System.out.println("합계가 1,000을 넘었습니다.");
                System.out.println("마지막 값은 무시합니다.");
                break;
            }
            sum += t;
        }
        System.out.println("합계는 " + sum + "입니다.");
        if (i != 0)
            System.out.println("평균은 " + sum / i + "입니다.");
    }
}
>>>>>>> 011ade6a75d62de0c1dbdd640f4a2e97a78227b2
