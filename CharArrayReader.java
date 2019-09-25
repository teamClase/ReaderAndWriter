/**
 * La clase CharArrayReader permite leer el contenido de un array de 
 * caracteres como una secuencia de caracteres
 * 
 * David Ruiz Hurtado
 */

package trabajo0;

import java.io.CharArrayReader;
import java.io.IOException;


public class main {

    public static void main(String[] args) {
        
        // Inicializamos el array de caracteres 
        char[] array = {'H', 'O', 'L', 'A'}; 
  
        // Creamos una instancia de CharArrayReader pasándole como parámetro el array 
        CharArrayReader c_a_reader1 = new CharArrayReader(array); 
        //CharArrayReader c_a_reader2 = new CharArrayReader(array); 
        
        try {
            /**
             * Uso del método ready() que comprueba si está listo para 
             * ser leido, aunque los CharArrayReader siempre lo están      
             */
            boolean ready1 = c_a_reader1.ready(); 
            if(ready1){ 
                System.out.println("c_a_reader1 está listo\n"); 
            } else{
                System.out.println("c_a_reader1 no está listo\n");
            }
           
            /**
             * Ahora, en este ejemplo, toca recorrer el array y mostrarlo en pantalla
             * Se necesita hacer un bucle 
             * Por lo que creo mi variable 'i'
             */
            int i = c_a_reader1.read();
            /**
             * Se le asigna como valor el primer carácter del CharArray con el método read()
             * Dicho método devuelve el primer carácter o el siguiente carácter de un CharArray
             * devolviendo un código ASCII que concuerda con el carácter correspondiente
             */
            
            /**
             * Mientras que 'i' no sea igual que -1, eso quiere decir que cuando el método read()
             * ha leído todos los carácteres de un CharArray devuelve un -1
             */
            while(i != -1) { 
                System.out.println((char) i); // Saco en pantalla el carácter, parseado a char
                
                /**
                 * Esto se hace para que pase al siguiente carácter
                 * Su funcionalidad es equivalente a un i++ en un for
                 */
                i = c_a_reader1.read(); 
            }
            
            // Cerramos el CharArray
            c_a_reader1.close();
            
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
        
        
    }
    
}


// https://www.geeksforgeeks.org/java-io-chararrayreader-class-java/