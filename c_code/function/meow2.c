#include <stdio.h>

void meow(int n);
int positive_int(void);

int main(void) {
    int n = positive_int();
    meow(n);
}

int positive_int(void) {
    int n;
    do {
        printf("number: ");
        scanf("%i", &n);
    } while (n < 0);

    return n;
}

void meow(int n) {
    for (int i = 0; i < n; i++) {
        printf("meow\n");
    }
}