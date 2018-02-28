/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dividestrings;
import java.util.Scanner;
/**
 *
 * @author Aldair Cruz
 */
public class DivideStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //String ab;
        String[] cad1=new String[50];
        String[] cad2=new String[50];
        int i=0,j=0,cont=0,cont1=0;
        int o;
        System.out.print("Introduzca el numero de cadenas que metera ");
        //do{
        o=sc.nextInt();
        //}while(o>20);
        for(int h=0;h<o;h++){
        System.out.println("Introduzca la cadena ");
        String ab=sc.nextLine();
        if(ab.length()<=5){
            cad1[i]=ab;
            i++;
            cont+=1;
        } else {
           cad2[j]=ab;
           j++;
           cont1+=1;
        }
        }
        for(i=0;i<cont;i++){
            System.out.println(cad1[i]);
        }
        for(j=0;j<cont1;j++){
            System.out.println(cad2[j]);
        }
        // TODO code application logic here
    }
}
   
