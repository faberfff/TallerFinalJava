
package calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 *
 * @author Faber
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
	
		// TODO Auto-generated method stub
     BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
     
     //se crea un objeto de la clase operación
     Operacion op = new Operacion();
     //se declaran las respectivas variables
     double numero1, numero2, result;
     double suma = 0;
     boolean continuar = true;
     String accion;
   
     
     numero1 = 0;
         //condicional para evualuar el primer valor de la variable numero1
         if(numero1 == 0){
        
         numero1 = op.pedirValor();
         accion = "";
         
         //en este ciclo se realiza la accion de hasta cuando se van a realizar las operaciones
         while (!accion.equals("=")) {
             accion = op.definirOperacion();
             /*este condicional evalua el que hacer cuando se ingresa el signo que da por 
             terminado el uso de la calculadora */
             if(accion.equals("=")){
                 System.out.println(numero1);
              /* si el usuario aun desea seguir realizando más operaciones el condicional
                 ejecuta este fragmento de codigo*/
             }else{
                 numero2 = op.pedirValor();
                 result = op.obtenerResultado(accion, numero1, numero2);
                 numero1 = result;
                 System.out.println(numero1);
             } 
             
         }
         
     }
         
    }
    
}
     
