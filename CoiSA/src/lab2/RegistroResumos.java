package lab2;

public class RegistroResumos {
    private String[] resumos;
    private String[] conteudos;
    private int numeroDeResumos;
    private String tema;
    private String conteudo;
    private int posicaoAtual;

    public RegistroResumos(int numeroDeResumos) {
        this.numeroDeResumos = numeroDeResumos;
        this.resumos = new String[numeroDeResumos];
        this.conteudos = new String[numeroDeResumos];
        this.posicaoAtual = 0;
    }
    public void adicionaResumo(String tema, String conteudo) {
        if (posicaoAtual > numeroDeResumos) {
            posicaoAtual = 0;
        }
        resumos[posicaoAtual] = tema;
        conteudos[posicaoAtual] = conteudo;
        posicaoAtual++;
    }
    public String[] pegaResumos(){
        return resumos;
    }
    public String imprimeResumos() {

    }
    public int contaResumos() {

    }
    public int conta() {

    }
    public boolean temResumo(String tema) {
        //desenvolver um equals de tema a ser comparado e tema pesquisado
    }
}
