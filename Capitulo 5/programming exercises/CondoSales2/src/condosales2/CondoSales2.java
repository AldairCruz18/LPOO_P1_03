/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condosales2;
import java.util.Scanner;
/**
 *
 * @author Aldair Cruz
 */
public class CondoSales2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opc;
    System.out.print("Opcion: ");
    opc=sc.nextInt();
    System.out.print("Numero de estacionamiento\n- 1\n- 2");
    int est=sc.nextInt();
    if(est<1 || est>2){
        System.out.print("Número inválido, se le cobrara lo del condominio solamente");
    }
    switch(opc){
        case 1:
            if(est==1 || est==2){
            System.out.print("Condominio con vista al parque y garaje\nPrecio: $155,000\n");
            }
            else
               System.out.print("Condominio con vista al parque sin garaje\nPrecio: $150,000\n"); 
            break;
        case 2:
            if(est==1 || est==2){
            System.out.print("Condominio con vista al campo de golf y garaje\nPrecio: $175,000\n");
            }else
                System.out.print("Condominio con vista al campo de golf sin garaje\nPrecio: $170,000\n");
            break;
        case 3:
            if(est==1 || est==2){
            System.out.print("Condominio con vista al lago con garaje\nPrecio: $215,000\n");
            }else
                System.out.print("Condominio con vista al lago sin garaje\nPrecio: $210,000\n");
            break;
        default:
            System.out.print("Precio: 0\n");
            break;
    }
        // TODO code application logic here
    }
    
}
