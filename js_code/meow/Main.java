import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;

        // repeat until n >= 0
        while (true) {
            System.out.print("whats's n? ");
            n = scanner.nextInt();

            if (n < 0){
                continue;
            }
            else {
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("meow");

        }
    }
}