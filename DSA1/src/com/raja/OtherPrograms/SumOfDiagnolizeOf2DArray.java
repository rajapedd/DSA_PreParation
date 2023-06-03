package com.raja.OtherPrograms;

public class SumOfDiagnolizeOf2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
		sumDiagonalElements(array);
//		int[][] test; 
//		  test = new int[5][10];
//
//		  int row = test.length;
//		  int col = test[0].length;
//
//		  System.out.println(row);
//		  System.out.println(col);

	}

	
    public static int sumDiagonalElements(int[][] array) {
        int sum=0;
        System.out.println("Initial Sum ::"+sum);
        
//        for(int row=0; row<array.length;row++){
//            for(int col=0; col<array[0].length;col++) {
//            	if(row==col) {
//            		sum+=array[row][col];
//            	}
//            }
//        }
        
        int numRows = array.length;
        
        for (int i = 0; i < numRows; i++) {
        	 System.out.println("i val ::"+i);
            sum += array[i][i];
        }
        System.out.println("Final Sum ::"+sum);
        
        return sum;
    }

}
