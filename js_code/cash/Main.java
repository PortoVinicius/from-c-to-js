import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total;
        do {
            System.out.print("Valor: ");
            total = sc.nextInt();
        } while (total < 0);

        int n = moedas(total);
        System.out.println(n);

        sc.close();
    }

    public static int moedas(int n) {
        int count = 0;

        while (n >= 25) {
            n = n - 25;
            count = count + 1;
        }

        while (n >= 10) {
            n = n - 10;
            count = count + 1;
        }

        while (n >= 5) {
            n = n - 5;
            count = count + 1;
        }

        while (n >= 1) {
            n = n - 1;
            count = count + 1;
        }

        return count;
    }
}