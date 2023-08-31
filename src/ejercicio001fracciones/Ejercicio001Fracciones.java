package ejercicio001fracciones;

import entidadFracciones.Fracciones;
import java.util.Scanner;
import servicio.ServicioFracciones;



public class Ejercicio001Fracciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ServicioFracciones sf = new ServicioFracciones();
       Fracciones frac = sf.crearOperaciones();
        
         int opc;
        do{
            System.out.println("-----------MENU-----------------");
            System.out.println("1.SUMA");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicar");
            System.out.println("4.Division");
            System.out.println("5.Salir");
            opc=leer.nextInt();
            
            switch (opc){
                
                case 1:
                    sf.suma(frac);
                    break;
                case 2:
                    sf.resta(frac);
                    break;
                case 3:
                    sf.multiplicar(frac);
                    break;
                case 4:
                    sf.division(frac);
                    break;
                case 5:
                    System.out.println("Gracias!");
                    break;
                 default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opc != 5);
    }

}

