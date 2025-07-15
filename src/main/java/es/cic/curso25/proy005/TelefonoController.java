package es.cic.curso25.proy005;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/telefono") // Cuando llegue cualquier petiticion, todo lo que empiece por teléfono lo
                             // buscará aqui
public class TelefonoController {

    private int contador = 0;

    // C R U D

    /*
     * Es muy importante NO CREAR NINGUNA VARIABLE EN EL CONTROLADOR
     * Sí se pueden crear en los métodos(o recibirlos por argumentos), pero no fuera
     * Si las creas dentro, dos personas pueden apuntar al mismo sitio y no
     * modificar los datos del objeto
     * Si están las variables por fuera y dos personas por ejemplo en la aplicación
     * del banco entran, se cambiarían los datos
     * Y una persona podría ver la información de la otra
     */

    List<Telefono> resultado = new ArrayList<>();

    @PostMapping
    public long create(@RequestBody Telefono telefonoCrear) {
        return ++contador;
        /*
         * ES IMPORTANTE HACERLO ASÍ y no como contador++ porque NO queremos que el
         * primer ID sea 0
         * Al hacerlo así, primero suma (contador es 1) y luego asignaría el contador al
         * id (id empezaría en 1)
         */
    }

    @GetMapping()
    public List<Telefono> get() {
        // contador++;

        Telefono telefono1 = new Telefono();
        telefono1.setId(1);
        telefono1.setNumero("555555556");
        telefono1.setTipoContrato(1);
        telefono1.setTitular("Juan");

        resultado.add(telefono1);

        Telefono telefono2 = new Telefono();
        telefono2.setId(2);
        telefono2.setNumero("456789321");
        telefono2.setTipoContrato(1);
        telefono2.setTitular("Manuel");

        resultado.add(telefono2);

        return resultado;
    }

    @GetMapping("/{id}")
    public Telefono get(@PathVariable long id) {
        contador++;

        Telefono telefono2 = new Telefono();
        telefono2.setId(id);
        telefono2.setNumero("666555444");
        telefono2.setTipoContrato(1);
        telefono2.setTitular("francisco");

        return telefono2;
    }

    @PutMapping
    public void update(@RequestBody Telefono telefonoActualizar) {
        // Falta de escribir todo
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {

    }
}

/*
 * Tenemos indicado con el requestMapping que todo lo que empiece por teléfono
 * lo busque aquí,
 * pero necesitamos que encuentre el método
 * Al utilizar GetMapping, le decimos que cuando encuentre una peticion GET,
 * llame a esa función
 */