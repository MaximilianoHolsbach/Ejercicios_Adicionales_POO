/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal_alumno;

/**
 *
 * @author Maxi
 */
public class Principal_Alumno {
    public static void main(String[]args){
        Alumno alumno1 = new Alumno("Valentina");
        Alumno alumno2 = new Alumno("Tomás");
        Alumno alumno3 = new Alumno("Lucía");
        Alumno alumno4 = new Alumno("Martín", 8.5);
        Alumno alumno5 = new Alumno("Sofía", 9.2);
        Alumno alumno6 = new Alumno("Julián", 7.8);
        
        //Generamos los arrays de notas para los alumnos
        
        double[] notas1 = {7.5, 8.0, 6.5, 9.0, 7.0, 8.5, 6.0, 7.8, 8.2, 7.1}; // Perfil equilibrado
        double[] notas2 = {4.0, 5.5, 6.0, 4.5, 5.0, 6.2, 5.8, 4.9, 5.3, 6.1}; // Perfil en riesgo
        double[] notas3 = {9.5, 9.8, 10.0, 9.7, 9.6, 9.9, 10.0, 9.8, 9.7, 9.9}; // Perfil destacado
        double[] notas4 = {6.0, 7.0, 8.0, 5.0, 6.5, 7.5, 8.5, 5.5, 6.8, 7.2}; // Perfil mixto
        double[] notas5 = {3.0, 2.5, 4.0, 3.5, 2.8, 3.2, 4.1, 3.9, 2.7, 3.3}; // Perfil crítico
        double[] notas6 = {8.0, 7.5, 8.5, 9.0, 7.8, 8.2, 9.1, 8.7, 7.9, 8.3}; // Perfil ascendente
        double[] notas7 = {}; // Pruebas
        
        //Generamos las pruebas para los metodos actualizar promedio
        
        alumno1.setActualizar_promedio(notas1);
        System.out.println(alumno1);
        alumno2.setActualizar_promedio(4.0);
        System.out.println(alumno2);
        alumno3.setActualizar_promedio(notas7);//Se utliza este alumno para realizar pruebas
        
        //Generamos las pruebas para el metodo aprobar
        
        String mensaje = alumno2.getAprobo()?"El alumno "+alumno2.getNombre()+" no aprobo":"El alumno "+alumno2.getNombre()+" aprobo";
        System.out.println(mensaje);
        
        //Generamos las pruebas para el metodo aprobar con el promedio obtenido desde array
        
        mensaje = alumno1.getAprobo()?"El alumno "+alumno1.getNombre()+" no aprobo":"El alumno "+alumno1.getNombre()+" aprobo";
        System.out.println(mensaje);
        
        //Actualizamos la nota de probación, y la imprimimos por pantalla
        System.out.println("La nota de aprobación actual es: "+Alumno.getnota_aprobacion());
        Alumno.setnota_aprobacion(8.0);
        System.out.println("La nota de aprobación actualizada es: "+Alumno.getnota_aprobacion());
    }
}
