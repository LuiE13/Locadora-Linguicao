package Modelo;

import java.util.Date;

public class Locacao {
    Date dataInicio;
    Date dataFinal;
    Carro carro;
    Moto moto;
    Cliente cliente;
    boolean tipo;

    public Locacao(Date dataInicio, Date dataFinal, Carro carro, Moto moto, Cliente cliente, boolean tipo) {
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.carro = carro;
        this.moto = moto;
        this.cliente = cliente;
        this.tipo = tipo;
    }
}
