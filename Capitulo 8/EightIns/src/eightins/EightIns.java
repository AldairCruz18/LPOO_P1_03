/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightins;

/**
 *
 * @author Aldair Cruz
 */
public class EightIns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] Array=new int[8];
        int i;
        for(i=0;i<8;i++){
            Array[i]=i+1;
        }
        for( i=0;i<8;i++){
            
            System.out.println(Array[i]);
        }
        System.out.print("\n\n");
        for ( i=7;i>=0;i--){
            //Array[i]=i;
            System.out.println(Array[i]);
        }
        
        // TODO code application logic here
    }
    
}
