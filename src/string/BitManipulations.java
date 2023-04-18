package string;

public class BitManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	//input: "101"
	//output: 5
	public int binaryToDec(String bin) {
		     if(bin == null || bin == "") {
		        // throw new NullPointerException("");
		        return 0;
		     }
		     int sum = 0;
		     int count = 0;
		     for(int i = bin.length() - 1; i >=0; i--){
		         if(bin.charAt(i) != '1' || bin.charAt(i) != '0') {
		             return 0;
		         }
		         if(bin.charAt(i) == '1' ) {
		         //    sum = Math.pow(2, count) + sum;
		         } 
		         if(Integer.MAX_VALUE >= sum) {
		             /// got stuck here
		        	 // what happens when an int value reaches its maximum threshold
		         }
		         count++;
		     }
		     return sum;
		}

}
