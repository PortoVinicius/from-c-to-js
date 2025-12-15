#include <stdio.h>

int main(int argc, char *argv[]) {

    if (argc != 2) {
        printf("Uso correto: ./step5 teste.txt");
        return 1;
    }
    
    // tenta abrir o arquivo
    FILE *file = fopen(argv[1], "r");

    // Check se der erro
    if (file == NULL) {
        printf("Erro: Não foi possivel abrir o arquivo\n");
        return 1;
    }

    // Sucesso
    printf("Arquivo '%s' aberto com sucesso\n", argv[1]);

    // Fecha o arquivo
    fclose(file);
    return 0;

}