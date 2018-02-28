/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffe;
import java.util.Scanner;
/**
 *
 * @author Aldair Cruz
 */
public class Coffe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double cont=0;
        System.out.print("Menú:\n(1)American\t1.99\n(2)Espresso\t2.50\n(3)Latte\t2.15\n");
        int opc;
        do{
        System.out.print("Elija opción: ");
        opc=sc.nextInt();
        switch(opc){
            case 1:
                cont+=1.99;
                break;
            case 2:
                cont+=2.50;
                break;
            case 3:
                cont+=2.15;
                break;
            
                
        }
        }while(opc!=0);
        System.out.printf("El costo total es de %.2f ",cont);
        // TODO code application logic here
    }
    
}
