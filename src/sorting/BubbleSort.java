package sorting;

public class BubbleSort {
    
	public static void main(String[] args) {
		int[] array1 = new int[10];
		int[] array = {5, 2 , 10, 1, 6, 8};
		sort(array);
	}
	
	public static void sort(int[] arr) {
		for(int j = 0; j < arr.length; j++) {
		 for(int i = j; i < arr.length - 1; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
	 }
		}
		for(Integer n: arr) {
			System.out.print(n + " ");
		}
	}
}
