
package service;

import entidades.AhorcadoEntidades;
import java.util.Scanner;

public class AhorcadoService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /*
Definir los siguientes métodos en AhorcadoService:
//Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del 
usuario, pone la longitud de la palabra, como la longitud del vector. Después ingresa la palabra en el vector,
 letra por letra, quedando cada letra de la palabra en un índice del vector. Y también, guarda la cantidad de 
jugadas máximas y el valor que ingresó el usuario.
//

/
//Método intentos(): para mostrar cuántas oportunidades le queda al jugador.

     */
    public AhorcadoEntidades crearJuego() {

	System.out.println("Ingrese una palabra= ");
	String palabra = leer.nextLine();
	System.out.println("Ingrese cantidad de intentos=");
	int cantidadJugadas = leer.nextInt();
	char[] letras = new char[palabra.length()];
	rellenarArreglo(letras, palabra);

	return new AhorcadoEntidades(letras, cantidadJugadas);
    }

    public void rellenarArreglo(char[] letras, String palabra) {
	for (int i = 0; i < palabra.length(); i++) {
	    letras[i] = palabra.substring(i, i + 1).charAt(0);
	}
    }
///Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el 
///vector.length.

    public void longitud(AhorcadoEntidades ahorcado) {
	System.out.println("La longitud es: " + ahorcado.getPalabra().length);
    }
//Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte
    //de la palabra o no. También informará si la letra estaba o no.

    public void buscar(AhorcadoEntidades ahorcado, char letra) {
	int cont = 0;
	for (int i = 0; i < ahorcado.getPalabra().length; i++) {
	    if (letra == ahorcado.getPalabra()[i]) {
		cont++;
	    }
	}
	if (cont == 0) {
	    intentos(ahorcado);
	    System.out.println("no se encontró la letra.");
	} else {
	    System.out.println("la letra fue encontrada " + cont + " veces");
	    ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + cont);
	}
	System.out.println("la cantidad de letras entradades es " + ahorcado.getLetrasEncontradas());
	System.out.println("faltan encotrar " + (ahorcado.getPalabra().length - ahorcado.getLetrasEncontradas()));
    }

    public void intentos(AhorcadoEntidades ahorcado) {
	ahorcado.setCantidadJugadas(ahorcado.getCantidadJugadas() - 1);
	System.out.println("le  quedan " + ahorcado.getCantidadJugadas() + " intentos.");
    }

//Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e 
//informará cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.
    public void juego(AhorcadoEntidades ahorcado) {
	boolean termino = false;
	do {
	    System.out.println("Ingrese una letra= ");
	    char letra = leer.next().charAt(0);
	    buscar(ahorcado, letra);
	    if (ahorcado.getPalabra().length == ahorcado.getLetrasEncontradas()) {
		termino = true;
	    }
	} while (!termino && ahorcado.getCantidadJugadas() > 0);
    }

}

