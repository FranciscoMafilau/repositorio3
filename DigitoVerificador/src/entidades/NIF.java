package entidades;

public class NIF {
    /*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su correspondiente letra (NIF).
 Los atributos serán el número de DNI (entero largo) y la letra (String o char) que le corresponde. 

     */
private int DNI;
private char letra;

    public NIF() {
    }

    public NIF(int DNI, char letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

  

}
