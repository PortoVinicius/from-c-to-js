#include <stdio.h>

int main(int argc, char *argv[]) {

    if (argc != 2) {
        printf("Usocorreto: ./step6 teste.txt\n");
        return 1;
    }

    FILE *file = fopen(argv[1], "r");
    if (file == NULL) {
        printf("Não foi possivel abrir o arquivo %s\n", argv[1]);
        return  1;
    }

    char c;
    while ((c = fgetc(file)) != EOF) {  // lê char por char até o final
        printf("%c", c);
    }

    fclose(file);
    return 0;
}