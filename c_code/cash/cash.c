#include <stdio.h>

int m10(int n);

int main(void) {
    int total;

    do {
        printf("Troco: ");
        scanf("%i", &total);
    } while (total < 0);

    int moedas = m10(total);

    printf("%i\n", moedas);
}

int m10(int n) {
    int count = 0;

    while (n >= 25) {
        n = n - 25;
        count = count + 1;
    }

    while (n >= 10) {
        n = n - 10;
        count = count  + 1;
    }

    while (n >= 5) {
        n = n - 5;
        count = count  + 1;
    }

    while (n >= 1) {
        n = n - 1;
        count = count  + 1;
    }

    return count;
}

