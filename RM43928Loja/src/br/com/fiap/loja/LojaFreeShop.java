package br.com.fiap.loja;

import java.util.Scanner;

public class LojaFreeShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		MoedaEstrangeira converter = new MoedaEstrangeira();
				
		System.out.println("Digite o valor em D�lar:");
		
		Scanner teclado = new Scanner(System.in); 
		
		int valorDolar = teclado.nextInt();
		
		int valorReal = converter.converterDolar(valorDolar);
		
		System.out.println("Valor em real: " + valorReal);

	}	

}
