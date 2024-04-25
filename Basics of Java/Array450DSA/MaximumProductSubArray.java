package Array450DSA;

import java.util.Scanner;

public class MaximumProductSubArray {
    public static long maxProduct(int[] arr, int n) {
        long maxi = Integer.MIN_VALUE;
        long prefix=1;
        long suffix = 1;
        for(int i=0;i<n;i++) {
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;

            prefix *= arr[i];
            suffix *=arr[n-i-1];

            maxi = Math.max(maxi, Math.max(prefix, suffix));
        }
        return maxi;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        long ans = maxProduct(arr, size);
    }
}
