package javaHomework22;
// 한줄에 정수가 공백문자로 구분되어 5개가 입력된다.
// 첫번째 입력된 숫자에, 이후에 순서대로 입력된 숫자들을 순서데로 더하고, 빼고, 곱하고, 나눈 몫을 출력하여라.
import java.util.Scanner;

public class Qa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int d = scanner.nextInt();
//        int e = scanner.nextInt();
//        int tinhToan = (a+b-c)*d/e;
//        System.out.println(tinhToan);

        int base = scanner.nextInt();
        base += scanner.nextInt();
        base -= scanner.nextInt();
        base *= scanner.nextInt();
        base /= scanner.nextInt();
        System.out.println(base);

    }
}
