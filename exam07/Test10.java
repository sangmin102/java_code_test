package exam07;

//배열의 각 요소를 5, 4, 3, 2, 1로 초기화해서 표시
public class Test10 {
    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};   //배열 선언

        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}
