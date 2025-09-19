/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuenta_bancaria;

/**
 *
 * @author Maxi
 */
public class Cuenta {
    private int numero;
    private String titular;
    private double saldo;
    private static int ultimo_numero = 100;
    private static int total_cuentas;
    
    //Constructores
    
    public Cuenta(String titular){
        this.numero = Cuenta.ultimo_numero + Cuenta.total_cuentas ++;
        setNombre(titular);
        this.saldo = 0.0;
    }
    public Cuenta(String titular, double saldo){
        this.numero = Cuenta.ultimo_numero + Cuenta.total_cuentas ++;
        setNombre(titular);
        setDepositar(saldo);
    }
    
    //Metodos
    private void setNombre(String titular){
        try {
            if(titular == null || titular.trim().isEmpty()){
            throw new IllegalArgumentException("No se puede ingresar un titular vacio se asginara uno automatico");
        }
        this.titular = titular;
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
            this.titular = this.numero+"-"+"sin_nombre";  
        }
    }
    public void getSaldo(){
        System.out.println("Su saldo actual es: "+this.saldo+" pesos");
    }
    public void getSaldo(double cotizacion_dolar){
        double saldo_en_dolares = this.saldo / cotizacion_dolar;
        System.out.println("Su saldo actual es: "+saldo_en_dolares+" dolares");
    }
    public void setDepositar(double monto){
        this.saldo += validar_monto(monto);
    }
    public void setExtraer(double monto){
        try {
            if(monto > this.saldo){
                throw new IllegalArgumentException("El monto ingresado no puede ser mayor al saldo actual");
            }
            this.saldo -= validar_monto(monto);
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    public static void gettotal_cuentas(){
        System.out.println("El total de cuentas actual es: "+Cuenta.total_cuentas);
    } 
    //Metodos privados
    private double validar_monto(double monto){
        try {
            if(monto < 0.0){
                throw new IllegalArgumentException("El monto ingresado no puede ser menor a cero");
            }
            return monto; 
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
            return 0.0;
        } 
    }
    @Override
    public String toString() {
        return "Cuenta{" + "\nNumero = " + numero + "\nTitular = " + titular + "\nSaldo = " + saldo + '}';
    }
    
}
