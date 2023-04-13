
package Servicios;

import Entidad.Persona;
import java.util.Scanner;




public class ServicioPersona {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona p1 = new Persona();
    
  public Persona crearPersona(){
        Persona nuevaPersona = new Persona(); // Crear nueva instancia de Persona
        boolean val = true;
        System.out.println("Ingrese nombre: ");
        nuevaPersona.setNombre(leer.next());
        System.out.println("Ingrese edad: ");
        nuevaPersona.setEdad(leer.nextInt());
        System.out.println("Ingrese sexo H,M,O: ");
        do {
            char sex = leer.next().charAt(0);
            if (sex == 'H' || sex == 'M' || sex == 'O' || sex == 'h' || sex == 'm' || sex == 'o') {
                val = false;
                nuevaPersona.setSexo(Character.toString(sex));
            } else {
                System.out.println("Letra equivocada, intente de nuevo");
            }
        } while (val);
        System.out.println("Ingrese peso: ");
        nuevaPersona.setPeso(leer.nextFloat());
        System.out.println("Ingrese altura: ");
        nuevaPersona.setAltura(leer.nextFloat());
        
        return nuevaPersona; // Retornar la nueva persona creada
    }
  public boolean esMayorDeEdad(int edad) {
    
    if (edad < 18) {
        return false;
    } else {
        return true;
    }
}
    public int calcularIMC(float peso,float altura) {
        int result;
        result = 0;
         
        float a=altura;
        float t= peso/(a*a);
        if (t < 20) {
        return -1;
    } else if (t > 25) { 
        return 1;
    } else { 
        return 0;
    }
        
        
        
        
     
    } 
     
    
}
