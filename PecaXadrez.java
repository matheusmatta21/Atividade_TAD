package Java;

public class PecaXadrez {
    private String tipo = "Rei";
    private String cor = "Preto";
    private int posicaoLinha = 6;
    private int posicaoColuna = 5;
    private String posicao = Integer.toString(posicaoLinha) + "x" + Integer.toString(posicaoColuna);

    public void moverPeca(int posicaoLinhaDesejado, int posicaoColunaDesejado){
        if(verificarPossivelMoverPeca(posicaoLinhaDesejado, posicaoColunaDesejado)){
            this.posicao = Integer.toString(posicaoLinhaDesejado) + "x" + Integer.toString(posicaoColunaDesejado);
            System.out.println("Posição alterada para "+ posicao);
        }else{
            System.out.println("Não é possível alterar para essa posição.");
        }
    }

    public void capturarPeca(){
        System.out.println("Peça capturada com sucesso!");
    }

    public boolean verificarPossivelMoverPeca(int posicaoLinhaDesejado, int posicaoColunaDesejado){
        if(posicaoLinhaDesejado > 8 || posicaoColunaDesejado > 8){
            return false;
        } return true;
    }

    public void informacoesPeca(){
        System.out.println("Tipo: " + tipo);
        System.out.println("Cor: " + cor);
        System.out.println("Posição: " + posicao);
    }
    public void main(String[] args) {
        System.out.println("");
    }
}
