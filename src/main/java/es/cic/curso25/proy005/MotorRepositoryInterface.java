package es.cic.curso25.proy005;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MotorRepositoryInterface extends JpaRepository<Motor,Long> {

}
