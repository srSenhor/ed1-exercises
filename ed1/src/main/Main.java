package main;

import list3.SortMethods.Sorting;

public class Main {
	public static void main(String [] args) {
		//int [] vetor = {3,5,2,65,23,1,34,6,45,62,31,77,5,8,12};
		String [] vetor = {"Bárbara", "André", "Sergio", "Benevides", "Edmundo", "Cassandra", "Carlos", "José"};
		//Sorting.Bubble(vetor);
		//Sorting.Insert(vetor);
		//Sorting.Select(vetor);
		//Sorting.Shell(vetor);
		Sorting.Quick(0, vetor.length - 1, vetor);
		
		System.out.println("Lista de nomes organizados:");
		for(String nome : vetor) {
			System.out.println(nome);
		}
	}
}
