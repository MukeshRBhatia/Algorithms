package arrays.libraries;

// Binary Search Technique: This technique involves using binary search 
// to find a specific element or a condition within a sorted array. This 
// technique is useful for problems that involve searching or finding elements 
// in a sorted array.
public class BinarySearchLibrary {
	//#001
	//Given an sorted array A of size N. Find number of elements which are less than or equal to B.
    //NOTE: Expected Time Complexity O(log N)
	//Edge cases - B is not in the array, 
	public static int smallerOrEqualElements(int[] A, int B) {
		//int next = 0;
        //while(A[next] <= B) {
        //     next++;
        //    if(next >= A.length) break;
        //}
        //return next;
		
		int next = 0;
        while(A[next] <= B) {
            next++;
            if(next >= A.length) break;
        }
        return next;
	}

}