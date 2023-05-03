
package main.servicios;

import java.util.Scanner;
import main.entidades.CuentaBancaria;

/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: 
numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, 
getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la
cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

*/
public class CuentaBancariaServicio {
   private static final Scanner leer = new Scanner(System.in); 
   

public CuentaBancaria crearCuenta(){
    
    System.out.println("Ingrese número de cuenta= ");
    int numCuenta = leer.nextInt();
    System.out.println("Ingrese DNI = ");
    long dniCliente = leer.nextLong();
    System.out.println("Ingresar Saldo Actual= ");
    int saldoActual = leer.nextInt();
    
    
     return new CuentaBancaria (numCuenta,  dniCliente,  saldoActual); ////no es necesario definir y guardar
      
    
    
}
///Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.///
public static void ingresar(CuentaBancaria c1) {
        
        System.out.println("ingrese un monto= ");
        double ingreso = leer.nextInt();
        c1.setSaldoActual(c1.getSaldoActual() + ingreso);
        System.out.println("Su saldo actual es = " + c1.getSaldoActual());

    }
public static void retirar(CuentaBancaria c1) {
       
        System.out.println("ingrese un monto a retirar= ");
        double egreso = leer.nextInt();
        
        
        if(egreso > c1.getSaldoActual()){
            System.out.println("No tiene liquidez en su cuenta.-");
        }else{
            c1.setSaldoActual(c1.getSaldoActual() - egreso);
            System.out.println("Retiro exitoso. Su saldo actual es =  " + c1.getSaldoActual());
            
        }
        
}///Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
public static void extraccionRapida(CuentaBancaria c1){
    System.out.println("Extración Rápida.");
    c1.setSaldoActual(c1.getSaldoActual() - (c1.getSaldoActual() *0.20)  );
    System.out.println("Ud. ha retirado = " +  c1.getSaldoActual() *0.20 + "su saldo actual es = " + c1.getSaldoActual());
    
    /*
public void extraccionRapida(CuentaBancaria cb){  
        System.out.println("\nIngrese el monto a retirar (Máximo 20% del saldo actual): ");
        float monto = leer.nextFloat();
        if(monto>(cb.getSaldoActual()*0.2)){
            System.out.println("\nNo se pudo realizar la extracción.");
        } else {
            System.out.println("Extracción existosa. Se retirarán " + monto + " de la cuenta.");
            cb.setSaldoActual(cb.getSaldoActual()-monto);
        }
        mostrarSaldoActual(cb);
    }
*/
}

///Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
public static void consultarSaldo(CuentaBancaria c1){
    System.out.println("Su saldo actual es = " + c1.getSaldoActual());
}

///Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
public static void mostrarDatos(CuentaBancaria c1){
    System.out.println("El número de cuenta es = " + c1.getNumCuenta());
    System.out.println("El DNI del cliente es = " + c1.getDniCliente());
    
}
}
  
