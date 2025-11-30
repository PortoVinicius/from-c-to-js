import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("number: ");
            n = scanner.nextInt();
        } while (n < 0);

        meow(n);
    }

    public static void meow(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("meow");
        }
    }
}