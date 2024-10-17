package exam01;

import java.util.Scanner;

public class Testk {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.print("점수: ");

        int point = stdIn.nextInt();
        int grid = point/10;

        switch (grid) {
            case 10: // 100점인 경우
            case 9:
                System.out.println("수");
                break;
            case 8:
                System.out.println("우");
                break;
            case 7:
                System.out.println("미");
                break;
            case 6:
                System.out.println("양");
                break;
            default:
                System.out.println("가");
        }
    }
}
