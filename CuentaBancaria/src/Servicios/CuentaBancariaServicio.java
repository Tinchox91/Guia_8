
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/*
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la 
cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
public class CuentaBancariaServicio {

    private Scanner leer = new Scanner(System.in);

    public CuentaBancaria ingresarSaldo() {
        CuentaBancaria c1 = new CuentaBancaria();
        System.out.println("ingrese monto a agregar");
        double monto = leer.nextDouble();
        c1.setSaldoActual(c1.getSaldoActual() + monto);
       
        return c1;
    }

    public CuentaBancaria retirar() {
        CuentaBancaria c1 = new CuentaBancaria();
        double total = 0;

        System.out.println("ingrese monto a retirar");
        double retiro = leer.nextDouble();
        double saldo = c1.getSaldoActual();
        if (retiro < saldo) {
            total = saldo - retiro;
            c1.setSaldoActual(total);
            return c1;
        } else {
            c1.setSaldoActual(0);
            return c1;
        }

    }
    public CuentaBancaria extraccionR() {
        CuentaBancaria c1 = new CuentaBancaria();
        boolean val=true;
        double monto;
        do{
            System.out.println("ingrese monto a retirar (recordar que solo se permite retirar un 20% del saldo total )");
         monto = leer.nextDouble();
         double saldo = c1.getSaldoActual();
        double maxi = saldo* 0.2; 
        if (maxi < monto){
            val=false;
            break;
        }
        System.out.println("ingresaste mas ! intente de nuevo");
        }while (val);
        
        c1.setSaldoActual(c1.getSaldoActual()+monto);
        return c1;
        
        
      
    }
    public void consultaSaldo(){
        CuentaBancaria c1 = new CuentaBancaria();
        System.out.println("el saldo actual es " + c1.getSaldoActual());
        
    }
    public void consulta(){
        CuentaBancaria c1 = new CuentaBancaria();
        System.out.println(c1.toString());
        
        
        
        
    }
     public void crearCuenta() {
        CuentaBancaria c1 = new CuentaBancaria();
        System.out.println("ingrese numero de cuenta");
        c1.setNumeroCuenta( leer.nextInt());
         System.out.println(" ingrese dni");
         c1.setDniCliente(leer.nextLong());
         System.out.println("ingrese saldo");
         c1.setSaldoActual(leer.nextDouble());
         
 }     
}
