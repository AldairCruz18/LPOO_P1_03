/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everysum;



/**
 *
 * @author Aldair Cruz
 */
public class EverySum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont;
        
        
        cont=1;
        for(int i=1;cont<=50;i++){
            
           cont=cont+(i+1);
           if(cont>50){
           System.out.println("");
           }else
           System.out.println(cont);
        }
      
        
        //System.out.println(cont);
        // TODO code application logic here
    }
    
}
