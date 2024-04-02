#include <stdio.h>

struct Departamento;

typedef struct {
    char *nome;
    int id;
    char *cargo;
    double salario;
    struct Departamento *departamento;
} Empregado;

typedef struct {
    char *nome;
    int id;
    char *localizacao;
    Empregado **empregados;
    int num_empregados;
} Departamento;

void atualizarInformacoes(Empregado *empregado, char *nome, char *cargo, double salario) {
    printf("");
}

void transferirDepartamento(Empregado *empregado, Departamento *novoDepartamento) {
    printf("");
}

Departamento* informacoesDepartamento(Empregado *empregado) {
    return empregado->departamento;
}

void adicionarEmpregado(Departamento *departamento, Empregado *empregado) {
    printf("");
}

void removerEmpregado(Departamento *departamento, Empregado *empregado) {
    printf("");
}

Empregado** informacoesEmpregados(Departamento *departamento) {
    return departamento->empregados;
}

int main() {
    return 0;
}