/**
 * 
 */
package com.adri.negocio;

import java.io.IOException;

import com.adri.datos.Datos;

/**
 * @author Giddy
 *
 */
public class Calculo {
	
	public int calculoCoches(String nombre) throws IOException {
		Datos datos = new Datos();
		
		int numeroCoches = datos.consultaLista(nombre);
		
		return numeroCoches;
	}
}
