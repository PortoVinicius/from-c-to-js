#include <stdio.h>

int main(int argc, char *argv[]) {
    
    if (argc != 2) {
        printf("Uso correto: ./step7 arquivo\n");
        return 1;
    }

    FILE *file = fopen(argv[1], "rb");   // "rb" read binary

    if (file == NULL) {
        printf("Erro: Não foi possivel abrir o arquivo\n");
    }

    unsigned char buffer[16];   // lê blocos de 16 bytes
    size_t bytes_read;

    while ((bytes_read = fread(buffer, 1, sizeof(buffer), file)) > 0) {
        
        // imprimor bytes como chars
        for (size_t i  = 0; i < bytes_read; i++) {
            printf("%c", buffer[i]);
        }
    }

    fclose(file);
    return 0;
}