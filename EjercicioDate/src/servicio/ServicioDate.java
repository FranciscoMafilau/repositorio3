
package servicio;

import entidadesDate.EntidadesDate;
import java.util.Date;
import java.util.Scanner;




public class ServicioDate {
    /*


*/
    public Date fechaNacimiento(){
	/*
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
Luego los pase por parámetro a un nuevo objeto Date
*/
	Scanner leer = new Scanner(System.in);    

	System.out.println("Ingrese día de nacimiento= ");
	int dia = leer.nextInt();
	System.out.println("Ingrese mes de nacimiento= ");
	 int mes = leer.nextInt();
	System.out.println("Ingrese el año del nacimiento= ");
	int anio = leer.nextInt();
	return new Date(anio, mes, dia);////El método debe retornar el 
		///objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
}
public Date fechaActual(){///Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos 
		////el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
		///El método debe retornar el objeto Date.
    return new Date();
}
public int diferencia(Date fecha1, Date fecha2){////Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de
			           //// años entre una y otra (edad del usuario).

long diffInMillies = Math.abs( fecha1.getTime() - fecha2.getTime());
    System.out.println(diffInMillies);
    long diff = diffInMillies / (1000*60*60*24);
    System.out.println(diff);
  return (int) (diff/365);

}
}

