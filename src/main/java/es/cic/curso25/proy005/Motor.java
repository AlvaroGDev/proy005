package es.cic.curso25.proy005;

public class Motor {

    private Long id; 
    /*Esto sería un objeto de tipo Long, no una variable primitiva de tipo Long
    A la hora de crear un registro, debería ser null, ya que aún no existe en la base de datos
    Por el contrario, si queremos actualizarlo, debería tener un valor distinto de null
    */
    private double potencia;
    //Si no inicializamos, por defecto será 0.0, si fuese un objeto Double, sería null
    private String marca;
    private boolean encendido;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public boolean isEncendido() {
        return encendido;
    }
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    

}
