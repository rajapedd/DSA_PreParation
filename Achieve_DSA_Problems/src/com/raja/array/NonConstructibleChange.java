package com.raja.array;

import java.util.Arrays;

public class NonConstructibleChange {
    public static void main(String[] args) {
      // int ar[] = {5, 7, 1, 1, 2, 3, 22};
//int ar[]={6, 4, 5, 1, 1, 8, 9};
        //int ar[] = {1,2,5};
        int ar[] = {1,1,1,1,1};
        int minChange=nonConstructibleChange(ar);
        System.out.println("Minimum Change ::"+minChange);
    }

    public static int nonConstructibleChange(int[] coins) {
        if (coins.length == 0) {
            return 1;
        }

        Arrays.sort(coins);
        int minChange=0;

        for (int i = 0; i < coins.length; i++) {
            if(minChange+1 < coins[i]){
                break;
            }
            minChange+=coins[i];
        }


            return minChange+1;

}
}
