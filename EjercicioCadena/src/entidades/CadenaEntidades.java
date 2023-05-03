
package entidades;



    public class CadenaEntidades {
    private String frase; 
    private int longitud;

    public CadenaEntidades() {
    }

    public CadenaEntidades(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
}

//public class CadenaEntidades {
//    
//    /* Orden:
//    1.- Atributos
//    2.- Constructores
//    3.- Setter
//    4.- Getter
//    5.- Metodos funcionales o Funciones
//    6.- ToStrings
//    
//    */
//    
//    //Guia 9 ejercicio 1
//    
//    //Atributos
//    
//    private String frase;
//    private int longitud;
//    
//    public CadenaEntidades(){
//        
//    }
//    
//    public CadenaEntidades(String frase){
//        this.longitud = frase.length();
//    }
//    
//    //Setters
//
//    public void setFrase(String frase) {
//        this.frase = frase;
//    }
//
//    public void setLongitud(int longitud) {
//        this.longitud = longitud;
//    }
//    
//    //Getters
//
//    public String getFrase() {
//        return frase;
//    }
//
//    public int getLongitud() {
//        return longitud;
//    }
//
//    @Override
//    public String toString() {
//        return "CadenaEntidades{" + "frase=" + frase + ", longitud=" + longitud + '}';
//    }
//    
//    
//    
//}

