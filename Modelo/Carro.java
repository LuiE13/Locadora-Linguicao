package Modelo;

public class Carro extends Veiculo{
    int passageiros;

    public Carro(double valor, String placa, String montadora, String ano, String localizacao, String modelo, String cor, String motorização, String descricao, String categoria, int passageiros) {
        super(valor, placa, montadora, ano, localizacao, modelo, cor, motorização, descricao, categoria);
        this.passageiros = passageiros;
    }

}
