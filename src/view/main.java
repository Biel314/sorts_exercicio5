package view;

import br.edu.fatec.ordem.Crescente;
import controller.ordenacaoController;

public class main {

	public static void main(String[] args) {
		Crescente cresc = new Crescente();
		ordenacaoController ordem = new ordenacaoController();
		int tam;
		
		//Exercicio1
		System.out.println("Exercicio 1: ");
		int[] arr1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		
		System.out.println("O vetor é {74, 20, 74, 87, 81, 16, 25, 99, 44, 58}\n");
		
		int[] resultBubble1 = new int[arr1.length];
		
		resultBubble1 = ordem.ordemBubble(arr1);
		
		System.out.print("Resultado: ");
		for(int i = 0; i < 10; i++) {
			System.out.print(resultBubble1[i] + " ");
		}
		
		System.out.println("\n");
		
		int[] resultMerge1 = new int[arr1.length];
		tam = arr1.length - 1;
		resultMerge1 = ordem.ordemMerge(arr1, 0, tam);
		
		System.out.print("Resultado: ");
		for(int i = 0; i < 10; i++) {
			System.out.print(resultMerge1[i] + " ");
		}

		System.out.println("\n\n");
		
		//Exercicio2
		System.out.println("Exercicio 2: ");
		int[] arr2 = {44, 43, 42, 41, 40, 39, 38};
		
		System.out.println("O vetor é {44, 43, 42, 41, 40, 39, 38}\n");
		
		int[] resultBubble2 = new int[arr2.length];
		
		resultBubble2 = ordem.ordemBubble(arr2);
		
		System.out.print("Resultado: ");
		for(int i = 0; i < 7; i++) {
			System.out.print(resultBubble2[i] + " ");
		}
		
		System.out.println("\n");
		
		int[] resultMerge2 = new int[arr2.length];
		tam = arr2.length - 1;
		resultMerge2 = ordem.ordemMerge(arr2, 0, tam);
		
		System.out.print("Resultado: ");
		for(int i = 0; i < 7; i++) {
			System.out.print(resultMerge2[i] + " ");
		}
		
		System.out.println("\n\n");
		
		System.out.println("Exercicio 3: ");
		//Exercicio3
		int[] arr3 = {101, 102, 103, 125, 124, 123, 104, 105, 106, 122};
		
		System.out.println("O vetor é {101, 102, 103, 125, 124, 123, 104, 105, 106, 122}\n");
		
		int[] resultBubble3 = new int[arr3.length];
		
		resultBubble3 = ordem.ordemBubble(arr3);
		
		System.out.print("Resultado: ");
		for(int i = 0; i < 10; i++) {
			System.out.print(resultBubble3[i] + " ");
		}
		
		System.out.println("\n");
		
		int[] resultMerge3 = new int[arr3.length];
		tam = arr3.length - 1;
		resultMerge3 = ordem.ordemMerge(arr3, 0, tam);
		
		System.out.print("Resultado: ");
		for(int i = 0; i < 10; i++) {
			System.out.print(resultMerge3[i] + " ");
		}
	}

}
