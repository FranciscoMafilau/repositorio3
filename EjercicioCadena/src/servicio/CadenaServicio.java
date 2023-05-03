
package servicio;

import entidades.CadenaEntidades;
import java.util.Scanner;



    public class CadenaServicio{
    
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public int mostrarVocales(CadenaEntidades frase) {
        
        int cont = 0;
        char[] vocal = new char[]{'a', 'e', 'i', 'o', 'u'};
        
        for (int i = 0; i < frase.getLongitud(); i++) {
            ///if (frase.getFrase().substring(i, i + 1).equals("a") || frase.getFrase().substring(i, i + 1).equals("e") || frase.getFrase().substring(i, i + 1).equals("i") || frase.getFrase().substring(i, i + 1).equals("o") || frase.getFrase().substring(i, i + 1).equals("u") )
            switch (frase.getFrase().substring(i, i + 1).toLowerCase()) {
                case "a":
                    cont++;
                    break;
                case "e":
                    cont++;
                    break;
                case "i":
                    cont++;
                    break;
                case "o":
                    cont++;
                    break;
                case "u":
                    cont++;
                    break;
            }
        }
	
        return cont;
    }
    
    public String invertirFrase(CadenaEntidades frase) {
        
        String invertido = "";
        
        for (int i = frase.getLongitud() - 1; i >= 0; i--) {
            invertido += frase.getFrase().charAt(i);    
        }
	
        return invertido;   
    }
    
    public int vecesRepetido(CadenaEntidades frase){
        
        String buscar;
        int contador = 0;
        
        //Se lee lo que ingresa el usuario
        buscar = read.next();
        
        for (int i = 0; i < frase.getLongitud(); i++){
            
            if (frase.getFrase().substring(i, i + 1).equals(buscar)){
                contador++;
            }
        }        
        
        return contador;
    }
    
    public int compararLongitud(CadenaEntidades frase){        
        
        System.out.println("Ingrese la segunda frase");
        String frase2 = read.next();
        
        int longitud2 = frase2.length();
        
        return longitud2;
        
    }
    
    public String unirFrases(CadenaEntidades frase){
        
        System.out.println("Ingrese la segunda frase a unir");
        String frase3 = read.next();
        
        String frase4 = frase.getFrase() .concat(" " + frase3);        
        
        return frase4;
    }
    
    public String reemplazar(CadenaEntidades frase){
        
        System.out.println("Ingrese la letra a utilizar para reemplazo");
        String letra = read.next();
        
        String palabraCambiada = frase.getFrase().replace("a", letra);
        
        return palabraCambiada;        
    }
    
    public boolean contiene(CadenaEntidades frase){
        
        boolean contador = false;
        
        System.out.println("Ingrese la letra a buscar cincidencia");
        String buscar = read.next();
        
        for (int i = 0; i < frase.getLongitud(); i++){
            
            if (frase.getFrase().substring(i, i + 1).equals(buscar)){
                contador = true;
            }
        }        
        return contador;
    }    
}


