
package servicio;

import entidad.Fraccion;
import java.util.Scanner;


public class ServicioFraccion {
    

public Fraccion crearFraccion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numerador de la primera fraccion, y luego el denominador");
        int n1 = leer.nextInt();
        int d1 = leer.nextInt();
        System.out.println("Ahora ingrese el numerador de la segunda fraccion, y luego el denominador");
        int n2 = leer.nextInt();
        int d2 = leer.nextInt();
        System.out.println("Las fracciones son: "+n1+"/"+d1+" y "+n2+"/"+d2+".");
        return new Fraccion(n1, n2, d1, d2);      
    }
    
     public String suma(Fraccion f){
       if (f.getD1()== 0 || f.getD2()== 0){
           return "No se puede fraccionar en cero, la suma es indefinida";
       }else if(f.getD1()== f.getD2()){
           return "La suma da "+(f.getD1()+f.getN2())+"/"+f.getD1();
       }else{
         return "La suma da "+((f.getN1()*f.getD2())+(f.getD2()*f.getD1()))+"/"+(f.getD1()*f.getD2());  
       }
    }
    
     public String resta(Fraccion f){
       if (f.getD1()== 0 || f.getD2()== 0){
           return "No se puede fraccionar en cero, la resta es indefinida";
       }else if(f.getD1()== f.getD2()){
           return "La resta da "+(f.getN1()-f.getN2())+"/"+f.getD1();
       }else{
         return "La resta da "+((f.getN1()*f.getD2())-(f.getN2()*f.getD1()))+"/"+(f.getD1()*f.getD2());  
       }
    }
     
     public String multiplicacion(Fraccion f){
        if (f.getD1()== 0 || f.getD2()== 0){
           return "No se puede fraccionar en cero, la multiplicacion es indefinida";
       }else{
            return "La multiplicacion da "+(f.getN1()*f.getN2())+"/"+(f.getD1()*f.getD2());
        }
     }
     
     public String division(Fraccion f){
         if (f.getD1()== 0 || f.getD2()== 0){
           return "No se puede fraccionar en cero, la division es indefinida";
       }else{
            return "La division da "+(f.getN1()*f.getD2())+"/"+(f.getD1()*f.getN2());
        } 
     }
     
     public void menu(Fraccion f){
         int opc = 0;
         do{
         Scanner leer = new Scanner(System.in);
         System.out.println("");
         System.out.println("Menu");
         System.out.println("");
         System.out.println("Seleccione la opcion deseada");
         System.out.println("");
         System.out.println("1. Suma");
         System.out.println("2. Resta");
         System.out.println("3. Multiplicacion");
         System.out.println("4. Division");
         System.out.println("5. Salir");
         System.out.println("");
         opc = leer.nextInt();
         while (opc<1 || opc>5){
             System.out.println("Ingreso invalido, intentelo nuevamente");
             opc = leer.nextInt();
         }
         switch (opc){
             case 1:
                 System.out.println(suma(f));
                 break;
             case 2:
                 System.out.println(resta(f));
                 break;
             case 3:
                 System.out.println(multiplicacion(f));
                 break;
             case 4:
                 System.out.println(division(f));
                 break;
             default:
                 System.out.println("Saliendo...");
         }
         }while (opc != 5);
     }
}
