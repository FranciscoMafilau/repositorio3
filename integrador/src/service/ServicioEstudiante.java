package service;

import entidades.Estudiante;
import java.util.Scanner;

public class ServicioEstudiante {

    private final Scanner leer = new Scanner(System.in);

    public Estudiante crearEstudiante() {
	/*crear un objeto de tipo Estudiante, sus atributos
van a ser nombre y nota (representando la nota obtenida en el final).
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
estudiantes con sus respectivas notas.
	 */
	System.out.println("Ingrese el nombre del estudiante");
	String nombre = leer.next();
	System.out.println("Ingrese la nota final");
	double nota = leer.nextDouble();
	while (nota>10 || nota < 1){
	    System.out.println("La nota ingresada no es valida, ingrese otra nota:");
	    nota = leer.nextInt();
}
	return new Estudiante(nombre, nota);
    }

    public void promedio(Estudiante[] curso) {
	String[] auxArray = new String[8];
	double promedio = 0;

	for (int i = 0; i < curso.length; i++) {
	    curso[i] = crearEstudiante(); ////llamo a crearEstudiante para obtener notas en el array

	    promedio += curso[i].getNota(); 

	    auxArray[i] = " ";

	}
	promedio = promedio / 8;
	System.out.println("*******************************");
	System.out.println("El promedio del curso es: " + promedio);
	System.out.println("*******************************");
	System.out.println("Los alumnos con una nota superior al promedio son: ");
	for (int i = 0; i < auxArray.length; i++) {
	    if (curso[i].getNota() > promedio) {
		auxArray[i] = curso[i].getNombre();

		System.out.print(auxArray[i] + "\n ");
	    }

	}

    }

    public void mostrar(Estudiante[] curso) {

	for (int i = 0; i < curso.length; i++) {
	    System.out.print(" [ " + curso[i].getNombre() + " ] " + " [ " + curso[i].getNota() + " ] ");
	}
	System.out.println(" ");
    }
}
