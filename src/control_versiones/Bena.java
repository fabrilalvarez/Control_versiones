
package control_versiones;


public class Bena {
    
    static int past;
    
    public static void Matrix(){
        System.out.println("¿queres entrar en Matrix?");
        System.out.println("pulsa 0 para roja  y 1 para azul");
        
        if(past==0){
            System.out.println("No entras en Matrix");
        }
        if(past==1){
            System.out.println("Entras en Matrix");
        }else{
            System.out.println("Vete a tomar el pelo a otro");
        }
    }
}
