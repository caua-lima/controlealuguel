package model;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro() {
        super();
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}
