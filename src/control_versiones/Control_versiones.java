package control_versiones;

import java.util.Scanner;

public class Control_versiones {

    static double activar;
    static double version = 2.3;

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("para ejecutar pulsa cualquier tecla");
        System.out.println("para ver versión pulsa 0");
        System.out.println("para cerrar pulsa 1");
        dato();
        Versiones();

        if (activar > 1) {
            programa();
        }
    }

    public static void programa() {
        System.out.println(":::::::PROGRAMA:::::::");
        Bena.Matrix();
    }

    public static void dato() {
        Scanner dato = new Scanner(System.in);
        activar = dato.nextDouble();
    }

    public static void Versiones() {
        if (activar == 0) {
            System.out.println("VERSION : " + version);
        }
        if (activar == 1) {
            System.out.println("Cerrado");
        }
    }

}
