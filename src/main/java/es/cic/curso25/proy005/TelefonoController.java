package es.cic.curso25.proy005;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/telefono") //Cuando llegue cualquier petiticion, todo lo que empiece por teléfono lo buscará aqui
 public class TelefonoController {

    @GetMapping
    public String mensaje(){
        return "Hola";
    }

}

/*Tenemos indicado con el requestMapping que todo lo que empiece por teléfono lo busque aquí, 
pero necesitamos que encuentre el método
Al utilizar GetMapping, le decimos que cuando encuentre una peticion GET, llame a esa función
*/