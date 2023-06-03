package com.raja.OtherPrograms;

public class PermutationOfGivenTwoIntegerArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {5,1,2,3,4,6};
		permutation(array1,array2);
	}
	  public static boolean permutation(int[] array1, int[] array2){
	        // TODO
		  boolean permutation=false;
		  int sum1=0,sum2=0,mul1=1,mul2=1;
		  if(array1.length != array2.length) {
			  System.out.println("permutation ::"+permutation);
			  return permutation;
		  }
		  
		  for(int i=0;i<array1.length;i++) {
			  sum1 +=array1[i];
			  sum2 +=array2[i];
			  mul1 *=array1[i];
			  mul2 *=array2[i];
			  
		  }
		  System.out.println("sum1 ::"+sum1);
		  System.out.println("sum2 ::"+sum2);
		  System.out.println("mul1 ::"+mul1);
		  System.out.println("mul2 ::"+mul2);
		  if(sum1==sum2 && mul1==mul2) {
			  permutation=true;
		  }
		  System.out.println("Permutation ::"+permutation);
		  return permutation;
		  
		  
	    }
}
