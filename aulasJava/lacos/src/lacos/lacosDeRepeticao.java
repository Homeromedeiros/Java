package lacos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class lacosDeRepeticao {
	public static void main(String[] args) {
		/*for (int i=1; i<=10; i++) {
			for (int j = 1; j<=10; j++) {
				System.out.println(i + " X "+ j + " = "+ i*j);
			}
		}*/
		
		//Vetores (Arrays)
	  /*int[] numeros = new int[5];
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
				
		for (int i=0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
		}*/
		
	//	String[] letras = {"H", "O", "M", "E", "R", "O"};
//		for (int i=0; i < letras.length; i++) {
//			System.out.print(letras[i]);
//		}
		
	//	System.out.print(Arrays.toString(letras));
		
		int[] n = {5, 9, 2, 11, 7};
		int maior = n[0];
		int menor = n[0];
		int media = 0;
		
		for (int i=0; i<n.length; i++) {
			if(n[i]>maior) {
				maior = n[i];
			}
			if(n[i]<menor) {
				menor = n[i];
			}
			media += n[i];
		}
		System.out.println("O maior é " + maior);
		System.out.println("O menor é " + menor);
		System.out.println("A media é " + media/n.length);
		 
	}
}
