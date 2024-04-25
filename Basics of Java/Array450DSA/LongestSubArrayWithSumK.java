package Array450DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubArrayWithSumK {

    public static void longetSubArray(int[] arr, int size, int k) {
        int sum=0;
        int maxLength=0;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<size;i++) {
            sum += arr[i];
            if(sum == k) {
                maxLength = Math.max(maxLength, i+1);
            }
            int reverse = sum - k;
            if(mp.containsKey(reverse)) {
                maxLength = Math.max(maxLength, i - mp.get(reverse));
            }
            if(!mp.containsKey(sum)) {
                mp.put(sum, i);

                
            }
        }
        System.out.println("Max SubArray Length : " + maxLength);

    }

    public static void twoPointers(int[] arr, int size, int k) {
        int left=0;
        int right=0;
        int sum=0;
        int maxLength=0;
        while(right < size) {
            while(left <= right && sum> k) {
                sum -= arr[left];
                left++;
            }
            if(sum == k) maxLength = Math.max(maxLength, right-left+1);
            sum += arr[right];
            right++;
        }
        System.out.println("Max SubArray Length : " + maxLength);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int k = sc.nextInt();
        for(int i=0;i<size;i++) arr[i] = sc.nextInt();


        //Optimized Approach will work for -ve, +ve and 0
//        longetSubArray(arr, size, k);

        //Better Solution for +ve and zeros two pointers approach
        twoPointers(arr, size, k);
    }
}
