package Controle;

import Modelo.Preco;

public class PrecoControle {
    Preco preco;

    boolean calcularPreco(){
        String metodo = preco.getMetodoPag();

        switch (metodo){
            case "Credito":
                break;
            case "Debito":
                break;
            case "Pix":
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + metodo);
        }
        return true;
    }
}
