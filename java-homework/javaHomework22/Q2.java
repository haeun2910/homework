package javaHomework22;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int thuong = A / B;
        int du = A % B;
        System.out.println("A = " + thuong + " * B + " + du);
    }
}
