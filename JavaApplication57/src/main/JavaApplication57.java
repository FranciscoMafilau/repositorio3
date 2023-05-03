
package main;

import main.entidades.CuentaBancaria;
import main.servicios.CuentaBancariaServicio;


public class JavaApplication57 {

    public static void main(String[] args) {
 
        CuentaBancariaServicio o1 = new CuentaBancariaServicio();
        CuentaBancaria a1 = o1.crearCuenta();
        CuentaBancariaServicio.ingresar(a1);
      
        CuentaBancariaServicio.retirar(a1);
        
       
     
        CuentaBancariaServicio.extraccionRapida(a1);
        
        System.out.println("*************************");
        CuentaBancariaServicio.consultarSaldo(a1);
        System.out.println("**************************");
        CuentaBancariaServicio.mostrarDatos(a1);
        
       
    }
    
}
