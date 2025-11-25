#include <stdio.h>

int main(void)
{
    char name[100];           // buffer para armazenar o nome do usuário
    printf("What's your name? ");
    scanf("%99s", name);      // lê até 99 caracteres
    printf("Hello, %s\n", name);
    return 0;
}
