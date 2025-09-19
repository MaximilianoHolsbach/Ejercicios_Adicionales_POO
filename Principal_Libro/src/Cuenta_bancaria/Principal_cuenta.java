/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuenta_bancaria;

/**
 *
 * @author Maxi
 */
public class Principal_cuenta {
    public static void main(String[]args){
        Cuenta cuenta1 = new Cuenta("Lucía Fernández");
        Cuenta cuenta2 = new Cuenta("Carlos Méndez");
        Cuenta cuenta3 = new Cuenta("Ana Torres");
        Cuenta cuenta4 = new Cuenta("Mariano López", 1500.50);
        Cuenta cuenta5 = new Cuenta("Valeria Gómez", 320.75);
        Cuenta cuenta6 = new Cuenta("Esteban Ruiz", 0.0);
        
        //Imprimimos el estado actual de las cuentas
        System.out.println("");
        System.out.println("Imprimimos el estado actual de las cuentas");
        System.out.println("");
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
        System.out.println(cuenta4);
        System.out.println(cuenta5);
        System.out.println(cuenta6);
        
        //Imprimimos el total de cuentas
        System.out.println("");
        Cuenta.gettotal_cuentas();
        System.out.println("");
        
        //Consultamos los saldos
        System.out.println("");
        System.out.println("Imprimimos los saldos actuales de las cuentas en pesos");
        System.out.println("");
        cuenta1.getSaldo();
        cuenta2.getSaldo();
        cuenta3.getSaldo();
        cuenta4.getSaldo();
        cuenta5.getSaldo();
        cuenta6.getSaldo();
        
        //Consulta de saldos en dolares
        System.out.println("");
        System.out.println("Imprimimos los saldos actuales de las cuentas en dolares");
        System.out.println("");
        cuenta1.getSaldo(1515.0);
        cuenta2.getSaldo(1515.0);
        cuenta3.getSaldo(1515.0);
        cuenta4.getSaldo(1515.0);
        cuenta5.getSaldo(1515.0);
        cuenta6.getSaldo(1515.0);
        
        //Actualizamos saldos depositos y extracciones
        System.out.println("");
        System.out.println("Depositamos los saldos de las cuentas");
        System.out.println("");
        cuenta1.setDepositar(5500.00);
        System.out.println(cuenta1);
        System.out.println("");
        System.out.println("Extraemos dinero de las cuentas");
        System.out.println("");
        cuenta4.setExtraer(50.0);
        System.out.println(cuenta4);
        
        //Provamos los errores
        
        //Tratamos de crear una cuenta sin titular
        System.out.println("");
        System.out.println("Probamos errores al cargar");
        System.out.println("");
        Cuenta cuenta7 = new Cuenta("");
        System.out.println(cuenta7);
        cuenta7.setDepositar(-10);
        System.out.println("");
        System.out.println("Depositamos");
        System.out.println("");
        cuenta7.setDepositar(50.0);
        System.out.println("");
        System.out.println("Probamos extraer un monto mayor al saldo");
        System.out.println("");
        cuenta7.setExtraer(150.0);
    }
}
