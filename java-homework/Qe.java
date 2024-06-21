import java.util.Scanner;

public class Qe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\"오전\" 또는 \"오후\"를 입력: ");
        String time1 = sc.nextLine();
        int time2 = sc.nextInt();
//        int[] time2 = new int[11];
//        time2[0] = sc.nextInt();
        System.out.println(String.format("%s %d 시", time1, time2));
    }
}
