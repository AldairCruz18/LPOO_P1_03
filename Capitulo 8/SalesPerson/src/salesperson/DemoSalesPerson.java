/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesperson;

/**
 *
 * @author Aldair Cruz
 */
public class DemoSalesPerson {
    public static void main(String[] args) {
      SalesPerson[] sp=new SalesPerson[10];
      
      for(int i=0;i<10;i++){
          sp[i]=new SalesPerson(9999, 0.0);
      }
      
      for(int i=0;i<10;i++){
        System.out.println("vendedor "+(i+1)+": "+sp[i].getId()+"      "+ sp[i].getVe());
    }
        
    }
    
}

