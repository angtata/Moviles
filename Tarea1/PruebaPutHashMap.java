package org.gradle;

import java.util.HashMap;

import org.junit.Test;

public class PruebaPutHashMap {
	@Test
	public void PruebaHashMap100(){
		HashMap <Integer, Integer> Mapa = new HashMap<Integer, Integer>();
		Long tiempo_inicio;
		Long tiempo_fin;
		
		tiempo_inicio = System.currentTimeMillis();
		for(int i = 0; i<100; i=i+1){
			Mapa.put(i, i*2);
		}
		tiempo_fin = System.currentTimeMillis();
		
		System.out.print(tiempo_fin - tiempo_inicio);		
	}
	
	@Test
	public void PruebaHashMap1000(){
		HashMap <Integer, Integer> Mapa = new HashMap<Integer, Integer>();
		Long tiempo_inicio;
		Long tiempo_fin;
		
		tiempo_inicio = System.currentTimeMillis();
		for(int i = 0; i<1000; i=i+1){
			Mapa.put(i, i*2);
		}
		tiempo_fin = System.currentTimeMillis();
		
		System.out.print(tiempo_fin - tiempo_inicio);		
	}
	
	@Test
	public void PruebaHashMap10000(){
		HashMap <Integer, Integer> Mapa = new HashMap<Integer, Integer>();
		Long tiempo_inicio;
		Long tiempo_fin;
		
		tiempo_inicio = System.currentTimeMillis();
		for(int i = 0; i<10000; i=i+1){
			Mapa.put(i, i*2);
		}
		tiempo_fin = System.currentTimeMillis();
		
		System.out.print(tiempo_fin - tiempo_inicio);		
	}
}
