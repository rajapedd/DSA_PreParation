package com.raja.OtherPrograms;

public class MaxProductOfTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {10,60,30,40,50};
		maxProduct(intArray);
	}
	
    public static String maxProduct(int[] intArray) {
        // TODO
    	int maxProduct=0;
    	String pairs="";
    	int n=intArray.length;
    
    	for(int i=0;i<n;i++) {
    		
    		for(int j=i+1;j<n;j++) {
    		int tempMax=intArray[i]*intArray[j];
    		
    		if(maxProduct<tempMax) {
    			maxProduct=tempMax;
    			pairs=Integer.toString(intArray[i])+","+Integer.toString(intArray[j]);
    		}
    		
    		}
    	
    	}
    	System.out.println("Max Product pair::"+pairs);
    	
    	return pairs;
    }

}
