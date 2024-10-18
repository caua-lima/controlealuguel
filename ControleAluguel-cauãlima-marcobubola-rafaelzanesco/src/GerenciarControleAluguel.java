import model.Aluguel;
import model.Caminhao;
import model.Carro;
import model.Moto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControleAluguel {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Moto moto = new Moto();
        Caminhao caminhao = new Caminhao();


        carro.setPlaca("COM1699");
        carro.setMarca("Fiat");
        carro.setModelo("Pálio");
        carro.setAno(1998);


        Aluguel aluguelCarro = new Aluguel();
        aluguelCarro.setVeiculo(carro);
        aluguelCarro.setDataAluguel(LocalDate.now());
        LocalDateTime horaRetiradaCarro = LocalDateTime.now();
        aluguelCarro.setHoraAluguel(horaRetiradaCarro);
        aluguelCarro.setHoraDevolucao(horaRetiradaCarro.plusHours(2));


        System.out.println("Dados do Aluguel do Carro:");
        aluguelCarro.apresentarRegistroAluguel();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LocalDateTime horaDevolucaoCarro = LocalDateTime.now();
        aluguelCarro.setHoraDevolucao(horaDevolucaoCarro);
        System.out.println("\nDados da Devolução do Carro:");
        aluguelCarro.apresentarRegistroAluguel();

        moto.setPlaca("SEX1693");
        moto.setMarca("Yamaha");
        moto.setModelo("XJ");
        moto.setAno(2024);


        Aluguel aluguelMoto = new Aluguel();
        aluguelMoto.setVeiculo(moto);
        aluguelMoto.setDataAluguel(LocalDate.now());
        LocalDateTime horaRetiradaMoto = LocalDateTime.now();
        aluguelMoto.setHoraAluguel(horaRetiradaMoto);
        aluguelMoto.setHoraDevolucao(horaRetiradaMoto.plusHours(2));


        System.out.println("\nDados do Aluguel da Moto:");
        aluguelMoto.apresentarRegistroAluguel();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LocalDateTime horaDevolucaoMoto = LocalDateTime.now();
        aluguelMoto.setHoraDevolucao(horaDevolucaoMoto);
        System.out.println("\nDados da Devolução da Moto:");
        aluguelMoto.apresentarRegistroAluguel();


        caminhao.setPlaca("PIK4169");
        caminhao.setMarca("Wolksvagen");
        caminhao.setModelo("Carreta");
        caminhao.setAno(2007);

        Aluguel aluguelCaminhao = new Aluguel();
        aluguelCaminhao.setVeiculo(caminhao);
        aluguelCaminhao.setDataAluguel(LocalDate.now());
        LocalDateTime horaRetiradaCaminhao = LocalDateTime.now();
        aluguelCaminhao.setHoraAluguel(horaRetiradaCaminhao);
        aluguelCaminhao.setHoraDevolucao(horaRetiradaCaminhao.plusHours(2));


        System.out.println("\nDados do Aluguel do Caminhão:");
        aluguelCaminhao.apresentarRegistroAluguel();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LocalDateTime horaDevolucaoCaminhao = LocalDateTime.now();
        aluguelCaminhao.setHoraDevolucao(horaDevolucaoCaminhao);
        System.out.println("\nDados da Devolução do Caminhão:");
        aluguelCaminhao.apresentarRegistroAluguel();

        System.out.println("\nTodos os registros de aluguel foram processados com sucesso.");
    }
}
