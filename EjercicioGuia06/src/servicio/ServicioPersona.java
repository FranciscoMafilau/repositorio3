
package servicio;

import java.util.Scanner;
import persona.Persona;

public class ServicioPersona {
  
    
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
  
        System.out.println("Ingrese el nombre de la persona a crear");
        String nombre= leer.nextLine();
        System.out.println("Ingrese la edad");
        int edad= leer.nextInt();
        mostrar(nombre,edad);
        return new Persona();
        
  }
public void  mostrar(String nombre, int edad){
        System.out.println("Soy "+ nombre+ " y tengo "+ edad+ " años.");
    
    }
}
