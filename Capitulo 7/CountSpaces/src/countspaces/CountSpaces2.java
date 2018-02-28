/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countspaces;

import java.util.Scanner;

/**
 *
 * @author Aldair Cruz
 */
public class CountSpaces2 {
    private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Ingrese un texto :");
		String text= input.nextLine();
		Integer cont = 0;

		for (int x = 0; x < text.length(); x++) {
			if (text.substring(x, x + 1).equals(" "))
				cont++;

		}
		System.out.printf("Numero de veces que se repite: %d", cont);

	}
}
