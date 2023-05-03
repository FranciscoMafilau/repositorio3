
package fraccion;

import servicio.ServicioFraccion;


public class Fraccion {

   
    public static void main(String[] args) {
       
        ServicioFraccion sf = new ServicioFraccion();
        entidad.Fraccion f1 = sf.crearFraccion();

        sf.menu(f1);
    }
    
}
