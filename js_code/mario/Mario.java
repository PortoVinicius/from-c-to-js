import java.util.Scanner;

public class Mario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("altura: ");
            n = scanner.nextInt();
        } while (n < 1 || n > 8);

        for (int row = 0; row < n; row++) {

            for (int esp = 0; esp < n - row -1; esp++) {
                System.out.print(" ");
            }

            for (int bloc = 0; bloc <= row; bloc++) {
                System.out.print("#");
            }

            System.out.print("  ");

            for (int bloc = 0; bloc <= row; bloc++) {
                System.out.print("#");
            }

            System.out.println();
        }
        
    }
}