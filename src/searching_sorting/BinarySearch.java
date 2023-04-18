package searching_sorting;

public class BinarySearch {
	
	//Java is pass by value, so no return type here
	// Problems here are too complex and index is lost 
	public static void binarySearch(int[] arr, int val) {
		if(arr.length <= 1) {
			System.out.println("Not Found");
			return;
		}
		int mid = (arr.length - 1)/2;
		int length = arr.length;
		
		if(arr[mid] == val) {
			System.out.println("found");
		} else if(arr[mid] < val) {
			System.out.println(length/2 + " - "+ mid);
			int[] arr1 = new int[length/2];
			int index1 = 0;
			for(int i = mid+1; i < length; i++) {
				arr1[index1] = arr[i];
				index1++;
			}
			binarySearch(arr1, val);
		} else {
			int[] arr1 = new int[mid];
			for(int i = 0; i < mid; i++) {
				arr1[i] = arr[i];
			}
			binarySearch(arr1, val);
		}
	}
	
	//Recursive simple solution by playing with index only
	public static int binarySearchIterative(int[] nums, int val) {
		int left = 0;
		int right = nums.length - 1;
		int index = 0;
		
		while(left < right) {
			System.out.println((left+right)/2 + " " +nums[(left+right)/2]);
			if(nums[(left+right)/2] == val) {
				index = (left+right)/2;
				break;
			} else if(nums[(left+right)/2] < val) {
				left = ((left+right)/2) + 1;
				right = nums.length - 1;
			} else {
				right = (left+right)/2;
			}
		}
		return index;
	}
	
	public static int binarysearchsim(int[] nums, int val) {
		int left = 0;
		int right = nums.length;
		
		while(left <= right) {
			int mid = (left + right)/2;
			if(nums[mid] == val) {
				return mid;
			}
			if(nums[mid] > val) {
				right = mid - 1;
			} else {
				left = mid+1; 
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		//for sorted arrays only
		int[] arr = {100, 101, 110, 112, 115, 120, 160, 170, 171, 172};
		System.out.println(binarysearchsim(arr, 1000));
	}

}
