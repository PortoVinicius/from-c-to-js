import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("valor de x: ");
        int x = scanner.nextInt();

        System.out.print("valor de y: ");
        int y = scanner.nextInt();

        System.out.println("o valor de "+ x +" + " + y + " = " + (x + y));
        scanner.close();

    }
}