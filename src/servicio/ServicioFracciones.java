
package servicio;

import entidadFracciones.Fracciones;
import java.util.Scanner;


public class ServicioFracciones {
private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Fracciones frac = new Fracciones();
    
    public Fracciones crearOperaciones(){
       
        System.out.print("Ingrese el numerador de la fraccion1: ");
        frac.setNumerador(leer.nextInt());
        System.out.print("Ingrese el denominador de la fraccion2: ");
        frac.setDenominador(leer.nextInt());
        System.out.print("Ingrese el numerador de la fraccion2: ");
        frac.setNume1(leer.nextInt());
        System.out.print("Ingrese el denominador de la fraccion2: ");
        frac.setDeno1(leer.nextInt());
        return frac;
        
    }
    public void suma(Fracciones frac){
        int suma1;
        if (frac.getDenominador()==frac.getDeno1()){
           suma1=(frac.getNumerador()+frac.getNume1());
            System.out.println("La suma de las dos fracciones es: "+suma1+"/"+frac.getDenominador());
        }else {
            int mul = frac.getNumerador()*frac.getDeno1();
            int mul2 = frac.getNume1()*frac.getDenominador();
            int mul3 = frac.getDenominador()*frac.getDeno1();
            suma1= (mul + mul2);
             System.out.println("La suma de las dos fracciones es: "+suma1+"/"+mul3);         
        }     
        
    }
    
    public void resta(Fracciones frac){
        int resta1;
         if (frac.getDenominador()==frac.getDeno1()){
           resta1=(frac.getNumerador()-frac.getNume1());
            System.out.println("La resta de las dos fracciones es: "+resta1+"/"+frac.getDenominador());
        }else {
            int mul4 = frac.getNumerador()*frac.getDeno1();
            int mul5 = frac.getNume1()*frac.getDenominador();
            int mul6 = frac.getDenominador()*frac.getDeno1();
            resta1= (mul4 - mul5);
            System.out.println("La resta de las dos fracciones es: "+resta1+"/"+mul6);
                    
        }
         
         
    }
    
    public void multiplicar(Fracciones frac){
        int mulNu= frac.getNumerador()*frac.getNume1();
        int mulDe=frac.getDenominador()*frac.getDeno1();
        System.out.println("La multiplicacion de las dos fraciones es: "+ mulNu+"/"+mulDe);
        
        }
    
    public void division(Fracciones frac){
        
         int mulNuDe1= frac.getNumerador()*frac.getDeno1();
         int mulNuDe2= frac.getNume1()*frac.getDenominador();
        System.out.println("La divisiom de las dos fracciones es: "+mulNuDe1+"/"+mulNuDe2);
        
    }
}
