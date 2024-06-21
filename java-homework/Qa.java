import java.util.Scanner;

public class Qa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

//        System.out.print(a);
//        System.out.println(b);

//        System.out.println(a + b);

        System.out.println(String.format("%s%s",a, b)); // 선호

    }
}
