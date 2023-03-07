package com.company;

public class recurrsionSum {
    public static int recurrsionSum(int n)
    {
        if(n<=1)
            return n;
        return n + recurrsionSum(n - 1);
    }
    public static void main (String args[])
    {
        int n = 5;
        System.out.println(recurrsionSum(n));
    }
}
