package es.cic.curso25.proy005.model;

public class Telefono {

    private long id; // Importante darle un ID a las clases que creemos. Idealmente no se deberían
                     // poder predecir. (no usar 1,2,3...)
    private String titular;
    private String numero;
    private int tipoContrato;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public int getTipoContrato() {
        return tipoContrato;
    }
    public void setTipoContrato(int tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

}
