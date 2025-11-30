import java.util.Scanner;

public class Main {

    // Um único Scanner para o programa inteiro
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = positive_int();
        meow(n);
    }

    // Lê um inteiro não negativo do usuário
    public static int positive_int() {
        int n;
        do {
            System.out.print("number: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Entrada inválida. Digite um número inteiro: ");
                scanner.next();      // descarta entrada inválida
            }

            n = scanner.nextInt();

        } while (n < 0);

        return n;
    }

     // Imprime "meow" n vezes
    public static void meow(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("meow");
        }
    }
}