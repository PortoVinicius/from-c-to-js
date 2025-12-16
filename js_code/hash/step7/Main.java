import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Verifica se exatamente 1 argumento foi passado
        if (args.length != 1) {
            System.out.println("Uso correto: java Main nome_do_arquivo");
            System.exit(1);
        }

        // Tenta abrir o arquivo no modo binário
        try (FileInputStream fis = new FileInputStream(args[0])) {

            // Cria um buffer de 16 bytes
            byte[] buffer = new byte[16];
            int bytesRead;

            // Lê o arquivo em blocos de 16 bytes
            while ((bytesRead = fis.read(buffer)) > 0) {

                // Imprime os bytes como caracteres
                for (int i = 0; i < bytesRead; i++) {
                    System.out.print((char) buffer[i]);
                }
            }

        } catch (IOException e) {
            System.out.println("Erro: Não foi possível abrir ou ler o arquivo");
            e.printStackTrace();
        }
    }
}
