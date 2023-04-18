package searching_sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {45,40,1,3,4,48,5};
		sort(arr);
	}
	
	public static void sort(Integer[] array) {
		for(int i = 0; i < array.length-1; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for(Integer n: array) {
			System.out.print(n + " ");
		}
	}

}
