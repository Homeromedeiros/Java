package Exercicios;

import java.util.Scanner;

public class frutas{
	public static void main(String[] args) {
		String[] promoFrutas = {"banana","maca","abacaxi", "melao", "mamao"};
		System.out.println("Qual fruta você deseja comprar hoje? ");
		Scanner input = new Scanner(System.in);
		String compra = input.nextLine();
		boolean frutaEmPromocao = false;
		for (String promoFruta: promoFrutas) {
			if(promoFruta.equalsIgnoreCase(compra)) {
				frutaEmPromocao = true;
				break;
			}
		}
		if (frutaEmPromocao) {
			System.out.println("Boa Escolha! Essa fruta esta em promocao hoje.");
		}else {
			System.out.println("Sua fruta nao esta em promocao hoje");
		}
	}
}
