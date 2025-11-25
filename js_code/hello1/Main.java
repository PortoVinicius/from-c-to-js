// Main.java
// Este programa lê o nome do usuário e imprime uma saudação, equivalente ao hello1.c em C

import java.util.Scanner; // Importa a classe Scanner para ler input do usuário

public class Main {

    // Ponto de entrada do programa, equivalente ao main em C
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler do console

        System.out.print("What's your name? ");  // Imprime a pergunta sem pular linha
        String name = scanner.next();             // Lê uma palavra (até o primeiro espaço)
        
        System.out.println("Hello, " + name);    // Imprime a saudação, equivalente ao printf do C

        scanner.close();                          // Fecha o Scanner
    }
}
