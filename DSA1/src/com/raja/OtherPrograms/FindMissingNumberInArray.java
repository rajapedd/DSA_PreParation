package com.raja.OtherPrograms;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray = {1,2,3,4,6};
		findMissingNumberInArray(myArray);
		

	}
	
	public   static int findMissingNumberInArray(int[] arr) {
		    // TODO
		    
		    int n=arr.length+1;
		    System.out.println("n::"+n);
		    int missingNumber=Integer.MIN_VALUE;
		    //Sum of n Natural Numbers
		    int totalSum= (n *(n+1))/2;
		    System.out.println("Total Sum::"+totalSum);
		    int prefSum=0;
		    for(int i=0;i<n-1;i++) {
		    	prefSum+=arr[i];
		    }
		    System.out.println("prefSum::"+prefSum);
		    System.out.println("Missing Number::"+(totalSum-prefSum));
		    return totalSum-prefSum;
		    
		  }

}
