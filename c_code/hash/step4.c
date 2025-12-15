#include <stdio.h>

int main(int argc, char *argv[]) {

    if (argc < 2) {
        printf("Uso correto: ./step4v arquivo");
    }
    else {
        printf("Arquivo %s\n", argv[1]);
    }
}