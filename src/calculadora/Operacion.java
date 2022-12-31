
package calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Faber
 */
public class Operacion {
    
    private double numero;
    private double numero1;
    private double result;
    private String operador;

    //Metodo constructor vacío
    public Operacion() {
    }

    //Metodo constructor con parametros
    public Operacion(double numero, double numero1, double result, String operador) {
        this.numero = numero;
        this.numero1 = numero1;
        this.result = result;
        this.operador = operador;
    }

    //Metodos getter and setter
    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getNumero1() {
        return numero1;
    }


    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
    
    //objeto para trabajar con la consola
    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    
    //Metodo que devuelve la operacion que el usuario desea realizar
    public String definirOperacion() throws IOException{
        System.out.println("ingresa el signo de la operacion que se quiere realizar ");
        operador = bfr.readLine();
      
        return operador;
    }
    
    //Metodo que retorna la cantidad a la cual se desea ejecutar las operaciones
    public double pedirValor() throws IOException{
        System.out.println("ingresa un valor");
        numero = Double.parseDouble(bfr.readLine());
        
        return numero;
    }

    /* Metodo que realiza las operaciones indicadas para el taller y que devuelve un
    resultado*/
    public double obtenerResultado(String operacion, double numero, double numero1){
        double result = 0;
        
        switch(operacion){
            case "+": 
                result = numero + numero1;
                break;
                
            case "-":
                result = numero - numero1;
                break;
                
            case "*":
                result = (numero * numero1);
                break;
                
            case "/":
                if(numero1 != 0){
                    result = numero / numero1;
                }else{
                    System.out.println("No es posible realizar la Operación");
                    result = 0;
                }
                break;
                
            case "%":
                result = numero % numero1;
                break;
                
            case "=":
                System.out.println(result);
                break;
                
        }
        return result;
    }
    
     
   
    
}
