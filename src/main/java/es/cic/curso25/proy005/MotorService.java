package es.cic.curso25.proy005;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotorService {

    @Autowired
    private MotorRepository motorRepository;

    public long create (Motor motor){
        return motorRepository.create(motor);
    }
}
