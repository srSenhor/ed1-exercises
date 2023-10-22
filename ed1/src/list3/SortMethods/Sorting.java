package list3.SortMethods;

public class Sorting <T> {
	
	public static <T extends Comparable<T>> void Shell(T [] arr) {
		int h = 1;
		
		while(h < arr.length) {
			h = 3 * h + 1;
		}
		while(h > 1) {
			h = h / 3;
			for(int i = h; i < arr.length; i++) {
				
				int j = i - h; //vet[j] = 1, j = 5
				T  aux = arr[i];
				
				while(j >= 0 && aux.compareTo(arr[j]) < 0) { 
					arr[j + h] = arr[j];
					j = j - h;
				}
				arr[j + h] = aux;
			}	
		}
	}
	
	public static <T extends Comparable<T>> void Insert(T [] arr) {		
		for(int i = 1; i < arr.length; i++) {
			int j = i; 
			T aux = arr[j]; //vet[j] = 1, j = 5
			boolean cond = true;
			
			while(j > 0 && cond) { //j == 0, cond == true
				if(aux.compareTo(arr[j - 1]) < 0) { // [2, 2, 3, 5, 23, 65]
					arr[j] = arr[j - 1];
					j--;
				} else {
					cond = false;
				}
			}
			arr[j] = aux;
		}
	}

	public static <T extends Comparable<T>> void Select(T [] arr) {
		for(int i = 0; i < arr.length; i++) {
			int menor = i; 
			for(int j = i; j < arr.length; j++) {
				if(arr[j].compareTo(arr[menor]) <= 0){
					menor = j;
				}
			}
			T aux = arr[i];
			arr[i] = arr[menor];
			arr[menor] = aux;
		}
	}
	
	public static <T extends Comparable<T>> void Bubble(T [] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if( arr[j].compareTo(arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	public static <T extends Comparable<T>> void Quick(int start, int end, T [] arr) {
		int i = start, j = end;
		T pivot = arr[(start + end) / 2];
		
		while(i < j) {
			while(arr[i].compareTo(pivot) < 0)	i++;
			while(arr[j].compareTo(pivot) > 0)	j--;

			if(i <= j) {
				T temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		if(j > start) {
			Quick(start, j, arr);
		} 
		if(i < end) {
			Quick(i, end, arr);
		} 
	}
}
