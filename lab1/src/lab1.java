import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int c = 0;
        double res = 0;

        System.out.print("Input a: ");
        int a = scanner.nextInt();
        System.out.print("Input b: ");
        int b = scanner.nextInt();
        System.out.print("Input n: ");
        final int n = scanner.nextInt();
        System.out.print("Input m: ");
        final int m = scanner.nextInt();

        //Перевірка i / 0
        // C == 0

        for (double i = a; i <= n; i++) {
            for (double j = b; j <= m; j++) {
                if (i == c || j == 0) {
                    System.out.println("Ділення на ноль");
                    return;
                }
            }
        }

        for (double i = a; i <= n; i++) {
            for (double j = b; j <= m; j++) {
                res += (i % j) / (i - c);
            }
        }
        System.out.println("Результат: " + res);

    }
}