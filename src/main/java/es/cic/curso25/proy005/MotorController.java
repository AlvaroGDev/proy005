package es.cic.curso25.proy005;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/motor")
public class MotorController {

    @Autowired
    private MotorService motorService;

    @PostMapping
    public long create (Motor motor){
       try{

       } catch(RuntimeException re) {

       }
        if(motor.getId() != null){
            throw new RuntimeException("Al crear no me puedes pasar id");
        } //Si vamos a crear uno, no debemos pasarle el ID, porque lo genera él mismo
        return motorService.create(motor);
    }

}
