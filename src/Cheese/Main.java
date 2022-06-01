/*
*	grupo  :1ºGDAM
*	alumno :Rodrigo Morales
*	n.exp. :7243
*	fecha  :01/06/2022
 */
package Cheese;

/**
 *
 * @author ___
 */
public class Main {
    
     public static void main(String[] args) {
        String cod1 = "001";
         Producto prod1 = new Producto(cod1, "semidesnatada", 2, 1.2);
         System.out.println(prod1);
         
         String cod2 = "002";        
         Producto prod2 = new Producto(cod2, "Sin lactosa", 3, 1.2);
         System.out.println(prod2);
    
         System.out.println("1º Gdam: Entornos de desarrollo");
    }
}
