/**
 * 
 */
package com.adri.presentacion;

import java.io.IOException;
import java.util.Scanner;

import com.adri.negocio.Calculo;

/**
 * @author Giddy
 *
 */
public class Vista {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculo coches = new Calculo();
		
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.next();
		
		try {
			System.out.println(nombre + " tiene " + coches.calculoCoches(nombre) + " coche/coches");
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
		

	}

}
