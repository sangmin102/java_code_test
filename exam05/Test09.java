package exam05;

<<<<<<< HEAD
// 소수 판정
import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            System.out.println("2이상의 정숫값:");
            n = stdIn.nextInt();
        }while (n < 2);

        int i;
        for (i = 2; i < n; i++)
            if (n % i == 0)                // 나누어 떨어진다(소수가 아니다)
                break;

        if (i == n)
            System.out.println("소수입니다.");
        else
            System.out.println("소수가 아닙니다.");
    }
}
=======
// 소수 판정
import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            System.out.println("2이상의 정숫값:");
            n = stdIn.nextInt();
        }while (n < 2);

        int i;
        for (i = 2; i < n; i++)
            if (n % i == 0)                // 나누어 떨어진다(소수가 아니다)
                break;

        if (i == n)
            System.out.println("소수입니다.");
        else
            System.out.println("소수가 아닙니다.");
    }
}
>>>>>>> 011ade6a75d62de0c1dbdd640f4a2e97a78227b2
