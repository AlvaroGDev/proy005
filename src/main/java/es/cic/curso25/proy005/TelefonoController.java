package es.cic.curso25.proy005;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/telefono") // Cuando llegue cualquier petiticion, todo lo que empiece por teléfono lo
                             // buscará aqui
public class TelefonoController {
    
    private int contador = 0;
    // C R U D

    /*
     Es muy importante NO CREAR NINGUNA VARIABLE EN EL CONTROLADOR
     Sí se pueden crear en los métodos(o recibirlos por argumentos), pero no fuera
     Si las creas dentro, dos personas pueden apuntar al mismo sitio y no modificar los datos del objeto
     Si están las variables por fuera y dos personas por ejemplo en la aplicación del banco entran, se cambiarían los datos
     Y una persona podría ver la información de la otra
     */
    @GetMapping()
    public List<Telefono> get() {
        contador++;
        List<Telefono> resultado = new ArrayList<>();
        Telefono telefono1 = new Telefono();
        telefono1.setId(2);
        telefono1.setNumero("555555556");
        telefono1.setTipoContrato(1);
        telefono1.setTitular("Juan");

        resultado.add(telefono1);

        Telefono telefono2 = new Telefono();
        telefono2.setId(1);
        telefono2.setNumero("456789321");
        telefono2.setTipoContrato(1);
        telefono2.setTitular("Manuel");

        resultado.add(telefono2);

        return resultado;
    }

}

/*
 * Tenemos indicado con el requestMapping que todo lo que empiece por teléfono
 * lo busque aquí,
 * pero necesitamos que encuentre el método
 * Al utilizar GetMapping, le decimos que cuando encuentre una peticion GET,
 * llame a esa función
 */