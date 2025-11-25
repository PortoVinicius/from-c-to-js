#include <stdio.h>

int main(void) {
    int x;
    int y;

    // Lê o valor de x
    printf("Valor de x: ");
    scanf("%d", &x);

    // Lê o valor de y
    printf("Valor de y: ");
    scanf("%d", &y);

    // Imprime o resultado
    printf("O valor de %d + %d = %d\n", x, y, x + y);

    return 0;
}
