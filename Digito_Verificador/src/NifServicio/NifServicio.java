package NifServicio;

import NIF.Nif;
import java.util.Scanner;

public class NifServicio {

    private static Scanner leer = new Scanner(System.in);
 Nif ni = new Nif();
    public void crearNif() {
       
        System.out.println("Ingrese DNI");
        ni.setDni(leer.nextLong());
        long dn = ni.getDni();
        String[] let = new String[23];
        let[0] = "T";
        let[1] = "R";
        let[2] = "W";
        let[3] = "A";
        let[4] = "G";
        let[5] = "M";
        let[6] = "Y";
        let[7] = "F";
        let[8] = "P";
        let[9] = "D";
        let[10] = "X";
        let[11] = "B";
        let[12] = "N";
        let[13] = "J";
        let[14] = "Z";
        let[15] = "S";
        let[16] = "Q";
        let[17] = "V";
        let[18] = "H";
        let[19] = "L";
        let[20] = "C";
        let[21] = "K";
        let[22] = "E";
        int dividir = (int) (dn % 23);
        System.out.println(dividir);
        String letraNif = let[dividir ];
ni.setLetra(letraNif);
    }
public void mostrar(){
    
    System.out.println(ni.getDni()+"-"+ni.getLetra());
    
}
}
