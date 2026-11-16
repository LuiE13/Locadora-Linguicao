package Modelo;

public class Veiculo {
    double valor;
    String placa;
    String ano;
    String montadora;
    String localizacao;
    String modelo;
    String cor;
    String motorização;
    String descricao;
    String categoria;

    public Veiculo(
            double valor, String placa, String montadora, String ano, String localizacao, String modelo, String cor, String motorização, String descricao, String categoria
    ) {
        this.valor = valor;
        this.placa = placa;
        this.montadora = montadora;
        this.ano = ano;
        this.localizacao = localizacao;
        this.modelo = modelo;
        this.cor = cor;
        this.motorização = motorização;
        this.descricao = descricao;
        this.categoria = categoria;
    }
}
