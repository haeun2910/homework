package javaHomework22;

import java.util.Scanner;

public class Qe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        // A가 B의 배수인지?
        boolean isAB = a % b == 0;
        // A가 B의 배수인지?
        boolean isC = a % c == 0;
        // A가 B와 C의 공배수인지?
        // => B의 배수이면서 C의 배수인지?
        boolean isCommonMutiple = isAB && isC;
        System.out.println(isCommonMutiple);

//        System.out.println(a % b == 0 && a%c == 0);
    }
}
