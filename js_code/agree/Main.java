import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        char n = 'y';

        System.out.print("do you agree? ");
        n = scanner.next().charAt(0);  // lê apenas o primeiro caractere digitado

        if (n == 'y'  || n == 'y') {
            System.out.println("agreed. ");
        }
        else if (n == 'n' || n == 'N') {
            System.out.println("not agreed. ");
        }

        scanner.close();

    }
}