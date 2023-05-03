
package service;

import java.util.Arrays;


public class ArregloService {
    /*
Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:



Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas
10 posiciones del arreglo B con 0.5.
*/
///Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
public void inicializarA(int []A){
for (int i = 0; i < A.length; i++) { 
            A[i] = (int) (Math.random() * 100);
}
}

////Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
public void mostrar(int []A){
    for (int i = 0; i < A.length; i++) {
        System.out.println(" [ " + A[i] + " ] ");
    }
}
/////Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
 public void ordenar(int []A){
     Arrays.sort(A);

     double [] arrayInvertido = new double [A.length];
	    for (int i = 0; i < A.length; i++) {
	    System.out.println(" [ " + A[i] + " ] ");
	    
     }
 

}
/*
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas
10 posiciones del arreglo B con 0.5.
*/
public void incializarB (int []B, int [] A){
    for (int i = 0; i < 10; i++) {
	B[i] = A[i];
}
   Arrays.fill(B, 10, B.length, 0) ; ////si lo convierto a double no da error

}
    
}