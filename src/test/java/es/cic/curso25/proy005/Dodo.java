package es.cic.curso25.proy005;

public class Dodo {

    private static Dodo instancia;

    private Dodo(){

    }
    //Static significa que solo se puede hacer desde la clase, no desde el objeto
    public static Dodo getInstancia(){
        if (instancia == null){
            instancia = new Dodo();
        }
        return instancia;

}
}

/* EJEMPLO DE CÓDIGO SINGLETON 
TL;DR el patrón singleton busca que haya solo una instancia de un objeto, y a partir de ese se llamen a los métodos
 El problema de esto es que si dos usuarios apuntan aquí a la vez, se crearían dos dodos, lo que sería un bug.
 */