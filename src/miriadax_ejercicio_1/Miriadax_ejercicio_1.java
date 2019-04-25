/*Escribir un programa que repita un número determinado 
de veces la obtención de N números
aleatorios comprendidos en un rango elegido
entre cuatro opciones*/


package miriadax_ejercicio_1;
import java.util.Random;

public class Miriadax_ejercicio_1 {

    public static void main(String[] args) {
        //genero numeros random
        Random r = new Random();
        // contador de numeros aleatorios
        int nNumeros = r.nextInt(19)+1;
        
        System.out.println("Generando "+nNumeros+" numeros random.");
        
        /*bucle for imprime n numeros aleatorios comprendidos entre 17 y 65
        si es menor que 17 suma 1 al contador para reiniciarlo*/
        
        for(int i=0;i<nNumeros; i++){
            int numeroRandom = r.nextInt(65);
            
            if(numeroRandom>17){
                System.out.println(numeroRandom);
            }
            else{
                nNumeros++;
            }
        }
    }
    
}
