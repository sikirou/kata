package com.kata.codewar;

public class Solution {
	
	private static  final int HUNDRED = 100 ; 
	private static final int FIFTY = 50 ; 
	private static final int  TWENTY = 20 ; 

	public static int[] withdraw(int n) {

		int[] arrayToReturn = new int[3];
		// initial number of HUNDRED BILLETS 
		arrayToReturn[0] = n / HUNDRED;  
		// rest oo the division by HUNDRED 
		int modulus_on_hundred = n % HUNDRED;
		// the rest is divided by FIFTY to know the number de FIFTY BILLETS
		arrayToReturn[1] = modulus_on_hundred / FIFTY;
		
		// get the rest of BUILLETS  
		int modulus_on_fifty = modulus_on_hundred % FIFTY;
		// get the number de TWENTY BILLET 
		arrayToReturn[2] = modulus_on_fifty / TWENTY;
		while (true) {
			// check if the the sum of billets in the arrays equal to  n 
			int sum = arrayToReturn[0] * HUNDRED + arrayToReturn[1] * FIFTY + arrayToReturn[2] * TWENTY;
			if (sum == n) { // if true return the arrays 
				return arrayToReturn;
			} else {
				// take one FIFTY billet ,  breal down to TWENTY BILLET and add to TWENTY BILLET
				if (arrayToReturn[1] > 0) {
					arrayToReturn[1] -= 1;
					modulus_on_fifty += FIFTY;
					arrayToReturn[2] = modulus_on_fifty / TWENTY;
				} else if (arrayToReturn[0] > 0) { // take one HUNDRED BILLET, break down into FIFTY BILLET and to FIFTY BILLETS 
					arrayToReturn[0] -= 1;
					modulus_on_hundred += HUNDRED;
					arrayToReturn[1] = modulus_on_hundred / FIFTY;
				} else {
					// NOT SOLUTION to break down n , so the array will content 0
					for (int i = 0; i < arrayToReturn.length; i++) {
						arrayToReturn[i] = 0;
					}
					return arrayToReturn;
				}
			}
		}

	}

}
