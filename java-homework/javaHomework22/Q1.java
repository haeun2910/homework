package javaHomework22;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scores1 = scanner.nextInt();
        int scores2 = scanner.nextInt();
        int scores3 = scanner.nextInt();
        int sum = scores1 + scores2 + scores3;
        double average = (double) sum / 3;
        System.out.println("Average score: " + average);
    }
}
