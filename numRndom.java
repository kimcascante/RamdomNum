package Semana3;

/**
 * Nombre del programa: 
 * Descripcion: El director de la película “Titanic” está pensando en volver a filmar el final. Para ello
    desea dejar el final de la película al azar y le pide a usted que haga un programa que
    genere un número entre uno y diez al azar y, si el número es mayor o igual a 9, debe
    imprimir “Jack muere al final”, y si no, “Rose muere al final”
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Random;

public class ejp3w3 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{
      
      String resultado;
      Random r = new Random();
      int azar = r.nextInt(11);

      escribir.println(azar);

      if (azar >= 9){
         resultado = "Jack muere al final";
      } else {
         resultado = "Rose muere al final";
      }

      escribir.println(resultado);

      //Random random = new Random();
      //int num = random.nextInt(3)+1;

      //escribir.println("Opcion: " +num);

     }
}