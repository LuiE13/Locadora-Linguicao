package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Cliente {
    String nome;
    Date dataNasc;
    String cnh;
    ArrayList<Locacao> locacoes;

    public Cliente(String nome, Date dataNasc, String cnh) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cnh = cnh;
    }
}
