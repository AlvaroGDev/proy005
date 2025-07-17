package es.cic.curso25.proy005;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotorService {

    @Autowired
    private MotorRepositoryInterface motorRepository;

    public long create(Motor motor) {

        motorRepository.save(motor);
        return motor.getId();

    }

    public Motor get(long id){

        Optional<Motor> resultado = motorRepository.findById(id);
        //El optional es una forma de decirle, igual lo tiene o igual no, y si no lo tiene, no estalla
        return resultado.orElse(null);
        //Si tiene el valor, devuelve el valor, en caso contrario, devuelve lo que tiene en el parentesis
        //También está la opcion orElseThrow si queremos salir con excepción

    }

    public List<Motor> get(){

        return motorRepository.findAll();
    }

    public void update(Motor motor){

        motorRepository.save(motor);
    }

    public void delete(long id){
        motorRepository.deleteById(id);
    }
}
