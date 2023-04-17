package RaicesServicio;

import Raiz.Raiz;
import java.util.Scanner;

public class RaicesServicio {

    Raiz raiz = new Raiz();

    public double dicriminante(double aa, double bb, double cc) {
        double a = raiz.getA();
        double b = raiz.getB();
        double c = raiz.getC();

        double total = (b * b) - 4 * a * c;
        return total;
    }

    public boolean tieneRaices(double total) {
        /*devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra,
        el discriminante debe ser mayor o igual que 0.
         */
        if (total > 0) {

            return true;
        } else {
            return false;
        }

    }

    public boolean tieneRaiz(double total) {
        /*
        devuelve un booleano indicando si tiene una única solución, para que esto ocurra, 
        el discriminante debe ser igual que 0.

         */
        if (total == 0) {

            return true;
        } else {
            return false;
        }

    }

    public void obtenerRaices() {
        /* llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
         */
        double a = raiz.getA();
        double b = raiz.getB();
        double c = raiz.getC();
        double dis = dicriminante(a, b, c); // Obtén el valor del discriminante utilizando el método dicriminante
        boolean tieneRs = tieneRaices(dis); // Llama al método tieneRaices con el valor del discriminante obtenido
        double x1 = (-b + Math.sqrt(dis)) / (2 * a);
        double x2 = (-b - Math.sqrt(dis)) / (2 * a);
        if (tieneRs) {
            System.out.println(" _La Raiz 1 es: " + x1);
            System.out.println("_La Raiz 2 es: " + x2);

        }
    }

    public void obtenerRaiz() {
        /*llama a tieneRaiz() y si devolvió́ true imprime una única raíz. 
          Es en el caso en que se tenga una única solución posible.
         */
        double a = raiz.getA();
        double b = raiz.getB();
        double c = raiz.getC();
        double dis = dicriminante(a, b, c); // Obtén el valor del discriminante utilizando el método dicriminante
        boolean tieneR = tieneRaices(dis); // Llama al método tieneRaices con el valor del discriminante obtenido
        double x1 = (-b + Math.sqrt(dis)) / (2 * a);
        double x2 = (-b - Math.sqrt(dis)) / (2 * a);
        if (tieneR) {
            System.out.println(" _La Raiz es: " + x1);

        }
    }

    public void calcular() {
        Scanner leer = new Scanner(System.in);

        double n1, n2, n3;

        boolean val1, val2;
        double disc, r1, r2;
        val1 = false;
        val2 = false;
        System.out.println("Ingrese numero 'A' a calcular: ");
        raiz.setA(leer.nextDouble());
        System.out.println("Ingrese numero 'B' a calcular: ");
        raiz.setB(leer.nextDouble());
        System.out.println("Ingrese numero 'C' a calcular: ");
        raiz.setC(leer.nextDouble());
        disc = dicriminante(raiz.getA(), raiz.getB(), raiz.getC());
        val1 = tieneRaices(disc);
        val2 = tieneRaiz(disc);

        if (val1 == true) {
            this.obtenerRaices();
        } else if (val2 == true) {
            this.obtenerRaiz();
        } else {
            System.out.println("  NO TIENE RAIZ");
        }

    }

}
