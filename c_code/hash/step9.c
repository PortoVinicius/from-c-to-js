#include <stdio.h>
#include <openssl/evp.h>

int main(int argc, char *argv[]) {

    if (argc != 2) {
        printf("Uso correto: ./step8 arquivo\n");
        return 1;
    }

    FILE *file = fopen(argv[1], "rb");
    if (file == NULL) {
        printf("Erro: Não foi possivel abrir o arquivo\n");
        return 1;
    }

    // cria contexto EVP
    EVP_MD_CTX *ctx = EVP_MD_CTX_new();
    if (ctx == NULL) {
        printf("Erro ao criar contexto EVP.\n");
        fclose(file);
        return 1;
    }

    // 🔑 INICIALIZA O ALGORITMO (AQUI ESTAVA O PROBLEMA)
    if (EVP_DigestInit_ex(ctx, EVP_sha256(), NULL) != 1) {
        printf("Erro ao inicializar SHA-256\n");
        EVP_MD_CTX_free(ctx);
        fclose(file);
        return 1;
    }

    unsigned char buffer[1024];
    size_t bytes_read;

    // lendo arquivo em blocos
    while ((bytes_read = fread(buffer, 1, sizeof(buffer), file)) > 0) {
        EVP_DigestUpdate(ctx, buffer, bytes_read);
    }

    // resultado final da hash
    unsigned char hash[EVP_MAX_MD_SIZE];
    unsigned int hash_len;

    // finaliza hash
    EVP_DigestFinal_ex(ctx, hash, &hash_len);

    // limpeza
    EVP_MD_CTX_free(ctx);
    fclose(file);

    // imprime hash
    printf("SHA-256: ");
    for (unsigned int i = 0; i < hash_len; i++) {
        printf("%02x", hash[i]);
    }
    printf("\n");

    return 0;
}
