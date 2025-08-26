package controller;

import br.edu.fatec.ordem.Crescente;

public class ordenacaoController {
	Crescente cresc = new Crescente();
	
	public ordenacaoController() {
		super();
	}
	
	public int[] ordemBubble (int arr[]) {
		
		double tInicial = System.nanoTime();
		cresc.bubble(arr);
		double tFinal = System.nanoTime();
		
		double tTotal = tFinal - tInicial;
		
		tTotal = (tTotal / Math.pow(10, 9));
		
		System.out.println("BubbleSort = "+tTotal +"s. ");
		return arr;
	}
	
	public int[] ordemMerge(int arr[], int inicio, int fim) {
		
		double tInicial = System.nanoTime();
		cresc.merge(arr, inicio, fim);
		double tFinal = System.nanoTime();
		
		double tTotal = tFinal - tInicial;
		
		tTotal = (tTotal / Math.pow(10, 9));
		
		System.out.println("MergeSort = "+tTotal +"s. ");
		
		return arr;
	}

}
