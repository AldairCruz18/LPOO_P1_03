/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpentrychoice;
import java.util.Scanner;
/**
 *
 * @author Aldair Cruz
 */
public class CarpentryChoice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] muebles={"mesa","escritorio","tocador","centro de entretenimiento"};
        String opcion;
        int total = 0;
        System.out.print("Elija el mueble que guste comprar de las siguientes opciones\n\n");
        for(int i=0;i<4;i++){
            System.out.println("- "+muebles[i]);
        }
        System.out.print("Introduzca opción de lo que desee comprar ");
       
           opcion=sc.nextLine();
        switch(opcion){
            case "mesa":
            case "MESA":
            total=250;
            break;
            case "escritorio":
            case "ESCRITORIO":
                total=325;
                break;
            case "tocador":
            case "TOCADOR":
                total=420;
                break;
            case "centro de entretenimiento":
            case "CENTRO DE ENTRETENIMIENTO":
                total=600;
                break;
        }
        System.out.printf("El precio de %s es de %d ",opcion,total);
        // TODO code application logic here
    }
    
}
