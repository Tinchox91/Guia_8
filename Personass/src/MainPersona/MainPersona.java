
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
        int mayores=0;
        int menores=0;
        int bajop=0;
        int idealp=0;
        int altop=0;
        for (int i = 0; i < 4; i++) {
            p[i] = serv.crearPersona();

            mayor[i] = serv.esMayorDeEdad(p[i].getEdad());
            imc[i] = serv.calcularIMC(p[i].getPeso(), p[i].getAltura());
            if (mayor[i]==true){
                mayores++;
              
            }else {
              menores ++;  
            }
            if (imc[i]==-1){
             bajop++;   
            }else if (imc[i]==0){
                idealp++;
                
            }else if (imc[i]==1) {
                altop++;
                
            }
         
            // System.out.println(p[i].getEdad());

            //System.out.println(p[i].getPeso());

        }
        mayores= mayores / 4;
         menores=menores/4;
         bajop=bajop/4;
         idealp=idealp/4;
       altop=altop/4;
        for (int i = 0; i < 4; i++) {
            
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
        
        System.out.println("el promedio de mayores es "+mayores);
        System.out.println("el promedio de menores es "+menores);
        System.out.println("el promedio de bajo peso es "+bajop);
        System.out.println("el promdedio de peso ideal es "+idealp);
        System.out.println("el promedio de sobrepeso es "+altop);
        
    }   
        
    }
    

