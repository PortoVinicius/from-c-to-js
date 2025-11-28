#include <stdio.h>

int main(void) {
    char n = 'y';

    printf("do you agree? ");
    scanf("%c", &n);


    if (n == 'y' || n == 'Y') {
        printf("agreed.\n");
    }
    else if (n == 'n' || n == 'N') {
        printf("not agreed.\n");
    }
    return 0;

}