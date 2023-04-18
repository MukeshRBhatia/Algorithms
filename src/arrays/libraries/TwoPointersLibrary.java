package arrays.libraries;

//Two-Pointer Technique: This technique involves using two pointers, 
//one starting from the beginning of the array and the other starting 
//from the end. This technique is useful for problems that require 
//searching or comparing elements in an array.
public class TwoPointersLibrary {
	
	public static int secondSmallestElement(int[] arr) {
		int least = Integer.MAX_VALUE; //least
	    int sleast = Integer.MAX_VALUE;  //second least


	    for(int i=0; i<arr.length; i++)
	    {
	    	System.out.println(least + " ; " + sleast);
	        if(arr[i]<sleast) 
	        {
	            //sleast = least;
	            sleast = arr[i];
	        }

	        if(arr[i]<least)
	        {
	            sleast = least;
	        	least = arr[i];
	        }
	    }

	    return sleast;
	}
	
	//You are given an array nums having n integers colored red, white, or blue, sort them in place so that 
	//objects of the same color are adjacent, with the colors in the order red, white, and blue.
	public static int[] orderOnColor(int[] colors) {
		int red = 0;
		int white = 0;
		int blue = 0;
		for(int i = 0; i < colors.length; i++) {
			if(colors[i] == 0) red++; 
			if(colors[i] == 1) white++;
			if(colors[i] == 2) blue++;
		}
		for(int i = 0; i < colors.length; i++) {
			if(red > 0) {
				colors[i] = 0;
				red--;
			} else if(white > 0) {
				colors[i] = 1;
				white--;
			} else {
				colors[i] = 2;
				blue--;
			}
		}
		return colors;
	}
	
	public static void main(String[] args) {
		//int[] ar = {10, 25, 2, 56, 8, 5, 100};
		//System.out.println(TwoPointersLibrary.secondSmallestElement(ar));
		int[] ar = {2, 2, 2, 0, 1, 0, 1, 2};
		for(int n:TwoPointersLibrary.orderOnColor(ar)) {
			System.out.print(n+",");
		}
	}

}