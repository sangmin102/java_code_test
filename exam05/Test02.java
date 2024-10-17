package exam05;

<<<<<<< HEAD
// 정숫값의 제곱 표시(방법2)
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("정숫값:");
        int n = stdIn.nextInt();
        for (int i = 1, j = 1; i <= n; i++, j = i * i)
            System.out.println(i + "의 제곱은 " + j + "입니다.");
    }
}
=======
// 정숫값의 제곱 표시(방법2)
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("정숫값:");
        int n = stdIn.nextInt();
        for (int i = 1, j = 1; i <= n; i++, j = i * i)
            System.out.println(i + "의 제곱은 " + j + "입니다.");
    }
}
>>>>>>> 011ade6a75d62de0c1dbdd640f4a2e97a78227b2
