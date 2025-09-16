package principal_libro;


public class Libro {
    private String titulo;
    private String autor;
    static String editorial = "Independiente";
    
    /**
     * Requerimientos
     * 1-Utilizar this en los constructores
     * 2-Encapsulamiento:
     * Los atributos deben ser private. 
     * Los metodos get y set deben ser public, 
     * exceptos los que no pueden ser alterados desde afuera de la clase.
     * 3-Constructores sobrecargados:
     * a-titulo y autor.
     * b-titulo, autor, y editorial
     * 4-Metodos sobrecargados:
     * a-Uno que reciba solo el nuevo titulo.
     * b-Otro que reciba un prefijo y un nuevo titulo, generando:
     * prefijo + " " +nuevo titulo
     * 5-Metodo estatico Cambiar_editorial(String nueva): 
     * modifica la editorial comun a todos los libros. 
     * 6-Metodo toString(): mostrar titulo, autor, editorial
     * 
     * Tareas
     * 1-Crear libros con y sin editorial explicita.
     * 2-Usar las dos variantes de actualizar titulo.
     * 3-Mostrar los libros con toString().
     * 4-Cambiar la editorial global y volver a mostrar.
     * */
    
    //Constructores
    
    public Libro(String titulo, String autor){
        setTitulo(titulo);
        setAutor(autor);
        Libro.editorial();
    }
    public Libro(String titulo, String autor, String editorial){
        setTitulo(titulo);
        setAutor(autor);
        Libro.editorial(editorial);
    }
    
    //Metodos
    private void setTitulo(String titulo) {
        if(titulo != ""){
            this.titulo = titulo;
        }else{
            this.titulo = "Desconocido";
        }
        
    }
    private void setAutor(String autor) {
        if(autor != ""){
            this.autor = autor;
        }else{
            this.autor = "Desconocido";
        }
    }
    public void setEditorial(String nueva_editorial){
        try {
            if(nueva_editorial == null || nueva_editorial.trim().isEmpty()){
                throw new IllegalArgumentException("La editorial no puede estar vacia");
            }
            Libro.editorial = nueva_editorial;
        } catch (Exception e) {
            System.out.println("Error al establecer la editorial: " + e.getMessage());
        }
    }
    //Metodos sobrecargados
    public static String editorial(String editorial){
        return Libro.editorial = editorial;
    }
    public static String editorial(){
        return Libro.editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "\nTitulo = " + titulo + "\nAutor = " + autor +"\nEditorial = "+editorial+ '}';
    }
    
}
