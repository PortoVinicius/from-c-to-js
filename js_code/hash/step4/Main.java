public class Main {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Uso correto: java Main.java argumento.");
        }
        else {
            System.out.println("Arquivo " + args[0]);
        }
    }
}