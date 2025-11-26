import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("valor de x: ");
        int x = scanner.nextInt();

        System.out.print("valor de y: ");
        int y = scanner.nextInt();

        if (x > y) {
            System.out.println(x + " é maior que " + y);
        }
        else if (x < y) {
            System.out.println(x + " é menor que " + y);
        }
        else {
            System.out.println(x + " é igual a " + y);
        }

        scanner.close();
    }
}