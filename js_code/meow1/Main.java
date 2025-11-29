import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        // Repete até receber um número não negativo
        do {
            System.out.print("numero: ");
            n = scanner.nextInt();
        } while (n < 0);

        // Imprime "meow" n vezes
        for (int i = 0; i < n; i++) {
            System.out.println("meow");
        }

        scanner.close();
    }
}
