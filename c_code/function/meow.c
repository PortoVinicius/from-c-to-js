#include <stdio.h>

void meow(int n);

int main(void) {
    int n = 3;
    meow(n);
}

void meow(int n) {
    for  (int i = 0; i < n; i++) {
        printf("meow\n");
    }
}