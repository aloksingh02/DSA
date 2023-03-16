package com.company;

public class SEARCHING {
    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - 1) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        SEARCHING ob  = new SEARCHING();
        int arr[] = {2,3,20,10,40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n-1, x);
        if(result == -1)
            System.out.println("not present");
        else
            System.out.println("present");
    }
}
