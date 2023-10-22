	package list3.q10;

public class QuickSort {
	public static void main(String [] args) {
		int [] vet = {3,5,2,65,23,1,34,6,45,62,31,77,5,8,12};
		sort(0, vet.length - 1, vet);
		for(int i : vet) {
			System.out.print(i + " ");
		}
	}
	public static void sort(int start, int end, int [] arr) {
		int i = start, j = end, pivot = arr[(start + end) / 2];
		
		while(i < j) {
			while(arr[i] < pivot)	i++;
			while(arr[j] > pivot)	j--;
			
			if(i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		if(j > start) {
			sort(start, j, arr);
		} 
		if(i < end) {
			sort(i, end, arr);
		} 
	}
}
