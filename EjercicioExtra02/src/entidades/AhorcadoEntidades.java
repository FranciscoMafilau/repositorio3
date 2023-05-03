
package entidades;

public class AhorcadoEntidades {

    /*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, 
un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas que 
puede realizar el usuario.
     */
    private char[] palabra;
    private int letrasEncontradas;
    private int cantidadJugadas;

    public AhorcadoEntidades() {
    }

    public AhorcadoEntidades(char[] palabra, int cantidadJugadas) {
	this.palabra = palabra;

	this.cantidadJugadas = cantidadJugadas;
    }

    public char[] getPalabra() {
	return palabra;
    }

    public void setPalabra(char[] palabra) {
	this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
	return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
	this.letrasEncontradas = letrasEncontradas;
    }

    public int getCantidadJugadas() {
	return cantidadJugadas;
    }

    public void setCantidadJugadas(int cantidadJugadas) {
	this.cantidadJugadas = cantidadJugadas;
    }

}
