
package principal_libro;

public class Principal_Libro {
    public static void main(String[] args) {
        //Sin editorial especificada
        Libro libro1 = new Libro("El arte de modelar datos", "Ana Méndez");
        Libro libro2 = new Libro("Scrum en acción", "Laura Pineda");
        //Con editorial especificada
        Libro libro3 = new Libro("Jazz y narrativa emocional", "Andrés Salvatierra");
        Libro libro4 = new Libro("Visualización inclusiva", "Diego Torres","Ediciones Claras");
        
        //Imprimimos con metodos toString()
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
        
        //Cambiamos editorial
        libro1.setEditorial("Editorial Sonora");
        System.out.println(libro1);
        
        //Agregamos prefijo
        System.out.println("Agregamos prefijo al titulo");
        libro1.setActualizar_titulo("Edición Conmemorativa", "El arte de modelar datos");
        System.out.println("");
        System.out.println(libro1);
    }
}
