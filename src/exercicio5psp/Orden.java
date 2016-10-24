package exercicio5psp;

/**
 *
 * @author Yasmin
 */
public class Orden extends Thread{
    
    public Orden(String name){
        super(name);
    }
    
    /**
     * Muestra el nombre de los Hilos creados
     */
    public void run(){ 
        System.out.println(getName());
    }
}
