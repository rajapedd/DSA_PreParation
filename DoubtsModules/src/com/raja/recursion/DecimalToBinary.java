package com.raja.recursion;

public class DecimalToBinary {
    public static void main(String[] args) {
      int value=  decimalToBinary(13);
        System.out.println("Binary value ::"+value);
    }

    public static int decimalToBinary(int n){
        if(n==0){
        return 0;
        }
        System.out.println("n%2 value::"+n%2);
       // System.out.println("n/2 value::"+n/2);
        return n%2 + 10*decimalToBinary(n/2);
    }
}
