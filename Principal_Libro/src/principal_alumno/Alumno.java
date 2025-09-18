package principal_alumno;

public class Alumno {
    private String nombre;
    private double promedio;
    private static double nota_aprobacion = 6.0;
    //Constructor
    public Alumno(String nombre){
        setNombre(nombre);
        this.promedio = 0.0;
    }
    public Alumno(String nombre, double promedio){
        this.nombre = nombre;
        setActualizar_promedio(promedio);
    }
    //Metodos
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
    public String getNombre(){
        return this.nombre;
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
    public void setActualizar_promedio(double[] promedio){
        double promedio_notas = 0.0;
        try{
            if(promedio.length <= 0){
                throw new IllegalArgumentException("El conjunto de notas no puede estar vacio");
            }
            for(int i = 0; i < promedio.length; i++){
                promedio_notas += promedio[i];
            }
            this.promedio = promedio_notas/promedio.length;
        }catch(Exception e){
            System.out.println("Error al actualizar promedio");
        }
    }
    public boolean getAprobo(){
        if(this.promedio < Alumno.nota_aprobacion){
            return true;
        }else{
            return false;
        }
    }
    //Metodos staticos 
    public static void setnota_aprobacion(double nota){
        Alumno.nota_aprobacion = nota;
    }
    public static double getnota_aprobacion(){
        return Alumno.nota_aprobacion;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", promedio=" + promedio + '}';
    }
    
}
