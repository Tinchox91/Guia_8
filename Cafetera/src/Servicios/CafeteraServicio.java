
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;


public class CafeteraServicio {
    private Cafetera cafe;
    private static Scanner leer = new Scanner(System.in);
     public void llenarCafetera(){
         cafe.setCapacidadMax(cafe.getCapacidadActual());
         
     }
     
     public void servirTaza(int taza){
         int tazza=0;
         int cafee=cafe.getCapacidadMax();
         
         if (tazza< cafee){
             System.out.println(" se lleno la tazza, queda "+ cafee+" de cafe");
             
             
         }else{
             tazza= tazza - cafee;
             System.out.println("no alcanzo el cafe para llenar la taza, solo se sirvio "+ tazza + " de cafe");
                     
         }
     }
         public void vaciarCafetera(){
         cafe.setCapacidadMax(0);
         
     }
          public void agregarCafe(){
              System.out.println("ingrese cantidad");
              cafe.setCapacidadActual(leer.nextInt());
         
     }
         
         
         
     }
     
     
    
    
   

