#include <stdio.h>
#include <stdbool.h>

int main(void) {
    int n = 0;
    while (true) {
        printf("what's n? ");
        scanf("%i", &n);

        if (n < 0) {
            continue;
        }
        else {
            break;
        }
    }
    

    for (int i = 0; i < n; i++) {
        printf("meow\n");
    }

    return 0;
}