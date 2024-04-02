package Java;
import java.util.List;

class Empregado {
    private String nome;
    private int id;
    private String cargo;
    private double salario;
    private Departamento departamento;

    public void atualizarInformacoes(String nome, String cargo, double salario) {
        System.out.println("");
    }

    public void transferirDepartamento(Departamento novoDepartamento) {
        System.out.println("");
    }

    public Departamento informacoesDepartamento() {
        return departamento;
    }
}

class Departamento {
    private String nome;
    private int id;
    private String localizacao;
    private List<Empregado> empregados;


    public void adicionarEmpregado(Empregado empregado) {
        System.out.println("");
    }

    public void removerEmpregado(Empregado empregado) {
        System.out.println("");
    }

    public List<Empregado> informacoesEmpregados() {
        return empregados;
    }
}

class Empresa {
    public void main(String[] args) {
        System.out.println("");
    }
}