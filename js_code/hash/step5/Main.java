import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Uso correto: java VerificarArgumentos nome_do_arquivo");
            System.exit(1);
        }

        // Cria um objeto File com o nome do arquivo
        File file = new File(args[0]);

        // Verifica se o arquivo existe
        if (!file.exists()) {   
            System.out.println("Erro: Não foi possivel abrir o arquivo");
            System.exit(1);
        }

        // Se o arquivo existir, imprime uma mensagem
        System.out.println("Arquivo: " + args[0] + " encontrado com sucesso.");
    }
}