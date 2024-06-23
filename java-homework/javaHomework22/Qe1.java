package javaHomework22;

import java.util.Scanner;

public class Qe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a % b == 0 && a%c == 0);
    }
}
