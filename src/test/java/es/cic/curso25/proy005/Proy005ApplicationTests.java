package es.cic.curso25.proy005;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Proy005ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test 
	void testLista(){

		ArrayList miLista = new ArrayList();
		miLista.add("Hola");

		miLista.get(0);

	}
}
