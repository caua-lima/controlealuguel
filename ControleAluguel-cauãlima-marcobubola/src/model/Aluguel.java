package model;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Aluguel {
    private int idAluguel;
    private Veiculo veiculo;
    private LocalDate dataAluguel;
    private LocalDateTime horaAluguel;
    private LocalDateTime horaDevolucao;

    // Construtor
    public Aluguel() {
    }

    // Getters e Setters
    public int getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(int idAluguel) {
        this.idAluguel = idAluguel;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDate getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(LocalDate dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public LocalDateTime getHoraAluguel() {
        return horaAluguel;
    }

    public void setHoraAluguel(LocalDateTime horaAluguel) {
        this.horaAluguel = horaAluguel;
    }

    public LocalDateTime getHoraDevolucao() {
        return horaDevolucao;
    }

    public void apresentarRegistroAluguel() {
        System.out.println(toString());
    }

    public void setHoraDevolucao(LocalDateTime horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    @Override
    public String toString() {
        String tipoVeiculo = "";

        if (veiculo instanceof Carro) {
            tipoVeiculo = "Carro";
        } else if (veiculo instanceof Moto) {
            tipoVeiculo = "Moto";
        } else if (veiculo instanceof Caminhao) {
            tipoVeiculo = "Caminhão";
        }

        return "Registro de Aluguel:\n" +
                "ID do Aluguel: " + idAluguel + "\n" +
                "Tipo de Veículo: " + tipoVeiculo + "\n" +
                "Data do Aluguel: " + dataAluguel + "\n" +
                "Hora de Retirada: " + horaAluguel + "\n" +
                "Hora de Devolução: " + horaDevolucao;
    }
}
