
package ejerciciocadena;

import entidades.CadenaEntidades;
import servicio.CadenaServicio;


public class CadenaMain {

    public static void main(String[] args) {
        CadenaServicio ej1 = new CadenaServicio();
        
        CadenaEntidades G9 = new CadenaEntidades ("casa blanca");
        
        System.out.println("La cantidad de vocales en la frase es= " + ej1.mostrarVocales(G9));  
        System.out.println("La frase invertida es= " + ej1.invertirFrase(G9));
        
        System.out.println("Ingrese el caracter a buscar en la frase");
        System.out.println("La letra ingresada se repite " + ej1.vecesRepetido(G9) + " veces en la frase.");
        
        System.out.println("La primersa frase contiene " + G9.getLongitud() + " digitos, y la segunda frase contiene " + ej1.compararLongitud(G9));
        
        System.out.println(ej1.unirFrases(G9));
        
        System.out.println(ej1.reemplazar(G9));
        
        System.out.println(ej1.contiene(G9));        
  
    }
    
}
    
