import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner number = new Scanner(System.in);
        int n;
        System.out.println("Input how many terms you want to go up to: ");
        n = number.nextInt();
        System.out.println("Fibonacci series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        number.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

