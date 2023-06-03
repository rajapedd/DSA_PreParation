package com.raja.OtherPrograms;

import java.util.Arrays;

public class FirstSecondHighScoresInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
		findTopTwoScores(myArray);
	}

	
	  public static int[] findTopTwoScores(int[] array){
		    // TODO
		    int firstHeighest = Integer.MIN_VALUE;
		    int secondHeighest = Integer.MIN_VALUE;
		for(int score : array){
		    
		    if(score > firstHeighest){
		        secondHeighest=firstHeighest;
		        firstHeighest=score;
		    }else if(score>secondHeighest && score<firstHeighest){
		        secondHeighest=score;
		    }
		    
		}
	System.out.println("first heighest::"+firstHeighest);
	System.out.println("second heighest::"+secondHeighest);
		
		    return new int[]{firstHeighest,secondHeighest};
		    
		  }
}
