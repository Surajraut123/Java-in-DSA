package Array450DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountPairsofSum {
    //Given an array of N integers, and an integer K, the task is to find the number of pairs of integers in the array whose sum is equal to K.
    //Approach :
    /*
    * Create a map to store the frequency of each number in the array.
      Check if (K – arr[i]) is present in the map, if present then increment the count variable by its frequency.
      After traversal is over, return the count.
    *
    * */

    public static void pairSum(int[] arr, int size, int x) {
        Map<Integer, Integer> mp = new HashMap<>();
        int count=0;
        for (int i = 0; i < size; i++) {
            int tmp = x - arr[i]; // Potential source of the error
            if (mp.containsKey(tmp)) {
                count += mp.get(tmp);
            }
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println("Pair Sum : "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int target = sc.nextInt();
        for(int i=0;i<size;i++) arr[i] = sc.nextInt();

        pairSum(arr, size, target);
    }
}
