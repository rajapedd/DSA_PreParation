package com.raja.OtherPrograms;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {7, 1, 5, 3, 6, 4};
		//7,8,13,16,22,26 Prefix sum will not work here.
		maxProfit(ar);
	}
	
	public static int maxProfit(int[] prices) {
		// TODO
		int profit = 0;
		int minPrice = Integer.MAX_VALUE;
		System.out.println("minPrice aa::" + minPrice);
		for (int price : prices) {
			
			if (price < minPrice) {
				
				minPrice = price;
				System.out.println("minPrice aa::" + minPrice);
			} else if ((price - minPrice) > profit) {
				profit = (price - minPrice);
			}
		}

		System.out.println("profit aa::" + profit);
		if (profit <= 0) {
			return 0;
		} else {
			return profit;
		}

	}

}
