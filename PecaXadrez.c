#include <stdio.h>
#include <string.h>

typedef struct
{
    char tipo[10];
    char cor[10];
    int posicaoLinha;
    int posicaoColuna;
    char posicao[5];
} PecaXadrez;

int verificarPossivelMoverPeca(int posicaoLinhaDesejado, int posicaoColunaDesejado)
{
    if (posicaoLinhaDesejado > 8 || posicaoColunaDesejado > 8)
    {
        return 0;
    }
    return 1;
}

void moverPeca(PecaXadrez *peca, int posicaoLinhaDesejado, int posicaoColunaDesejado)
{
    if (verificarPossivelMoverPeca(posicaoLinhaDesejado, posicaoColunaDesejado))
    {
        peca->posicaoLinha = posicaoLinhaDesejado;
        peca->posicaoColuna = posicaoColunaDesejado;
        sprintf(peca->posicao, "%dx%d", posicaoLinhaDesejado, posicaoColunaDesejado);
        printf("Posição alterada para %s\n", peca->posicao);
    }
    else
    {
        printf("Não é possível alterar para essa posição.\n");
    }
}

void capturarPeca()
{
    printf("Peça capturada com sucesso!\n");
}

void informacoesPeca(PecaXadrez peca)
{
    printf("Tipo: %s\n", peca.tipo);
    printf("Cor: %s\n", peca.cor);
    printf("Posição: %s\n", peca.posicao);
}

int main()
{
    PecaXadrez peca;
    strcpy(peca.tipo, "Rei");
    strcpy(peca.cor, "Preto");
    peca.posicaoLinha = 6;
    peca.posicaoColuna = 5;
    sprintf(peca.posicao, "%dx%d", peca.posicaoLinha, peca.posicaoColuna);

    informacoesPeca(peca);

    moverPeca(&peca, 3, 4);

    return 0;
}