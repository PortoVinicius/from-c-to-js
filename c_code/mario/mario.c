#include <stdio.h>

int main(void) {
    int n;
    do {
        printf("altura: ");
        scanf("%i", &n);
    } while (n < 0 || n > 8);

    for (int lin = 0; lin < n; lin++) { // printa lina por linha

        for (int esp = 0; esp < n - lin - 1; esp++){
            printf(" ");
        }

        for (int blc = 0; blc <= lin; blc++) {
            printf("#");    
        }
        printf("  ");

        for (int blc = 0; blc <= lin; blc++) {
            printf("#");    
        }

        for (int esp = 0; esp < n - lin - 1; esp++){
            printf(" ");
        }

        printf("\n");
    }
}