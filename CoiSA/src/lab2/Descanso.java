package lab2;

public class Descanso {
    private String statusGeral = "cansado";
    private int horasDescanso;
    private int numeroSemanas;

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
