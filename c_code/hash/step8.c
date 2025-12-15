#include <stdio.h>

int main(int argc, char *argv[])  {

    if (argc != 2) {
        printf("Uso correto: ./step8 arquivo\n");
        return 1;
    }

    FILE *file = fopen(argv[1], "rb"); 
    if (file == NULL) {
        printf("Erro: Não foi possivel abrir o arquivo\n");
    }

    unsigned char buffer[16];   // bloco de leitura
    size_t bytes_read;
    unsigned long hash = 0;     // mini-hash

    while ((bytes_read = fread(buffer, 1, sizeof(buffer), file)) > 0) {

        for (size_t i = 0; i < bytes_read; i++) {
            hash += buffer[i];          // somamos os bytes
            hash = hash % 1000000;      // mantemos o numero pequeno
        }
    }

    fclose(file);

    printf("Hash simples do arquivo: %lu\n", hash);
    return 0;
}