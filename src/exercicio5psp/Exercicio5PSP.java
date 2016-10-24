/**
 * Escribe una clase llamada orden que cree dos hilos y fuerce que la 
 * escritura del segundo sea siempre anterior a la escritura por pantalla del primero.
 * Ejemplo de ejecución:
    * Hola, soy el hilo número 2
    * Hola, soy el hilo número 1
 */
package exercicio5psp;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;

/**
 *
 * @author Yasmin
 */
public class Exercicio5PSP {

    public static void main(String[] args) {
        
    String nomeHilo1 = "Hola, soy el hilo número 1";
    String nomeHilo2 = "Hola, soy el hilo número 2";
        
        Orden hilo1 = new Orden(nomeHilo1); 
        hilo1.setPriority(MIN_PRIORITY); //Concede la menor prioridad al hilo
        Orden hilo2 = new Orden(nomeHilo2);
        hilo2.setPriority(MAX_PRIORITY); //Concede la mayor prioridad al hilo
        hilo2.start();
        hilo1.start();
        
    }
    
}
