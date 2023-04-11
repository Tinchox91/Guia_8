
package Principal;

import Servicios.CafeteraServicio;
import java.util.Scanner;

public class Principal {

   private static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        
   
        CafeteraServicio serv = new CafeteraServicio();
        
        
        boolean val = true;
        
        do {
            System.out.println("Ingrese la opción:");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza ");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar café");
            System.out.println("5. Salir");
           
            int ope = leer.nextInt();
            switch (ope){
                case 1:
                    serv.llenarCafetera();
                    break;
                case 2:
                    System.out.println("Ingrese tamaño de taza:");
                    int tazza= leer.nextInt();
                    serv.servirTaza(tazza);
                    break;
                case 3:
                    serv.vaciarCafetera();
                    break;
                case 4:
                    serv.agregarCafe();
                    break;
                case 5:
                    val=false;
                    break;
                default:
                    System.out.println("Número inválido!");
            }
        } while (val);
    }
}
