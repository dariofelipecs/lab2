package lab2;

public class Disciplina {
    private String nomeDisciplina;
    private int nota;
    private double valorNota;
    private int horas;
    private double media;
    private double[] notas;

    public Disciplina (String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    public void cadastraHoras(int horas) {
        this.horas += horas;
    }
    public void cadastraNota(int nota, double valorNota) {
        double[] notas = new double[4];
        notas[nota - 1] = valorNota;
        this.media += valorNota;
    }
    public boolean aprovado(){
        if (media / 4 >= 7.0){
            return true;
        } return false;
    }
    @Override
    public String toString() {
        return nomeDisciplina+" "+horas+" "+media+" "+notas;
    }
}