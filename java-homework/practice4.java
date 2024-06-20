import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[3];
        double[] scores = new double[3];

        names[0] = scanner.nextLine();
        names[1] = scanner.nextLine();
        names[2] = scanner.nextLine();

        scores[0] = scanner.nextDouble();
        scores[1] = scanner.nextDouble();
        scores[2] = scanner.nextDouble();

        String temp = "name - %s, grade - %.1f";
        System.out.println(String.format(temp,names[0], scores[0]));
        System.out.println(String.format(temp,names[1], scores[1]));
        System.out.println(String.format(temp,names[2], scores[2]));

    }
}
