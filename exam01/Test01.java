package exam01;// 읽은 정숫값이 음의 값인가?
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정숫값:");
        int n = stdIn.nextInt();
    // if-then문 : if (조건식) 실행문
    if (n < 0)
        // n < 0이 true(참)일 때 실행한다.
        System.out.println("이 값은 음의 값입니다.");}
}
