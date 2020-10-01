/**
 * 
 */
package com.adri.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Giddy
 *
 */
public class Datos {
	
	public int consultaLista(String nombre) throws IOException {
		
		File fichero = new File("C:/Users/Giddy/Documents/Coches.txt");
		BufferedReader br = new BufferedReader(new FileReader(fichero));
		String linea;
		int numero = 0;
		while((linea = br.readLine()) != null) {
			if(linea.contains(nombre)) {
				numero++;
			}
		}
		return numero;
	}	
}
