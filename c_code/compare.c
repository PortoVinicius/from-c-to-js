#include <stdio.h>

int main(void) {
    int x;
    int y;

    // Pede o valor de x ao usuário
    printf("Valor de x: ");
    scanf("%d", &x);

    // Pede o valor de y ao usuário
    printf("Valor de y: ");
    scanf("%d", &y);

    if (x > y) {
        printf("%d é maior que %d\n", x, y);
    }
    else if (x < y) {
        printf("%d é menor que %d\n", x, y);
    }
    else {
        printf("%d é igual a %d\n", x, y);
    }

    return 0;
}
