package model;

public class Memoria {

    private static final Memoria instancia = new Memoria();
    private String textoAtual = "";

    // Padrão de projeto SINGLETON!!!
    private Memoria(){

    }

    public static Memoria getInstancia(){
        return instancia;
    }

    public String getTextoAtual() {
        return textoAtual.isEmpty() ? "0" : textoAtual;
    }
}
