/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberlistdemo;
import java.util.Scanner;
/**
 *
 * @author Aldair Cruz
 */
public class NumberListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] num=new int[8];
        int i,menor=1000,mayor=0;
       int cont =0;
        for(i=0;i<8;i++){
            num[i]=sc.nextInt();
        }
         System.out.println("\nNúmeros como se fueron pidiendo");
        for(i=0;i<8;i++){
            System.out.println(num[i]);
        }
         System.out.println("\nNúmeros inversos a como se fueron pidiendo");
        for(i=7;i>=0;i--){
            System.out.println(num[i]);
        }
        for(i=7;i>=0;i--){
            cont+=num[i];
        }
        System.out.println("\nNúmeros suma: "+cont);
        System.out.println("\nNúmeros menores de 5 ");
        for(i=0;i<8;i++){
            if(num[i]<5){
            System.out.println(num[i]);
        }
        }
        
        for(i=0;i<8;i++){
            if(num[i]<menor){
            menor=num[i];
        }
        }
        System.out.println("\nNumero menor: "+menor);
        
        for(i=0;i<8;i++){
            if(num[i]>mayor){
            mayor=num[i];
        }
        }
        System.out.println("\nNumero mayor: "+mayor);
        
        double prom=(double)cont/8;
        System.out.println("\nPromedio: "+prom);
        
        System.out.println("\nNúmeros mayores del promedio ");
        for(i=0;i<8;i++){
            if(num[i]>prom){
            System.out.println(num[i]);
        }
        }
        // TODO code application logic here
    }
    
    
}
