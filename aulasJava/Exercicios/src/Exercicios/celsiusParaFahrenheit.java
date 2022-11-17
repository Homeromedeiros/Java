package Exercicios;

import java.util.Scanner;

public class celsiusParaFahrenheit {
	public static void main(String[] args) {
		try (Scanner t = new Scanner(System.in)) {
			while(true) {
				float c, f;
				
				System.out.println("Entre com uma temp em C para saber em F: ");
				c = t.nextInt();
				
				if (c > 0) {
					f = (c*9/5)+32;
					System.out.println("O equivalente a " + c + "C é " + f + "F.");
				continue;
				}
				System.out.println("Temperatura não real!");
				break;
			}
		}
	}
}
