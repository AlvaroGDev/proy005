package es.cic.curso25.proy005.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Motor {

    @Id //Cuidado, hay dos opciones: uno de Jakarta y otro de Spring. SIEMPRE el de Jakarta
    @GeneratedValue(strategy = GenerationType.AUTO) 
    // Este va autogenerando, idealmente usariamos UUID (UniversalUnitID) para que sea menos evidente (autoincrementado...)
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
