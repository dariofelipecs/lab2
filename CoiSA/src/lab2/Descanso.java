package lab2;

public class Descanso {
    private String statusGeral = "cansado"; //pq inicializa já com o valor?
    private int horasDescanso;
    private int numeroSemanas;

    // Comentário Atividade Arthur: Sem construtor de classe?

    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }
    public void defineNumeroSemanas(int valor) {
        this.numeroSemanas = valor;
    }
    public void setStatusGeral() {
        if((horasDescanso / numeroSemanas) > 26) {
            this.statusGeral = "descansado";}
        }
    public String getStatusGeral() {
        return statusGeral;
    }
}
