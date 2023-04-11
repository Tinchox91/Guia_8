
package Main;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;


public class Principal {

   private static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
      //  CuentaBancaria c1 = new CuentaBancaria();
        
        CuentaBancariaServicio serv = new  CuentaBancariaServicio();
        boolean val = true;
        
        
        
        
        
        do {
            System.out.println("ingrese la opcion");
            System.out.println("1.crear cuenta");
            System.out.println("2.ingresar saldo ");
            System.out.println("3.retirar");
            System.out.println("4.extraccion rapida");
            System.out.println("5.consultar saldo");
            System.out.println("6.consultar datos");
            System.out.println("7.Salir");
            int ope = leer.nextInt();
            switch (ope){
                case 1:serv.crearCuenta();
                break;
                case 2: serv.ingresarSaldo();
                break;
                case 3:serv.retirar();
                break;
                case 4:serv.extraccionR();
                break;
                case 5: serv.consultaSaldo();
                break;
                case 6: serv.consulta();
                    
                break;
                case 7: val=false;
                break;
                default: System.out.println("numero invalido!");
              
            }
            
        }while (val);
        
        
        
    }
    
}
