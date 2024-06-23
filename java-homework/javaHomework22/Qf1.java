package javaHomework22;

import java.util.Scanner;

// 한개의 정수 A를 입력받아, A^2, A^4, A^8의 1의 자리를 순서대로 한줄씩 출력하시오.
public class Qf1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int a2 = a*a;
        int a4 = a*a*a*a;
        int a8 = a*a*a*a*a*a*a*a;
        System.out.println(a2 % 10);
        System.out.println(a4 % 10);
        System.out.println(a8 % 10);
    }
}
