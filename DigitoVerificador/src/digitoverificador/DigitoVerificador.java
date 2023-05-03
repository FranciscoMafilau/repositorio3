
package digitoverificador;

import entidades.NIF;
import servicio.DigitoServicio;


public class DigitoVerificador {

  
    public static void main(String[] args) {
        DigitoServicio serv = new DigitoServicio();
        NIF n1 = serv.crearNif() ;

serv.crearNif();
serv.mostrarNif(n1);
        
    }
    
}
