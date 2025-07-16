package es.cic.curso25.proy005;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MotorServiceIntegrationTest {

    @Autowired
    private MotorService motorService;

    @Test
    public void testCreate(){

        Motor motorACrear = new Motor();
        motorACrear.setEncendido(true);
        motorACrear.setMarca("null");
        motorACrear.setPotencia(2.1);
        // Creamos un motor entero. El id técnicamente lo crearia la BBDD automaticamente, asi que lo generamos con la aplicacion
        long idAsignado = motorService.create(motorACrear);

        assertTrue(idAsignado > 0, "");

        
    }

}
