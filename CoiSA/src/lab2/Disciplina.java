package lab2;

public class Disciplina {
    private String nomeDisciplina;
    private int nota;
    private double valorNota;
    private int horas;
    private double media;

    public Disciplina (String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    public void cadastraHoras(int horas) {
        this.horas += horas;
    }
    public void cadastraNota(int nota, double valorNota) {
        double[] notas = new double[4];
        notas[nota] = valorNota;
    }
    public boolean aprovado(){

    }
    public String toString() {
    }
}