/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countspaces;

/**
 *
 * @author Aldair Cruz
 */
public class CountSpaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
		String text = "The person who says something is impossible should not interrupt the person who is doing it." ;
		Integer cont=0;
		
		for(int x =0 ; x < text.length() ; x++) {
			if(text.substring(x,x+1).equals(" "))
				cont++;
			
		}
		System.out.printf("Numero de veces que se repite: %d", cont);
        // TODO code application logic here
    }
    
}
