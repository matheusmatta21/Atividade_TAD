import java.util.List;

class Empregado {
    private String nome;
    private int id;
    private String cargo;
    private double salario;
    private Departamento departamento;

    public void atualizarInformacoes(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void transferirDepartamento(Departamento novoDepartamento) {
        this.departamento = novoDepartamento;
    }

    public Departamento informacoesDepartamento() {
        return this.departamento;
    }
}

class Departamento {
    private String nome;
    private int id;
    private String localizacao;
    private List<Empregado> empregados;


    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    public void removerEmpregado(Empregado empregado) {
        empregados.remove(empregado);
    }

    public List<Empregado> informacoesEmpregados() {
        return empregados;
    }
}
