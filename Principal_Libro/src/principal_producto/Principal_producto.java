/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal_producto;

/**
 *
 * @author Maxi
 */
public class Principal_producto {
    public static void main(String[]args){
        Producto producto1 = new Producto("Zapatillas Urbanas", 8500.00);
        Producto producto2 = new Producto("Botines de Cuero", 12500.50);
        Producto producto3 = new Producto("Sandalias Livianas", 4300.75);
        Producto producto4 = new Producto("Ojotas Playeras");
        Producto producto5 = new Producto("Zapatos de Gala");
        Producto producto6 = new Producto("Pantuflas de Invierno");
        
        System.out.println("Imprimimos los productos");
        System.out.println("");
        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
        System.out.println(producto4);
        System.out.println(producto5);
        System.out.println(producto6);
    }
}
