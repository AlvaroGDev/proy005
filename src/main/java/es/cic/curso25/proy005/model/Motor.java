package es.cic.curso25.proy005.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity 
@Table(name="MAQUINA") 
/*Al poner el @Entity, el h2 crea una tabla basado en la clase a la que apunta, la tabla seria motor, los atributos los de la clase
Aqui podemos especificar si queremos darle un nombre distinto, en este caso en vez de "motor" el nombre sería "MAQUINA"
*/
public class Motor {

    @Id //Cuidado, hay dos opciones: uno de Jakarta y otro de Spring. SIEMPRE el de Jakarta
    @GeneratedValue(strategy = GenerationType.AUTO) 
    // Este va autogenerando, idealmente usariamos UUID (UniversalUnitID) para que sea menos evidente (autoincrementado...)
    private Long id; 
    /*Esto sería un objeto de tipo Long, no una variable primitiva de tipo Long
    A la hora de crear un registro, debería ser null, ya que aún no existe en la base de datos
    Por el contrario, si queremos actualizarlo, debería tener un valor distinto de null
    */
    @Version
    private long version;
    /*
     Version lo que hace es, por ejemplo
     Una persona hace una consulta para modificar un atributo de una query
     Se va a tomar el café, y al volver intenta meterlo
     Al intentar meterlo, le dice "Estás en la version X(2, por ejemplo)", pero estás apuntando a la version 3 (por haber tardado)
     Es lo que se llama una forma OPTIMISTA
     Si le dejamos cambiar datos cuando hay versiones nuevas, podriamos perder datos, por reinsertarle los antiguos
     */
    @Column(name="potencias")
    private double potencia;
    //Si no inicializamos, por defecto será 0.0, si fuese un objeto Double, sería null
    @Column(length = 4, unique = true, )
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
