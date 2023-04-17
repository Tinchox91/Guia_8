
package Principal;

import NifServicio.NifServicio;


public class Principal {

  
    public static void main(String[] args) {
     NifServicio serv = new NifServicio();
     serv.crearNif();
     serv.mostrar();
    }
    
}
