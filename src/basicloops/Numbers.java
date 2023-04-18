package basicloops;

public class Numbers {
	
	// Given an integer n, return the number of prime numbers that are strictly less than n.
	public static int countPrimes(int n) {
        int count = 0;
        for(int i = 2; i < n; i++) {
            boolean isprime = true;
            for(int j = 2; j < i; j++) {
                if(i%j == 0) {
                    isprime = false;
                }
            }
            if(isprime) count++;
        }
        return count;
    }
	
	// other way to solve? https://leetcode.com/problems/count-primes/solutions/57588/my-simple-java-solution/?orderBy=most_votes

	public static int countPrimeFactors(int n) {
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
