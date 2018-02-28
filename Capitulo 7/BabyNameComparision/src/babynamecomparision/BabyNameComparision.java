/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babynamecomparision;

import java.util.Scanner;

/**
 *
 * @author Aldair Cruz
 */
public class BabyNameComparision {

    /**
     * @param args the command line arguments
     */
        private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre, nombre1, nombre2;
		
		System.out.println("Ingrese primer nombre : ");
		nombre = input.nextLine();
		System.out.println("Ingrese segundo nombre: ");
		nombre1 = input.nextLine();
		System.out.println("Ingrese tercer nombre: ");
		nombre2 = input.nextLine();

		System.out.println("Opcion1: " + (nombre + " " + nombre1));
		System.out.println("Opcion2: " + (nombre + " " + nombre2));
		System.out.println("Opcion1: " + (nombre1 + " " + nombre));
		System.out.println("Opcion1: " + (nombre1 + " " + nombre2));
		System.out.println("Opcion1: " + (nombre2 + " " + nombre));
		System.out.println("Opcion1: " + (nombre2 + " " + nombre1));
	}
        // TODO code application logic here
    }
    

