package exam05;

// 읽은 정수를 합산(음수는 제외)
import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("정수를 더합니다.");
        System.out.print("몇 개를 더할까요?:");
        int n = stdIn.nextInt();  // 정수의 개수
        int sum = 0; // 합계
        int count = 0;  // 합산된 정수의 개수
        int i;

        for (i = 0; i < n; i++) {
            System.out.print("정수: ");
            int t = stdIn.nextInt();
            if (t < 0) {
                System.out.println("음수를 더하지 않습니다.");
                continue; // 음수일 경우 다음 반복으로 넘어감
            }
            sum += t; // 합계에 정수 추가
            count++; // 합산된 정수 개수 증가
        }

        System.out.println("합계는 " + sum + "입니다.");
        if (count != 0) // 합산된 정수가 있을 때만 평균 출력
            System.out.println("평균은 " + (double)sum / count + "입니다."); // 평균 계산 시 형변환
    }
}
