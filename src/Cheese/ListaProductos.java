/*
 * Examen Entornos de desarrollo - Enunciado
 */

package Cheese;
/**
 * Imports del paquete
 */

import java.util.ArrayList;
import java.util.HashMap;


public class ListaProductos {

    /**
     * Estructura HashMap para almacenar los productos de la lista de productos
     * @see "HashMap java doc"
     */
    private HashMap<String, Producto> listaP = new HashMap();
    
    /**
     * Cuenta calculada con el número de productos contenidos en la lista
     */
    private static int n = 0;


    
    private int getN() {
        return n;
    }

    private void setN(int n) {
        this.n = n;
    }
    /**
     * Comprueba si la cadena pasada es valida ( no está vacía)
     * @param campo cadena a analizar
     * @return True: Cadena vacía, False: Cadena correcta
     */
    private boolean check_null(String campo){
    
        if (campo.replace(" ","") == "")  return true; else return false;
    }
    /**
     * 
     * @param prod Introducimos el producto 
     * @return Nos devuelve el nombre del producto
     */

    public Producto addProducto(Producto prod) {
        
        if(prod.getcode() == null){
        return null;
        }
        else{
        
        if (listaP.containsKey(prod.getcode())) {
            // System.out.println("Producto con código duplicado");
            return null;
        }
        n++;
        this.setN(n);
        listaP.put(prod.getcode(), prod);
        return prod;
        }
    }
    /**
     * 
     * @param codigo Introducimos el String del codigo que queremos eliminar
     * @return eL producto eliminado
     */

    public Producto eliminarProducto(String codigo) { 
        
        if(codigo == null){
        return null;
        }

        
        Producto prod = buscarProducto(codigo);
        if (prod != null) {
        listaP.remove(codigo);
        n--;
        this.setN(n);
        }
        return prod;
    }
    /**
     * 
     * @param codigo Introducimos el String del codigo que queremos buscar
     * @return Si enceuntra el codigo nos devuelve el producto, si no, nos 
     * devuelve el codigo.
     */

    public Producto buscarProducto(String codigo) { 
        Producto prod = null;
        
        if(codigo == null){
        return null;
        }
        
        if (!listaP.containsKey(codigo)) {
            return prod;
        }
        else{
            return listaP.get(codigo);
        }
    }
    /**
     * 
     * @return Te devuelve la lista de productos
     */

    public ArrayList<Producto> getProductos() {
        ArrayList<Producto> prodsList = new ArrayList<>();
        prodsList.addAll(listaP.values());
        return prodsList;
    }
    
    /**
     * 
     * @return El numero de productos
     */
    public int totalProductos(){
            return this.getN();
    }
}
