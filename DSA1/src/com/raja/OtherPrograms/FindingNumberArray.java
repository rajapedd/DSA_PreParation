package com.raja.OtherPrograms;

public class FindingNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { 1, 2, 3, 4, 5, 6 };
		searchInArray(intArray, 6);
	}

	public static int searchInArray(int[] intArray, int valueToSearch) {
		int arrayNumber = 0;
		int n = intArray.length;
		if (intArray[arrayNumber] == valueToSearch) {
			return arrayNumber;
		}

		for (int i = 1; i < n; i++) {
			if (intArray[i] == valueToSearch) {
				arrayNumber = i;
				break;
			}
		}
		System.out.println("array Number ::" + arrayNumber);

		return arrayNumber;
	}

}
