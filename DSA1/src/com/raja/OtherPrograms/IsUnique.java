package com.raja.OtherPrograms;

public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1,2,3,4,5,6,3};
		boolean isUnique=isUnique(intArray);
		System.out.println("Is Unique ::"+isUnique);
	}
	
    public static boolean isUnique(int[] intArray) {
        // TODO
    	int n=intArray.length;
    	for(int i=0;i<n;i++) {
    		
    		for(int j=i+1;j<n;j++) {
    			
    			if(intArray[i]==intArray[j]) {
    				return false;
    			}
    			
    		}
    		
    	}
    	return true;
    }

}
