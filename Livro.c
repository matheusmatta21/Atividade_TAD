#include <stdio.h>
#include <string.h>

typedef struct {
  char titulo[15];
  char autor[18];
  int anoPublicacao;
  int copiasDisponiveis;

} Livro;

void inicializar(Livro *c){
  strcpy(c->titulo, "Naruto");
  strcpy(c->autor, "Masashi Kishimoto");
  c->anoPublicacao = 1999;
  c->copiasDisponiveis = 1;
}

int existeCopia(Livro *c){
  if(c->copiasDisponiveis > 0){
    return 1;
  }return 0;
}

void emprestarCopia(Livro *c) {
  if(&existeCopia){
    c->copiasDisponiveis--;
    printf("Livro emprestado com sucesso!\n");
  }else{
    printf("Não há cópias disponíveis para empréstimo.\n");
  }
}
void devolverCopia(Livro *c) {
  c->copiasDisponiveis++;
  printf("Livro devolvido com sucesso!\n");
}

void informacoesLivro(Livro *c) {
  printf("Título: %s\n", c->titulo);
  printf("Autor: %s\n", c->autor);
  printf("Ano de Publicação: %i\n", c->anoPublicacao);
  printf("Cópias Disponíveis: %i\n", c->copiasDisponiveis);
}

int main(){
  Livro livro;
  inicializar(&livro);
  informacoesLivro(&livro);
}