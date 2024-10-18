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


        carro.setPlaca("ABC1234");
        carro.setMarca("Fiat");
        carro.setModelo("Uno");
        carro.setAno(2020);


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

        moto.setPlaca("XYZ9876");
        moto.setMarca("Honda");
        moto.setModelo("CG");
        moto.setAno(2021);


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


        caminhao.setPlaca("DEF5678");
        caminhao.setMarca("Volvo");
        caminhao.setModelo("FH");
        caminhao.setAno(2019);

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
