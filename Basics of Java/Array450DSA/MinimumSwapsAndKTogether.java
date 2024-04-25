package Array450DSA;

import java.util.Scanner;

public class MinimumSwapsAndKTogether {
    public static void minimumswaps(int[] arr, int size, int k) {
        int count = 0;
        for (int i = 0; i < size; ++i) {
            if (arr[i] <= k)
                ++count;
        }

        int bad = 0;
        for (int i = 0; i < count; ++i) {
            if (arr[i] > k)
                ++bad;
        }

        int ans = bad;
        for (int i = 0, j = count; j < size; ++i, ++j) {

            if (arr[i] > k)
                --bad;

            if (arr[j] > k)
                ++bad;

            ans = Math.min(ans, bad);
        }
        System.out.println(ans);
    }
    //Find the minimum number of swaps required to bring all the numbers less than or equal to k together, i.e. make them a contiguous subarray.

    //Here doesnt matter where that subarray exist we have to just find out how many minimum subarray will required to bring all the numbers less than or equal to k together,

    //Note : We have to find less than or equal to k, that means total less than k values will be our sub array from the entire array, and within that subarray we have to find minimum swaps. When we required the swaps if within that subarray any elemts contain maximum of k,

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++) arr[i] = sc.nextInt();
        int k=sc.nextInt();
        minimumswaps(arr, size, k);
    }

}
