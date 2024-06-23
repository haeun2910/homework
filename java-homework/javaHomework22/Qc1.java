package javaHomework22;

import java.util.Scanner;

// 어떤 야구단의 승, 무승부, 패가 입력된다.
// 이 야구단의 승률 (승 / (승 + 패))를, 소숫점 세번째 자리 까지, 아래의 예시와 같이 출력하여라.
public class Qc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("야구단의 승 결과 입력: ");
        int a = scanner.nextInt();
        System.out.println("야구단의 무승부 결과 입력: ");
        int b = scanner.nextInt();
        System.out.println("야구단의 패 결과 입력: ");
        int c = scanner.nextInt();
        double odd =(double) a/(a + c);
        System.out.println(String.format("%d 승,%d 무, %d 패,승률: %.3f", a, b, c, odd));

    }
}
