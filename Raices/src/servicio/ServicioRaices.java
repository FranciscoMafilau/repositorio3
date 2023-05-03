
package servicio;

import entidades.Raices;
import java.util.Scanner;



public class ServicioRaices {
    
    /*
Método getDiscriminante(): devuelve el valor del discriminante (double). 
El discriminante tiene la siguiente fórmula: 
(b^2)-4*a*c
*/
    Scanner leer = new Scanner(System.in);
   

public Raices crearRaices(){

        System.out.println("ingrese un valor para el coeficiente a= ");
        double a= (leer.nextDouble());
        System.out.println("ingrese un valor para el coeficiente b= ");
        double b =(leer.nextDouble());
        System.out.println("ingrese un valor para el coeficiente c= ");
        double c =(leer.nextDouble());
        
        return new Raices(a,b,c);
}

public double getDistriminante(Raices p){

return (Math.pow(p.getB(), 2)) - 4 * p.getA() * p.getC() ;

}
/*
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante 
debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante 
debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una 
única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que 
tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en 
caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
*/

public boolean tieneRaices(Raices p){
    return getDistriminante(p)>0;
}

public boolean tieneRaiz(Raices p){
    return getDistriminante(p)==0;
}

public void obtenerRaices(Raices p){
double r1 =   (-(p.getB())- Math.sqrt((Math.pow(p.getB(),2))-4*p.getA()*p.getC()))/(2*p.getA());
double r2 =   (-(p.getB())+ Math.sqrt((Math.pow(p.getB(),2))-4*p.getA()*p.getC()))/(2*p.getA());

if(tieneRaices(p)){
    System.out.println("las raíces son :" + r1 + " /// " + r2);

}
}
public void obtenerRaiz(Raices p){
double r1=   -(p.getB()) / (2*p.getA());
if(tieneRaiz(p)){
    System.out.println("las raíz es : " + r1);
}
}

public void calcularRaiz(Raices p){
if (tieneRaiz(p)){
    obtenerRaiz(p);
}else if(tieneRaices(p)){
    obtenerRaices(p);
}else{
    System.out.println("no tiene raíz");
}
}
}

  


