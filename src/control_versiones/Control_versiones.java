package control_versiones;

import java.util.Scanner;

public class Control_versiones {

    public static void main(String[] args) {
        // TODO code application logic here
        double version = 1.1;
        double activar;

        System.out.println("para ver versión pulsa 0");
        Scanner dato = new Scanner(System.in);
        activar = dato.nextDouble();

        if (activar == 0) {
            System.out.println("VERSION : " + version);
        }

        if (activar == 1) {
            System.out.println("Cerrado");
        }
        
        if(activar > 1){
            System.out.println("");
            
        }
        
       

    }

}
