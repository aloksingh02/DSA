package com.company;

public class fibonacci {
    public int fun(int n) {
        if(n==0)
            return 1;
        return (n*fact(n-1));
    }

    private int fact(int i) {
        return i;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(n);
    }
}
