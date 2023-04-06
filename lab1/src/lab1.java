import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int c = 9;
        double res = 0;

        System.out.print("Input a: ");
        double a = scanner.nextDouble();
        System.out.print("Input b: ");
        double b = scanner.nextDouble();
        System.out.print("Input n: ");
        int n = scanner.nextInt();
        System.out.print("Input m: ");
        int m = scanner.nextInt();


        if (a > n || b > m) {
            System.out.println("неможлива сума");
            return;
        }
        for (double i = a; i <= n; i++) {
            if (i == c) {
                System.out.println("Ділення на ноль");
                return;
            }
            for (double j = b; j <= m; j++) {
                res += (i % j) / (i - c);
            }
        }
        System.out.println("Результат: " + res);

    }
}