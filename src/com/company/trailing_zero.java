package com.company;
public class trailing_zero {
    static int trailing_zero(int n){
        int res = 0;
        for(int i=5; i<=5; i=i*5){
            res = res + n/i;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 56;
        System.out.println("trailing zero is: " + trailing_zero(n));
    }
}
