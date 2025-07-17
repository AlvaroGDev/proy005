package es.cic.curso25.proy005;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

@Repository
public class MotorRepository {

    private Map<Long, Motor> motores = new HashMap<>();

    public long create(Motor motor) {
        long mayor = getSiguienteId();
        motor.setId(mayor);
        motores.put(motor.getId(), motor);

        return mayor;
    }

    /* Lo que está haciendo es generar un id único para el motor 
    y después lo guarda en el mapa. 
    Llama a la función, recorre el mapa entero cogiendo los IDs, le suma uno y retorna ese ID
    y por ultimo, usa motores.put para añadir al mapa el id generado al create()
    junto con el motor que le hemos pasado
    */
    private long getSiguienteId() {
        long mayor = 0;
        // Inicializa la variable donde iremos guardando temporalmente los IDs
        Set<Long> ids = motores.keySet();
        // Inicializa la variable que tendrá el set clave-valor 
        Iterator<Long> iteratorId = ids.iterator();
        // Y genera una variable con los valores 
        while (iteratorId.hasNext()) {
            // Mientras el iterador tenga un valor siguiente, lo leerá
            Long siguiente = iteratorId.next();
            if (siguiente.longValue() > mayor) {
                mayor = siguiente;
                // Si el valor leído es mayor que el actual, se lo guarda
                //Esto es por si lee primero el id 6 y luego el id 5, no quedarse con el 5
            }
        }
        mayor++;
        return mayor;
        //Teniendo el mayor ID, le suma uno y lo devuelve
        //Esa forma de mostrarlo ayuda mucho a la legibilidad del código
    }

    public Boolean borrarMotor(long id){

       return motores.remove(id) != null;
    } //Esto devuelve el motor, si existe, será distinto de null y devolvería true, si no existe, será igual que null y devolvería false

}
