package Exercicios;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		
		try (Scanner ler = new Scanner(System.in)) {
			while (true) {	
				System.out.println("Entre com um número de 1 a 10: ");
				int n = ler.nextInt();
				
				if (n <=10 && n > 0) {
						
					System.out.println("A tabuada de " + n + " é: ");
					
					for(int i=0; i<=10; i++) {
						System.out.println(n + " X " + i + " = " + n*i);
					}
				continue;
				}
				System.out.println("Escolha inválida!");
				break;
			}
		}	
	}
}
