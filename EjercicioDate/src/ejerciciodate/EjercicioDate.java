
package ejerciciodate;

import entidadesDate.EntidadesDate;
import java.util.Date;
import servicio.ServicioDate;


public class EjercicioDate {
/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService
, en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el 
objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos 
el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de
 años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion Oracle
*/
  
    public static void main(String[] args) {
	ServicioDate fecha = new ServicioDate();
	Date fechaNacimiento = fecha.fechaNacimiento();
	System.out.println(fechaNacimiento);
	Date fechaActual = fecha.fechaActual();
	System.out.println(fechaActual);
	int diferencia = fecha.diferencia(fechaNacimiento, fechaActual);
	System.out.println("La diferencia de años entre las dos fecha es: "+diferencia);

    }
    
}
