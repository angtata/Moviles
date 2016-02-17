package org.gradle;

import java.util.LinkedList;

import org.junit.Test;

public class PruebaRemoveLinkedList {
	@Test
	public void PruebaList100(){
		LinkedList < Integer > Lista1 = new LinkedList < Integer > ();
		Long tiempo_inicio;
		Long tiempo_fin;
		
		for(int i=0; i<100; i=i+1){
			Lista1.add(i);
		}
		tiempo_inicio = System.currentTimeMillis();
		for(int i=99; i>=0; i=i-1){
			Lista1.remove(i);
		}
		tiempo_fin = System.currentTimeMillis();
		
		System.out.print(tiempo_fin - tiempo_inicio);
	}
	
	@Test
	public void PruebaList1000(){
		LinkedList < Integer > Lista1 = new LinkedList < Integer > ();
		Long tiempo_inicio;
		Long tiempo_fin;
		
		for(int i=0; i<1000; i=i+1){
			Lista1.add(i);
		}
		tiempo_inicio = System.currentTimeMillis();
		for(int i=999; i>=0; i=i-1){
			Lista1.remove(i);
		}
		tiempo_fin = System.currentTimeMillis();
		
		System.out.print(tiempo_fin - tiempo_inicio);
	}
	
	@Test
	public void PruebaList10000(){
		LinkedList < Integer > Lista1 = new LinkedList < Integer > ();
		Long tiempo_inicio;
		Long tiempo_fin;
		
		for(int i=0; i<10000; i=i+1){
			Lista1.add(i);
		}
		tiempo_inicio = System.currentTimeMillis();
		for(int i=9999; i>=0; i=i-1){
			Lista1.remove(i);
		}
		tiempo_fin = System.currentTimeMillis();
		
		System.out.print(tiempo_fin - tiempo_inicio);
	}
}
