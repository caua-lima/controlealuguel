package model;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao() {
        super();
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}
