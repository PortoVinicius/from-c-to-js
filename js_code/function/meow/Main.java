public class Main {

    public static void main(String[] args) {
        int n = 3;
        meow(n);
    }

    // Função equivalente à função meow do C
    public static void meow(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("meow");
        }
    }
}
