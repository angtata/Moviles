package org.gradle;

import java.util.Vector;

import org.junit.Test;

public class pruebaInsertVector {
	@Test
	public void PruebaLVector100(){
		Vector < Integer > Vector1 = new Vector < Integer >();
		Long tiempo_inicio;
		Long tiempo_fin;
		
		tiempo_inicio = System.currentTimeMillis();
		for(int i=0; i<100; i=i+1){
			Vector1.addElement(i);
		}
		tiempo_fin = System.currentTimeMillis();
		
		System.out.print(tiempo_fin - tiempo_inicio);
	}
	
	@Test
	public void PruebaLVector1000(){
		Vector < Integer > Vector1 = new Vector < Integer >();
				
		Long tiempo_inicio;
		Long tiempo_fin;
		
		tiempo_inicio = System.currentTimeMillis();
		for(int i=0; i<1000; i=i+1){
			Vector1.addElement(i);
		}
		tiempo_fin = System.currentTimeMillis();
		
		System.out.print(tiempo_fin - tiempo_inicio);
	}
	
	@Test
	public void PruebaLVector10000(){
		Vector < Integer > Vector1 = new Vector < Integer >();
				
		Long tiempo_inicio;
		Long tiempo_fin;
		
		tiempo_inicio = System.currentTimeMillis();
		for(int i=0; i<10000; i=i+1){
			Vector1.addElement(i);
		}
		tiempo_fin = System.currentTimeMillis();
		
		System.out.print(tiempo_fin - tiempo_inicio);
	}
}
