
package MainPersona;

import Entidad.Persona;
import Servicios.ServicioPersona;
import java.util.Scanner;


public class MainPersona {
    public  Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        
        Persona[] p = new Persona[4];
        boolean [] mayor = new boolean [4];
        int [] imc = new int [4];
        ServicioPersona serv = new ServicioPersona();
        for (int i =0; i< 4 ;i++){
           p[i]= serv.crearPersona();
           
           // p[i] = new Persona();
            //p[i]=p1;
            mayor[i]= serv.esMayorDeEdad(p[i].getEdad());
            imc[i] =serv.calcularIMC(p[i].getPeso(),p[i].getAltura());
            
            System.out.println(p[i].getEdad()); 
            System.out.println(p[i].getPeso());
          
}
        for (int i=0;i<4;i++){
            
            if (mayor[i]==true){
                System.out.println(p[i].getNombre()+" es mayor de edad");
                
            }else System.out.println(p[i].getNombre()+" es menor de edad");
            if (imc[i]==-1){
                System.out.println(p[i].getNombre()+" esta por debajo de su peso ideal");
                
            }
            if (imc[i]==0){
                System.out.println(p[i].getNombre()+" esta en su peso ideal");
                
            }
            if (imc[i]==1){
                System.out.println(p[i].getNombre()+" esta por encima de su peso ideal");
                
            }
            System.out.println("---------------  ");
            
        }
        
        
        
    }   
        
    }
    

