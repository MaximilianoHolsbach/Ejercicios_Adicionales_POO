package principal_alumno;

public class Alumno {
    private String nombre;
    private double promedio;
    private static double nota_aprobacion = 6;
    
    //Constructor
    public Alumno(String nombre){
        setNombre(nombre);
        this.promedio = 0.0;
    }
    public Alumno(String nombre, double promedio){
        this.nombre = nombre;
        setActualizar_promedio(promedio);
    }
    private void setNombre(String nombre){
        try{
            if(nombre == null || nombre.trim().isEmpty()){
                throw new IllegalArgumentException("El nombre no puede estar vacio");
            }
            this.nombre = nombre;
        }catch(Exception e){
            System.out.println("Error al establecer el nombre del alumno");
        }
    }
    public void setActualizar_promedio(double promedio){
        try{
            if(promedio <= 0.0){
                throw new IllegalArgumentException("El promedio no puede ser menor o igual a cero");
            }
            this.promedio = promedio;
        }catch(Exception e){
            System.out.println("Error al actualizar promedio");
        }
    }
}
