package lab2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineEsperado;
    private int tempoOnlineUsado;


    public RegistroTempoOnline (String nomeDisciplina) {
        this.tempoOnlineEsperado = 120;
    }
    public RegistroTempoOnline (String nomeDisciplina, int tempoOnlineEsperado){
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }
    public void adicionaTempoOnline(int tempo) {
        this.tempoOnlineUsado += tempo;
    }
    public boolean atingiuMetaTempoOnline() {
        if (tempoOnlineUsado >= tempoOnlineEsperado) {
            return true;}
        return false;
    }
    @Override
    public String toString(){
        return nomeDisciplina + " " + tempoOnlineUsado + "/" + tempoOnlineEsperado;
    }
}