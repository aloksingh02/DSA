package com.company;

public class printNos {
    public printNos(int n)
    {
        if(n==5)
            return;
        System.out.println(n + " ");
        new printNos(n - 1);
    }

    public static void main(String[] args) {
        int n= 10;
        System.out.println(new printNos(n));
    }
}
