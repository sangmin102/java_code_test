package exam10.src;// 2의 거듭 제곱과 시프트 연산의 일치성 확인
import java.util.Scanner;

public class Test09 {
    //--- 2의 거듭 제곱 반환 ---//
    static int pow2(int no) {
        int pw = 1;
        while (no-- > 0)
            pw *= 2;
        return pw;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수x를 n비트 시프트합니다.");
        System.out.print("x:"); int x = stdIn.nextInt();
        System.out.print("n:"); int n = stdIn.nextInt();

        int mPower = x * pow2(n);        // 2의 n승을 곱한 값
        int dPower = x / pow2(n);        // 2의 n승으로 나눈 값
        int lShift = x << n;             // n비트 왼쪽으로 시프트한 값
        int rShift = x >> n;             // n비트 오른쪽으로 시프트한 값

        System.out.printf("[a] x * (2의 %d승) = %d\n", n, mPower);
        System.out.printf("[b] x / (2의 %d승) = %d\n", n, dPower);
        System.out.printf("[c] x << %d = %d\n", n, lShift);
        System.out.printf("[d] x >> %d = %d\n", n, rShift);

        System.out.println("[a]와 [c]의 값이 일치" +
                ((mPower == lShift) ? "합니다." : "하지 않습니다."));
        System.out.println("[b]와 [d]의 값이 일치" +
                ((dPower == rShift) ? "합니다." : "하지 않습니다."));
    }
}
