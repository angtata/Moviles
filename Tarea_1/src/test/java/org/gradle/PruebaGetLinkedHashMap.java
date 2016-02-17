package org.gradle;

import java.util.LinkedHashMap;

import org.junit.Test;

public class PruebaGetLinkedHashMap {
	@Test
	public void PruebaLHashMap100(){
		LinkedHashMap <Integer,Integer> Mapa = new  LinkedHashMap <Integer,Integer>();
		Long tiempo_inicio;
		Long tiempo_fin;
		
		for(int i = 0; i<100; i=i+1){
			Mapa.put(i, i*2);
		}
		
		tiempo_inicio = System.currentTimeMillis();
		for(int i = 0; i<100; i=i+1){
			Mapa.get(i);
		}
		tiempo_fin = System.currentTimeMillis();
		
		System.out.print(tiempo_fin - tiempo_inicio);		
	}
	
	@Test
	public void PruebaLHashMap1000(){
		LinkedHashMap <Integer,Integer> Mapa = new  LinkedHashMap <Integer,Integer>();
		Long tiempo_inicio;
		Long tiempo_fin;
		
		for(int i = 0; i<1000; i=i+1){
			Mapa.put(i, i*2);
		}
		
		tiempo_inicio = System.currentTimeMillis();
		for(int i = 0; i<1000; i=i+1){
			Mapa.get(i);
		}
		tiempo_fin = System.currentTimeMillis();
		
		System.out.print(tiempo_fin - tiempo_inicio);		
	}
	
	@Test
	public void PruebaLHashMap10000(){
		LinkedHashMap <Integer,Integer> Mapa = new  LinkedHashMap <Integer,Integer>();
		Long tiempo_inicio;
		Long tiempo_fin;
		
		for(int i = 0; i<10000; i=i+1){
			Mapa.put(i, i*2);
		}
		
		tiempo_inicio = System.currentTimeMillis();
		for(int i = 0; i<10000; i=i+1){
			Mapa.get(i);
		}
		tiempo_fin = System.currentTimeMillis();
		
		System.out.print(tiempo_fin - tiempo_inicio);		
	}
}
