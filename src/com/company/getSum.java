package com.company;

public class getSum {
     static int getSum(int n) {
        if(n==0)
            return 0;
        return getSum(n-1)*n;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(getSum(n-1)*n);
    }
}
