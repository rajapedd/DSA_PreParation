package com.raja.array2D;

import java.util.Arrays;

public class TransposeOFMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6}};
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        transposeMatrix(arr);
      //  System.out.println(Arrays.deepToString(arr));

    }

    public static int[][] transposeMatrix(int[][] arr) {
        int row=arr.length;
        int col=arr[0].length;
        System.out.println(row+" "+col);
        int[][] retMatrix=new int[col][row];
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                //arr[j][i]=arr[i][j];
                System.out.println("Index :: ("+i+" "+j+")");
                System.out.println("value :: "+arr[i][j]);
                retMatrix[j][i]=arr[i][j];
            }

        }
        System.out.println(Arrays.deepToString(retMatrix));
        return retMatrix;
        //return new int[][] {};
    }
}

