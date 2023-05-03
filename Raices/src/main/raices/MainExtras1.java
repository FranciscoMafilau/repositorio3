
package main.raices;

import entidades.Raices;
import servicio.ServicioRaices;


public class MainExtras1 {


    public static void main(String[] args) {
             ServicioRaices sr = new ServicioRaices();
             Raices p = sr.crearRaices();

             sr.calcularRaiz(p);
          

    }
}
