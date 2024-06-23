package javaHomework22;

import java.util.Scanner;

// 현재 시간은 오전 7시이다. 자연수 하나를 입력받아,
// 그 값만큼 시간이 흐른다면 시침이 몇시 위에 있을지를 출력하시오. 단, 12시는 0으로 출력한다.
public class Qb1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = 7;
        System.out.println("자연수 하나를 입력: ");
        int a = scanner.nextInt();
        int b = a % 12;
        int c = (b + time) % 12;
        System.out.println(c);

    }
}
