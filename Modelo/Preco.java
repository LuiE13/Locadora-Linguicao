package Modelo;

public class Preco {
    double valor;
    Locacao locacao;
    String metodoPag;

    public Preco(Locacao locacao, String metodoPag) {
        this.locacao = locacao;
        this.metodoPag = metodoPag;
    }

    public double getValor() {
        return valor;
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public String getMetodoPag() {
        return metodoPag;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
