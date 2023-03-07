package com.company;

public class printNos2 {
    public printNos2(int n)
    {
        if(n==0)
            return;
        System.out.println(n + " ");
        new printNos2(n - 1);
        System.out.println(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(new printNos2(n));
    }
}
