package view;

import br.edu.fatec.ordem.Crescente;

public class main {

	public static void main(String[] args) {
		Crescente cresc = new Crescente();
		int tam;
		
		//Exercicio1
		System.out.println("Exercicio 1: ");
		int[] arr1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		
		System.out.println("\nO vetor é {74, 20, 74, 87, 81, 16, 25, 99, 44, 58}\n");
		
		int[] resultBubble1 = new int[arr1.length];
		int[] resultMerge1 = new int[arr1.length];
		
		resultBubble1 = cresc.bubble(arr1);
		
		System.out.println("Resultado utilizando BubbleSort: ");
		for(int i = 0; i < 10; i++) {
			System.out.print(resultBubble1[i] + " ");
		}
		
		tam = arr1.length - 1;
		resultMerge1 = cresc.merge(arr1, 0, tam);
		
		System.out.println("\nResultado utilizando MergeSort: ");
		for(int i = 0; i < 10; i++) {
			System.out.print(resultMerge1[i] + " ");
		}
		
		//Exercicio2
		System.out.println("\n\nExercicio 2: ");
		int[] arr2 = {44, 43, 42, 41, 40, 39, 38};
		
		System.out.println("\nO vetor é {44, 43, 42, 41, 40, 39, 38}\n");
		
		int[] resultBubble2 = new int[arr2.length];
		int[] resultMerge2 = new int[arr2.length];
		
		resultBubble2 = cresc.bubble(arr2);
		
		System.out.println("Resultado utilizando BubbleSort: ");
		for(int i = 0; i < 7; i++) {
			System.out.print(resultBubble2[i] + " ");
		}
		
		tam = arr2.length - 1;
		resultMerge2 = cresc.merge(arr2, 0, tam);
		
		System.out.println("\nResultado utilizando MergeSort: ");
		for(int i = 0; i < 7; i++) {
			System.out.print(resultMerge2[i] + " ");
		}
		
		System.out.println("\n\nExercicio 3: ");
		//Exercicio3
		int[] arr3 = {101, 102, 103, 125, 124, 123, 104, 105, 106, 122};
		
		System.out.println("\nO vetor é {101, 102, 103, 125, 124, 123, 104, 105, 106, 122}\n");
		
		int[] resultBubble3 = new int[arr3.length];
		int[] resultMerge3 = new int[arr3.length];
		
		resultBubble3 = cresc.bubble(arr3);
		
		System.out.println("Resultado utilizando BubbleSort: ");
		for(int i = 0; i < 10; i++) {
			System.out.print(resultBubble3[i] + " ");
		}
		
		tam = arr2.length - 1;
		resultMerge3 = cresc.merge(arr3, 0, tam);
		
		System.out.println("\nResultado utilizando MergeSort: ");
		for(int i = 0; i < 10; i++) {
			System.out.print(resultMerge3[i] + " ");
		}
	}

}
