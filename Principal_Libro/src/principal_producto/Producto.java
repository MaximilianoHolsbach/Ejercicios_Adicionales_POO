package principal_producto;
//Inventario producto con iva
public class Producto {
    private String nombre;
    private double precio_base;
    private static double iva = 0.21;

    //Constructores
    public Producto(String nombre,double precio_base){
        setNombre(nombre);
        setPrecio_base(precio_base);
    }
    //Recargado
    public Producto(String nombre){
        setNombre(nombre);
        this.precio_base = 0.0;
    }
    //Metodo
    public double setAplicar_Descuento(double porcentaje){
        try {
            if(porcentaje == 0.0){
                throw new IllegalArgumentException("El porcentaje ingresado no puede ser cero");
            }
            this.precio_base = this.precio_base - (this.precio_base * porcentaje);
            return this.precio_base;
        } catch (Exception e) {
            System.out.println("Error al establecer el descuento");
            return 100;
        }
    }
    public void setCalcular_precio_final(){
        this.precio_base *= (1 + Producto.iva);
    }
    public static void setCambiar_iva(double nuevo_iva){
        try {
            if(nuevo_iva <= 0.0){
                throw new IllegalArgumentException("El valor del iva no puede ser menor o igual a cero");
            }
            Producto.iva = nuevo_iva;
        } catch (Exception e) {
            System.out.println("Error al actualizar el iva");
        }
    }

    @Override
    public String toString() {
        return "Producto{" + "\nNombre = " + nombre + "\nPrecio base = " + precio_base +'}';
    }
    
    //Metodo recargado
    public double setAplicar_Descuento(double porcentaje, double precio_minimo){
        try {
            if(porcentaje <= 0.0 || precio_minimo == 0.0){
                throw new IllegalArgumentException("Los valores solicitados no pueden ser menores o igual a cero");
            }
            if(setAplicar_Descuento(porcentaje) > precio_minimo){
                this.precio_base = setAplicar_Descuento(porcentaje);
                return this.precio_base;
            }
            this.precio_base = precio_minimo;
            return this.precio_base;
        } catch (Exception e) {
            System.out.println("Error al aplicar descuento");
            return this.precio_base;
        }
    }
    //Metodo privados
    private void setNombre(String nombre){
        try {
            if(nombre == null || nombre.trim().isEmpty()){
                throw new IllegalArgumentException("El nombre del producto no puede estar vacio");
            }
            this.nombre = nombre;
        } catch (Exception e) {
            System.out.println("Error al establecer nombre del producto");
        }
    }
    private void setPrecio_base(double precio){
        try {
            if(precio <= 0.0){
                throw new IllegalArgumentException("El precio del producto no puede ser menor o igual a cero");
            }
            this.precio_base = precio;
        } catch (Exception e) {
            System.out.println("Error al establecer precio del producto");
        }
    }
}
