import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) {

        // Verifica se o número correto de argumentos foi passado
        if (args.length != 1) {
            System.out.println("Uso correto: java Main <arquivo>");
            System.exit(1);
        }

        // Tenta abrir o arquivo
        try (FileInputStream fis = new FileInputStream(args[0])) {

            // Cria um objeto MessageDigest para SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Buffer para ler o arquivo em blocos
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Lê o arquivo em blocos e atualiza o digest
            while ((bytesRead = fis.read(buffer)) != -1) {
                digest.update(buffer, 0, bytesRead);
            }

            // Calcula o hash final
            byte[] hash = digest.digest();

            // Imprime o hash como hexadecimal
            System.out.print("SHA-256: ");
            for (byte b : hash) {
                System.out.printf("%02x", b); // Formato hexadecimal
            }
            System.out.println();

        } catch (IOException | NoSuchAlgorithmException e) {
            System.out.println("Erro: " + e.getMessage());
            System.exit(1);
        }
    }
}
