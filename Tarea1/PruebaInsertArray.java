package org.gradle;

import java.util.ArrayList;

import org.junit.Test;

public class PruebaInsertArray {
	
	@Test
	public void PruebaArrayList100(){
		ArrayList< Integer > Arreglo1 = new ArrayList< Integer >();
		Long tiempo_inicio;
		Long tiempo_fin;
		
		tiempo_inicio = System.currentTimeMillis();
		for(int i=0; i<100; i=i+1){
			Arreglo1.add(i);
		}
		tiempo_fin = System.currentTimeMillis();
		
		System.out.print(tiempo_fin - tiempo_inicio);
	}
	
	@Test
	public void PruebaArrayList1000(){
		ArrayList< Integer > Arreglo1 = new ArrayList< Integer >();
		Long tiempo_inicio;
		Long tiempo_fin;
		
		tiempo_inicio = System.currentTimeMillis();
		for(int i=0; i<1000; i=i+1){
			Arreglo1.add(i);
		}
		tiempo_fin = System.currentTimeMillis();
		
		System.out.print(tiempo_fin - tiempo_inicio);
	}
	
	@Test
	public void PruebaArrayList10000(){
		ArrayList< Integer > Arreglo1 = new ArrayList< Integer >();
		Long tiempo_inicio;
		Long tiempo_fin;
		
		tiempo_inicio = System.currentTimeMillis();
		for(int i=0; i<10000; i=i+1){
			Arreglo1.add(i);
		}
		tiempo_fin = System.currentTimeMillis();
		
		System.out.print(tiempo_fin - tiempo_inicio);
	}
	

}
